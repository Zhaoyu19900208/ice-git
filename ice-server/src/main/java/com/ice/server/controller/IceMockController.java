package com.ice.server.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ice.common.constant.Constant;
import com.ice.core.context.IcePack;
import com.ice.server.model.WebResult;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zjn
 */

@RestController
public class IceMockController {

  @Resource
  private AmqpTemplate amqpTemplate;

  @RequestMapping(value = "/ice/amqp/mock", method = RequestMethod.POST)
  public WebResult amqpMock(@RequestParam Integer app, @RequestBody IcePack pack) {
    if (app <= 0 || pack == null) {
      return new WebResult<>(-1, "参数不正确", null);
    }
    if (pack.getIceId() <= 0 && StringUtils.isEmpty(pack.getScene())) {
      return new WebResult<>(-1, "IceId和Scene不能同时为空", null);
    }
    amqpTemplate.convertAndSend(Constant.getMockExchange(), String.valueOf(app),
        JSON.toJSONString(pack, SerializerFeature.WriteClassName));
    return new WebResult<>();
  }

  @RequestMapping(value = "/ice/amqp/mocks", method = RequestMethod.POST)
  public WebResult amqpMocks(@RequestParam Integer app, @RequestBody List<IcePack> packs) {
    if (app <= 0 || CollectionUtils.isEmpty(packs)) {
      return new WebResult<>(-1, "参数不正确", null);
    }
    WebResult<List<IcePack>> result = new WebResult<>();
    List<IcePack> errPacks = new ArrayList<>();
    for (IcePack pack : packs) {
      if (pack.getIceId() <= 0 && StringUtils.isEmpty(pack.getScene())) {
        errPacks.add(pack);
        continue;
      }
      amqpTemplate.convertAndSend(Constant.getMockExchange(), String.valueOf(app),
          JSON.toJSONString(pack, SerializerFeature.WriteClassName));
    }
    result.setData(errPacks);
    return result;
  }
}

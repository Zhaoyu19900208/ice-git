package com.ice.server.config;

import com.ice.common.constant.Constant;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zjn
 */
@Configuration
public class RabbitMqConfig {
  @Bean
  public DirectExchange updateExchange() {
    return new DirectExchange(Constant.getUpdateExchange());
  }

  @Bean
  public DirectExchange showConfExchange() {
    return new DirectExchange(Constant.getShowConfExchange());
  }

  @Bean
  public Object configRabbitTemplate(RabbitTemplate rabbitTemplate){
    //FIXME
    rabbitTemplate.setUseDirectReplyToContainer(false);
    return null;
  }
}

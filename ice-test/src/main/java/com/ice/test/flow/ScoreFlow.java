package com.ice.test.flow;

import com.ice.core.context.IceRoam;
import com.ice.core.leaf.roam.BaseLeafRoamFlow;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author zjn
 * 取出roam中的值比较大小
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ScoreFlow extends BaseLeafRoamFlow {

  private double score;

  private String key;

  /**
   * 叶子节点流程处理
   *
   * @param roam
   * @return
   */
  @Override
  protected boolean doRoamFlow(IceRoam roam) {
    Object value = roam.getMulti(key);
    if (value == null) {
      return false;
    }
    double valueScore = Double.parseDouble(value.toString());
    return !(valueScore < score);
  }
}

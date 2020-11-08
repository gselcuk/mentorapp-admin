package com.obss.mentor.admin.constant;

import java.util.Map;
import com.google.common.collect.Maps;

public enum AdminObjectType {

  EXPERTISE(1, "EXP");

  private int id;
  private String label;

  private static final Map<String, Integer> BY_LABEL = Maps.newHashMap();

  static {
    BY_LABEL.put(EXPERTISE.label, EXPERTISE.id);
  }


  AdminObjectType(int id, String label) {
    this.id = id;
    this.label = label;
  }

  public int id() {
    return id;
  }

  public String label() {
    return label;
  }

  public static Integer valueOfLabel(String label) {
    return BY_LABEL.get(label);
  }


}

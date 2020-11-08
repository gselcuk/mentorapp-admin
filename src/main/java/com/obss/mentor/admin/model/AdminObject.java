package com.obss.mentor.admin.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 
 * @author Goktug Selcuk
 *
 */
@Table(name = "admin_objects")
@Entity
@Data
public class AdminObject {

  @Id
  private int id;
  private String object;
  private String objectType;

}

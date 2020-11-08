package com.obss.mentor.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.obss.mentor.admin.constant.AdminObjectType;
import com.obss.mentor.admin.model.AdminObject;
import com.obss.mentor.admin.repository.AdminObjectRepository;

/**
 * Admin services for mentorapp.
 * 
 * @author Goktug Selcuk
 *
 */
@Service
public class AdminService {
  @Autowired
  private AdminObjectRepository adminObjectRepository;

  /**
   * Set expertise
   * 
   * @param expertise
   * @return
   */
  public AdminObject setAdminObject(AdminObject adminObject) {
    adminObject.setId(AdminObjectType.valueOfLabel(adminObject.getObjectType()));
    return adminObjectRepository.save(adminObject);
  }

}

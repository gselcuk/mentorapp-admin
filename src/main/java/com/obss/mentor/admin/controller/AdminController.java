package com.obss.mentor.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.obss.mentor.admin.model.AdminObject;
import com.obss.mentor.admin.service.AdminService;

@RestController
@RequestMapping(value = "admin")
public class AdminController {

  @Autowired
  private AdminService adminService;
  
  /**
   * Authenticate service.
   * 
   * @return
   */
  @PostMapping(value = "/set-admin-object")
  public AdminObject setAdminObject(@RequestBody AdminObject adminObject) {
    return adminService.setAdminObject(adminObject);
  }
  
  
}

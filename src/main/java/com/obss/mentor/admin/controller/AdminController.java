package com.obss.mentor.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
   * 
   * @param adminObject
   * @return
   */
  @PostMapping(value = "/set-admin-object")
  public AdminObject setAdminObject(@RequestBody AdminObject adminObject) {
    return adminService.setAdminObject(adminObject);
  }

  /**
   * 
   * @param objectType
   * @return
   */
  @GetMapping("/get-admin-object/{objectType}")
  public AdminObject getAdminObject(@PathVariable String objectType) {
    return adminService.getAdminObject(objectType);
  }


}

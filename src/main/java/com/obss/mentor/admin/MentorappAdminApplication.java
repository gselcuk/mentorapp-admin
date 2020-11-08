package com.obss.mentor.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @author Goktug Selcuk
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MentorappAdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(MentorappAdminApplication.class, args);
  }

}

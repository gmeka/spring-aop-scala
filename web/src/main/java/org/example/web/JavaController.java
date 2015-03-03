package org.example.web;

import org.example.service.JavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JavaController
{
  @Autowired
  private JavaService service;

  @RequestMapping("/java")
  public String home()
  {
    service.getAllDepartments();

    return "java";
  }
}

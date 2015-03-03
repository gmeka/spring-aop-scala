package org.example.web

import org.example.service.ScalaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class ScalaController {
  @Autowired
  private[this] var service: ScalaService = _

  @RequestMapping(Array("/scala"))
  def home(): String = {
    service.getAllDepartments

    "scala"
  }
}

package org.example.service

import org.example.data.DepartmentRepository
import org.example.diagnostics.{LogMetadata, Loggable}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.{Propagation, Transactional}

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
class ScalaService extends Loggable {
  protected def meta = ScalaService

  @Autowired
  private[this] var departmentRepository: DepartmentRepository = _

  @Transactional
  def getAllDepartments = departmentRepository.findAll
}

protected object ScalaService extends LogMetadata[ScalaService]

package org.example.diagnostics

import org.slf4j.LoggerFactory

trait LogMetadata[+Loggable] {
  self =>
  lazy val logger = LoggerFactory.getLogger(getClass)
}

trait Loggable {
  protected def meta: LogMetadata[Loggable]

  protected def debug(message: String) = meta.logger.debug(message)

  protected def debug(format: String, values: Any*) = meta.logger.debug(format, values.toArray.map(_.asInstanceOf[Object]): _*)

  protected def error(message: String) = meta.logger.error(message)

  protected def error(format: String, values: Any*) = meta.logger.error(format, values.toArray.map(_.asInstanceOf[Object]): _*)

  protected def error(message: String, throwable: Throwable) = meta.logger.error(message, throwable)

  protected def info(message: String) = meta.logger.info(message)

  protected def info(format: String, values: Any*) = meta.logger.info(format, values.toArray.map(_.asInstanceOf[Object]): _*)

  protected def warn(message: String) = meta.logger.warn(message)

  protected def warn(format: String, values: Any*) = meta.logger.warn(format, values.toArray.map(_.asInstanceOf[Object]): _*)

  protected def warn(message: String, throwable: Throwable) = meta.logger.warn(message, throwable)
}

package controller

import play.api.mvc.{Action, AnyContent}

trait UserController {
  def findById(): Action[AnyContent]
}

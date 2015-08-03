package controllers

import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, Controller}
import controller._

/**
 * Created by aswarcewicz on 03.08.15
 */
class UserControllerImpl extends Controller with UserController {

  override def findById(): Action[AnyContent] = Action {
    Ok(Json.parse( """
{
  "user": {
    "name" : "toto",
    "age" : 25,
    "email" : "toto@jmail.com",
    "isAlive" : true,
    "friend" : {
  	  "name" : "tata",
  	  "age" : 20,
  	  "email" : "tata@coldmail.com"
    }
  }
}
                   """))
  }
}

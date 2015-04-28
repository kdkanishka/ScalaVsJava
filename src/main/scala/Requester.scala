/**
 * Created by kanishka on 4/27/15.
 */
class Requester {
  val handler = new Handler

  def printMe(txt: String): Unit = {
    handler.doIt(txt)
  }
}

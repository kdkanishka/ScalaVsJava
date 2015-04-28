/**
 * Created by kanishka on 4/27/15.
 */

import scala.io.Source

class Handler {
  def doIt(msg: String) {
    val html = Source.fromURL("http://google.com/?q=" + msg)
    val s = html.mkString
    println(s)
  }
}

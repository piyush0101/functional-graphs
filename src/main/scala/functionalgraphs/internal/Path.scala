package functionalgraphs.internal

import collection.mutable.LinkedList

/**
 * Created by IntelliJ IDEA.
 * User: piyush
 * Date: 7/23/12
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */

class Path
{
  var nodes = new LinkedList[Node]()

  def addNode(n : Node)
  {
    nodes = nodes :+ n
  }

  def getNodes = nodes
}
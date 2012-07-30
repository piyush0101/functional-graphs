package functionalgraphs.internal

/**
 * Created by IntelliJ IDEA.
 * User: piyush
 * Date: 7/23/12
 * Time: 10:39 PM
 * To change this template use File | Settings | File Templates.
 */

class Edge(n1: Node, n2: Node, weight: Int)
{
  def getN1: Node = n1
  def getN2: Node = n2
  def getWeight = weight
}
package functionalgraphs.internal

import collection.mutable.LinkedList

class DirectedGraph {
  var nodes = new LinkedList[Node]()
  var edges = new LinkedList[Edge]()

  def addEdge(n1: Node, n2: Node, weight: Int) {
    val edge = new Edge(n1, n2, weight)
    if (!nodes.contains(n1)) nodes = nodes :+ n1
    if (!nodes.contains(n2)) nodes = nodes :+ n2
    edges = edges :+ edge
  }

  def getNodes = nodes.toList
  def getEdges = edges.toList
}
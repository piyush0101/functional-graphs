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

  def adjacencyMatrix(): Array[Array[Int]] = {
    val adjacencyMatrix: Array[Array[Int]] = Array.fill[Int](nodes.size, nodes.size) {
      Integer.MAX_VALUE
    }

    for (i <- 0 to nodes.size) {
      for (j <- 0 to edges.size if edges(j).getN1.equals(nodes(i))) {
        adjacencyMatrix(i).update(nodes.indexWhere(_.equals(edges(j).getN2)), edges(j).getWeight)
      }
    }

    return adjacencyMatrix
  }

  def findWeightOfPath(path: Path): Int = {
    val pathNodes = path.getNodes
    return pathNodes.sliding(2).foldLeft(0)(weight)
  }

  def weight(w: Int, list: LinkedList[Node]) : Int =
  {
     edges.find((e:Edge) => (e.getN1.equals(list(0)) && e.getN2.equals(list(1)))) match
     {
       case Some(e) => return w + e.getWeight
       case None => return Integer.MIN_VALUE
     }
  }
}
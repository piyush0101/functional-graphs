package functionalgraphs.internal

import collection.mutable.LinkedList

/**
 * Created by IntelliJ IDEA.
 * User: piyush
 * Date: 7/30/12
 * Time: 10:17 PM
 * To change this template use File | Settings | File Templates.
 */

object DirectedGraphOperations {
  def adjacencyMatrix(nodes: List[Node], edges: List[Edge]): Array[Array[Int]] = {
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

  def findWeightOfPath(path: Path, nodes: List[Node], edges: List[Edge]): Int = {
    val pathNodes = path.getNodes
    val weight = (w: Int, list: LinkedList[Node]) =>
          edges.find((e: Edge) => (e.getN1.equals(list(0)) && e.getN2.equals(list(1)))) match {
            case Some(e) => w + e.getWeight
            case None => Integer.MIN_VALUE
      }
    return pathNodes.sliding(2).foldLeft(0)(weight)
   }
}
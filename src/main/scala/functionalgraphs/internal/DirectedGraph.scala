package functionalgraphs.internal

import java.util.LinkedList
import collection.immutable.Queue

class DirectedGraph
{
  val nodes = List()
  val edges = List()

  def addEdge(n1: Node, n2: Node)
  {
    val edge = new Edge(n1, n2)
    n1 :: n2 :: nodes
    edge :: edges
  }

  def adjacencyList() : List[List[Int]] = null

  def breadthFirstSearch(fValid: List[Path] => Boolean, fActual: List[Path] => List[Path]): List[Path] =
   val queue = new Queue
   val first = nodes.head
   first :: queue

   fValid()
 }
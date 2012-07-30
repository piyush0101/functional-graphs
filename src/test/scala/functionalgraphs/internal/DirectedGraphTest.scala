package functionalgraphs.internal

import junit.framework.{TestCase, TestSuite, Test}
import junit.framework.Assert._
import functionalgraphs.internal._

/**
 * Created by IntelliJ IDEA.
 * User: piyush
 * Date: 7/29/12
 * Time: 7:21 PM
 * To change this template use File | Settings | File Templates.
 */

object DirectedGraphTest {
  def suite: Test = {
    val suite = new TestSuite(classOf[DirectedGraphTest]);
    suite
  }

  def main(args: Array[String]) {
    junit.textui.TestRunner.run(suite);
  }
}

/**
 * Unit test for simple App.
 */
class DirectedGraphTest extends TestCase("app") {

  /**
   * Rigourous Tests :-)
   */
  def testOK() = assertTrue(true);

  def testKO() = assertTrue(false);

  def testFindWeightOfPath() =
  {
    val A = new Node("A")
    val B = new Node("B")
    val C = new Node("C")
    val D = new Node("D")
    val E = new Node("E")

    val graph = new DirectedGraph
    graph.addEdge(A, B, 5)
    graph.addEdge(B, C, 2)
    graph.addEdge(C, D, 5)
    graph.addEdge(D, E, 3)

    val path = new Path
    path.addNode(A)
    path.addNode(B)
    path.addNode(C)

    val weight = graph.findWeightOfPath(path)
    assertEquals(7, weight)
  }
}

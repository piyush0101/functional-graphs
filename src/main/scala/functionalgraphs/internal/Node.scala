package functionalgraphs.internal

/**
 * Created by IntelliJ IDEA.
 * User: piyush
 * Date: 7/23/12
 * Time: 10:39 PM
 * To change this template use File | Settings | File Templates.
 */

class Node(label: String) {
  def getLabel: String = label

  override def equals(obj: Any):Boolean = {
    obj match {
      case obj:Node => this.label.equals(obj.getLabel)
      case _ => false
    }
  }

  override def hashCode() = 0
}
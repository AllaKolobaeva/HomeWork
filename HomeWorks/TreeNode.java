 */
public class TreeNode {

    public int data;
    public TreeNode next;
    int value;
    private Object nextRight;
    private Object nextLeft;
    private Object middle;

    public TreeNode(int data, Object nextLeft, Object nextRight) {
        data = data;
        nextLeft = null;
        nextRight = null;
    }

    public void setData(int d) {
        data = d;
    }

    public Integer getData() {
        return data;
    }

    public void setNextLeft(TreeNode n, TreeNode nextLeft) {
        nextLeft = n;
    }

    public TreeNode getNextLeft(TreeNode nextLeft) {
        return nextLeft;
    }

    public void setNextRight(TreeNode n, TreeNode nextRight) {
        nextRight = n;
    }

    public TreeNode getNextRight(TreeNode nextRight) {
        return nextRight;
    }

    public void add(TreeNode aTree) {

        if (nextLeft == null) {
            nextLeft = aTree;
        } else if (middle == null) {
            middle = aTree;
        } else if (nextRight == null) {
            nextRight = aTree;
        } else if (nextLeft != null) {
            nextLeft.add(aTree);
        } else if (middle != null) {
            middle.add(aTree);
        } else if (nextRight != null) {
            nextRight.add(aTree);
        }

    }

    public void obhod() {

        if (nextLeft != null) {
            nextLeft.obhod();
        }

        if (middle != null) {
            middle.obhod();
        }
        if (nextRight != null) {
            nextRight.obhod();
        }
    }

    public static void main(String[] args) {
        TreeNode subTreeW = new TreeNode(0);
        subTreeW.add(new TreeNode(45));
        subTreeW.add(new TreeNode(45));
        subTreeW.add(new TreeNode(5));

        TreeNode subTreeE = new TreeNode(4);
        subTreeE.add(subTreeW);
        subTreeE.add(new TreeNode(1));
        subTreeE.add(new TreeNode(7));

        TreeNode subTreeA = new TreeNode(67);
        subTreeA.add(subTreeE);
        subTreeA.add(new TreeNode(45));
        subTreeA.add(new TreeNode(5));

        TreeNode subTreeF = new TreeNode(72);
        subTreeF.add(new TreeNode(50));
        subTreeF.add(new TreeNode(52));
        subTreeF.add(new TreeNode(53));

        TreeNode subTreeB = new TreeNode(5);
        subTreeB.add(new TreeNode(30));
        subTreeB.add(subTreeNodeF);
        subTreeB.add(new TreeNode(45));

        TreeNode subTreeC = new TreeNode(12);
        subTreeC.add(new TreeNode(14));
        subTreeC.add(new TreeNode(95));
        subTreeC.add(new TreeNode(45));

        TreeNode myTree = new TreeNode(90);
        myTree.add(subTreeA);
        myTree.add(subTreeB);
        myTree.add(subTreeC);

        myTree.obhod();

    }
}


public void bfs() {
ArrayList<TreeNode> a = new ArrayList<TreeNode>();
a.add(this);
TreeNode tn = new TreeNode((Integer) null);
while (!a.isEmpty()) { //пока очередь не пуста, будем работать с деревом
tn = a.remove(0); //достаем из очереди первую вершину
if (tn.left != null) //если есть левый потомок, добавляем его
a.add(tn.left);
if (tn.right != null) //то же самое для правого
a.add(tn.right);

}

}


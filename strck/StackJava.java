/**
 * StackJava
 */
public class StackJava {
    NodeStack top;
    NodeStack bottom;

    public void pushElement(int data) {
        NodeStack node = new NodeStack(data);
        if (top == null) {
            top = node;
            bottom = node;
        } else {
            node.next = top;
            top = node;
        }

    }

    public void popElement() {
        if (top == null) {
            System.out.println("your stack is empty....!");
        } else {
            top = top.next;
        }
    }

    public void getAll() {
        if (top == null) {
            System.out.println("add element to view your stack is empty....");
        } else {
            NodeStack currNodeStack = top;
            System.out.println("top element :" + top.data + " and bottom element :" + bottom.data);
            while (currNodeStack != null) {

                System.out.println(currNodeStack.data);
                currNodeStack = currNodeStack.next;
            }
        }

    }

    public static void main(String[] args) {
        StackJava stack = new StackJava();
        

    }
}
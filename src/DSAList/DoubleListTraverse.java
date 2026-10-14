package DSAList;

public class DoubleListTraverse {

    public void printFromBeg(DoubleListNode node) {
        while (node.prev != null) {
            node = node.prev;
        }

        while (node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("null");
    }

    public void printFrontEnd(DoubleListNode node) {
        // Move to the last node
        while (node.next != null) {
            node = node.next;
        }

        // Print from the last node to the first node
        while (node != null) {
            System.out.print(node.val + "->");
            node = node.prev;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {

        DoubleListNode first = new DoubleListNode(10);
        DoubleListNode second = new DoubleListNode(20);
        DoubleListNode third = new DoubleListNode(30);
        DoubleListNode fourth = new DoubleListNode(40);

        // Connect nodes forward and backward
        first.next = second;

        second.prev = first;
        second.next = third;

        third.prev = second;
        third.next = fourth;

        fourth.prev = third;

        DoubleListTraverse obj = new DoubleListTraverse();

        System.out.println("Forward Traversal:");
        obj.printFromBeg(third);

        System.out.println("Backward Traversal:");
        obj.printFrontEnd(third);
    }
}
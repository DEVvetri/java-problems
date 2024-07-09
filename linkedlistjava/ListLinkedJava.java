package linkedlistjava;

import java.util.Scanner;

public class ListLinkedJava {
    static Node head;
    static Node tail;

    // add last
    public void insertLast(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = head;
        }

        else {
            tail.next = node;
            tail = node;
        }

    }

    // add first
    public void insertFirst(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = head;
        }

        else {
            node.next = head;
            head = node;
        }
    }

    public void insertAt(int at, int data) {
        int index = 1;
        Node temp = head;

        if (at > getSizeValue()) {
            System.out.println("index is above the size of list");
        } else if (at == 0) {

            insertFirst(data);
            System.out.println();

            System.out.println("after insertion");
            getElement();
        } else if (at == getSizeValue()) {

            insertLast(data);
            System.out.println();

            System.out.println("after insertion");
            getElement();
        } else {

            while (index < at) {
                temp = temp.next;
                index += 1;
            }
            Node node = new Node(data);
            Node ref = temp.next;
            temp.next = node;
            node.next = ref;
            System.out.println();

            System.out.println("after inserting element " + data + " at index " + at);
            getElement();
        }

    }

    public void deleteElement(int data) {
        Node temp = head;
        Node prev = null;
        if (head.data == data) {
            head = head.next;
            System.out.println("after deleting element " + data + " at index 0");
        } else if (tail.data == data) {
            int count = 0;
            while (temp.next != null) {
                Node currNode = temp;
                temp = temp.next;
                prev = currNode;
                count++;
            }
            System.out.println("after deleting element " + data + " at index " + count);

        } else {

            temp = head;
            Node nextNode = null;
            while (temp.data != data) {
                          
                prev = temp;
                nextNode = temp.next.next;

            }

            prev.next = nextNode;

        }

    }

    public void reverseList() {

        Node pre = null;
        Node curretNode = head;
        while (curretNode != null) {
            Node next = curretNode.next;
            curretNode.next = pre;
            pre = curretNode;
            curretNode = next;

        }
        head = pre;
        System.err.println();
        System.err.println("reversed list");
        getElement();
    }

    public void findElement(int which) {
        Node current = head;
        int index = 0;
        boolean isfound = false;
        while (current != null) {
            if (current.data == which) {
                isfound = true;
                break;
            } else {
                isfound = false;
                current = current.next;
            }
            index += 1;
        }
        if (isfound) {
            System.out.println(which + " is at in the index of-" + index);
        } else {
            System.out.println("element not founded");
        }
    }

    // get size
    public void getSize() {

        Node temp = head;
        int count = 0;
        while (temp != null) {

            temp = temp.next;
            count += 1;
        }
        ;
        System.out.println("Size of your list is: " + count);
    }

    // return value size
    public static int getSizeValue() {

        Node temp = head;
        int count = 0;
        while (temp != null) {

            temp = temp.next;
            count += 1;
        }
        ;
        return count;

    }

    // get Element
    public static void getElement() {
        Node temp = head;
        int i = 1;
        while (temp != null) {
            System.out.println("Element at position of " + (i - 1) + "-   " + temp.data);
            temp = temp.next;
            i += 1;
        }
        ;
    }

    public static void main(String[] args) {
        ListLinkedJava list = new ListLinkedJava();
        // char handler = sc.next().charAt(0);
        for (int i = 21; i <= 25; i++) {
            list.insertLast(i);
        }
        list.insertAt(4, 2000);
        list.deleteElement(24);
        list.getElement();

    }
}

// while (true) {
// Scanner sc = new Scanner(System.in);
// System.out.println(
// "to add element press-'1' \nto add element at first press-'2' \nget size of
// list press-'s' \nget elemenys of list press-'e' \nto quit press-'q'");

// if (handler == '1') {
// System.out.println("enter the data to add at last:");
// int data = sc.nextInt();
// list.addLast(data);
// }
// if (handler == '2') {
// System.out.println("enter the data to add at first:");
// int data = sc.nextInt();
// list.addFirst(data);
// }
// if (handler == 's') {
// list.getSize();
// }
// if (handler == 'e') {
// list.getElement();
// }
// if (handler == 'q') {
// break;
// } else {
// break;
// }
// }
// sc.close();
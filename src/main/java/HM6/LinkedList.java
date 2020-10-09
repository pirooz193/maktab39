package HM6;

public class LinkedList {


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(5);
        linkedList.add(2, 3);
        linkedList.add(3, 8);
        linkedList.add(4, 6);
        linkedList.add(5, 10);
        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.delete(3));
        System.out.println(linkedList);
        System.out.println(linkedList.search(3));
    }


    private Node first = null;


    public LinkedList(int first) {
        this.first = new Node(first);
    }
    public boolean isEmpty() {
        return first == null;
    }


    public void add(int index, int v) {
        Node temp = new Node(v);
        Node current = first;
        for (int i = 1; i < index - 1 && current.next != null; i++) {
            current = current.next;
        }
        temp.next = current.next;
        current.next = temp;
    }


    public int delete(int index) {
        Node current = first;
        Node previous = null;
        for (int i = 1; i < index  && current.next != null; i++) {
            previous = current;
            current = current.next;
        }
        int v = current.value;
        previous.next = current.next;
        return v;
    }

    public int search(int index) {
        Node current = first;
        for (int i = 0; i < index -1&& current.next != null; i++) {
            current = current.next;
        }
        int v = current.value;
        return v;
    }


    public String toString() {
        Node current = first;
        String str = "[ " + first.value + " ";
        while (current.next != null) {
            current = current.next;
            str = str + current.value + " ";
        }
        str = str + " ]";
        return str;
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

}

package practice;

public class LinkedList {

    /**
     *     linked list elements are not stored at the contiguous location, the elements are linked using pointers
     */

    Node head; // head node

    // each node will have data and next element reference

    static class Node{

        int data;
        Node next;

        // constructor

        Node(int element){
            data = element;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data){

        // create new node with given data

        Node new_node = new Node(data);
        new_node.next = null;

        if(list.head == null){
            list.head = new_node;
        } else {
            // traverse list till end and insert

            Node last = list.head;
            while (last.next != null){
                last = last.next;
                // System.out.println(last.data);
            }
            last.next=new_node;
        }

        return list;
    }

    public static void print(LinkedList list){

        // start with head node

        Node current_node = list.head;
        while (current_node != null){
            System.out.println(current_node.data + " ");
            current_node = current_node.next;
        }
    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);

        print(list);
    }


}

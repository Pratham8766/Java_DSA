package LinkedList;

public class LL {

    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }


    //1. Add
    //Add first

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Add Last
    public void addLast(String data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //2. Printing the list
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println(" NULL ");
    }

    //3. Delete 
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty. We cannot delete first");
            return;
        }

        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty. We cannot delete from last");
        }

        //only one element in the linked list
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("Pratham");
        list.addFirst("is");
        list.addLast("Good?");
        list.printList();

        list.deleteFirst();
        list.deleteLast();
        list.printList();
    }
}

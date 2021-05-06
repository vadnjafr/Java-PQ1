package countries;

public class DoublyLinkedList<E>
{
    //Initially, head and tail is set to null
    Node head, tail = null;
    //A node class for doubly linked list

    class Node<T>
    {
        T data;
        Node previous;
        Node next;

        public Node(T data)
        {
            this.data = data;
        }
    }

    public <T> void addFirst(T data)
    {
        //Create a new node
        Node newNode = new Node(data);

        //If list is empty
        if(head == null)
        {
            //Both head and tail will point to newNode
            head = tail = newNode;
            //head's previous will point to null
            head.previous = null;
            //tail's next will point to null, as it is the last node of the list
            tail.next = null;
        }
        else
        {
            //newNode will be added before head such that heads's previous will point to newNode
            head.previous = newNode;
            //newNode's next will point to head
            newNode.next = head;
            //newNode will become new head
            head = newNode;
            //As it is first node, heads's previous will point to null
            head.previous = null;
        }
    }
    //addNode() will add a node to the list
    public <T> void addLast(T data)
    {
        //Create a new node
        Node newNode = new Node(data);

        //If list is empty
        if(head == null)
        {
            //Both head and tail will point to newNode
            head = newNode;
            tail = newNode;
            //head's previous will point to null
            head.previous = null;
            //tail's next will point to null, as it is the last node of the list
            tail.next = null;
        }
        else
        {
            //As it is last node, tail's next will point to null
            newNode.next = null;
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode's previous will point to tail
            newNode.previous = tail;
            tail = newNode;
        }
    }

   /**
     * this method walks forward through the linked list
     */
   public void iterateForward()
   {

        System.out.println("iterating forward..");
        Node country = head;
       while(country.next != null)
        {
            System.out.println(country.data);
            country = country.next;
        }
       System.out.println(country.data);
   }

}

public class LinkedList{
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node firstNode = new Node(val);
        if(tail==null){
            tail = head;
        }

        firstNode.next = head;
        head = firstNode;
        size++;
    }

    public void insertLast(int val){
        Node lastNode = new Node(val);
        if(tail==null){
            head = lastNode;
        } else {
            tail.next = lastNode;
        }
        tail = lastNode;
        size++;
    }

    public void insertPos(int val, int index){
        if(index==0){
            insertFirst(val);
        } else if(index==size){
            insertLast(val);
        } else {
            Node temp = head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            Node currNode = new Node(val,temp.next);
            temp.next = currNode;
            size++;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertLast(3);
        list.insertLast(5);
        list.insertLast(8);
        list.insertLast(19);
        list.insertPos(20, 3);
        list.display();
        System.out.println("Length of linked list: " + list.size);
    }
}
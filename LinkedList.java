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

    public void removeDuplicates(){
        Node node = head;
        if(head==null){
            return;
        }
        while(node.next!=null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public void merge(LinkedList first, LinkedList second){
        Node f = first.head;
        Node s = second.head;

        while(f!=null && s!=null){
            if(f.value < s.value){
                this.insertLast(f.value);
                f = f.next;
            } else {
                this.insertLast(s.value);
                s = s.next;
            }
        }

        while(f!=null){
            this.insertLast(f.value);
            f = f.next;
        }

        while(s!=null){
            this.insertLast(s.value);
            s = s.next;
        }
    }

    public void addList(LinkedList first, LinkedList second){
        Node f = first.head;
        Node s = second.head;

        while(f!=null){
            this.insertLast(f.value + s.value);
            f = f.next;
            s = s.next;
        }
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
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);
        list.removeDuplicates();
        list.display();
        System.out.println("Length of linked list: " + list.size);

        LinkedList first = new LinkedList();
        LinkedList second = new LinkedList();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        first.insertLast(7);
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
        LinkedList mergedList = new LinkedList();
        mergedList.merge(first, second);
        mergedList.display();

        LinkedList addedList = new LinkedList();
        addedList.addList(first, second);
        addedList.display();
    }
}
class lenofcycle{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data; 
        }
    }
    public void addcirc(){
        Node newnode1 = new Node(1);
        Node newnode2 = new Node(2);
        Node newnode3 = new Node(3);
        Node newnode4 = new Node(4);
        Node newnode5 = new Node(5);
   
        head = newnode1;
        head.next = newnode2;
        newnode2.next = newnode3;
        newnode3.next = newnode4;
        newnode4.next = newnode5;
        newnode5.next = newnode3;

    }
    public void findsize(){
        Node fast = head;
        Node slow = head;
        int size=0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                do{
                    size++;
                    slow = slow.next;
                    

                }while(slow!=fast);
                break;
            }
        }
        System.out.println(size);
    }
    public static void main(String[] args){
        lenofcycle ll = new lenofcycle();
        ll.addcirc();
        ll.findsize();


    }
}
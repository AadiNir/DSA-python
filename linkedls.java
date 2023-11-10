class linkedls{
    Node head;
    private int size;
    linkedls(){
        this.size = 0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // add element in the first pos
    public void addfirst(int data){
        Node newnode = new Node(data);
                size++;

        if(head == null){
            head = newnode;
            return;
        }
       newnode.next = head;
        head = newnode;
    }
    //add ele in the last pos
    public void addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = newnode;
            return;
        }
        Node currnode = head;
        while(currnode.next!=null){
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }

    //delete ele in the first pos in ll

    public void deletefirst(){
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        size--;
        head = head.next;
    } 

    //delete ele in the last pos in  ll

    public void deletelast(){
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        size--;
        Node secondlastnode = head;
        Node lastnode = head.next;
        while(lastnode.next!=null){
            secondlastnode = lastnode;
            lastnode = lastnode.next;
        }
        secondlastnode.next = null;
    }

    public int getsize(){
        return size;
    }

    public void printll(){
        Node currnode = head;
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        while(currnode!=null){
            System.out.print(currnode.data+"=>");
            currnode = currnode.next;
        }
        System.out.print("null");

    }
    public static void main(String[] args){
        linkedls ll = new linkedls();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addlast(10);
        ll.deletelast();
        ll.printll();
        System.out.println(ll.getsize());

    }
}
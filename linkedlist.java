//in linked list head and tail
class linkedlist{
    Node head ;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //insert first node
    public void addfirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }

    //add last
    public void addlast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node currnode = head;
        while(currnode.next!=null){
            currnode= currnode.next;
        }
        currnode.next = newnode;
    }

    //delete the first elements
    public void deletefirst(){
        if(head == null){
            System.out.print("ll is empty");
        }
        head = head.next;
    }

    //delete last val
    public void deletelast(){
        if(head == null){
            System.out.print("ll is empty");
            return;
        }
        Node currnode = head;
        while(currnode!=null){
            currnode = currnode.next;
        }
        currnode.next = null;
    }

    //print the linkedllist
    public void printlist(){
        if(head == null){
            System.out.print("ll is empty");
            return;
        }
        Node currnode = head;
        while(currnode!=null){
            System.out.print(currnode.data+"=>");
            currnode = currnode.next;
        }
        System.out.print("null ");
    }

    public static void main(String[] args){
        linkedlist list = new linkedlist();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addlast(5);
        list.printlist();
        list.deletelast();
        list.printlist();

    }
}
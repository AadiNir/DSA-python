class circularll {
    Node header;
    Node tail;
    circularll(){
        this.header = null;
        this.tail = null;
    }
    class Node{
        int value;
        Node next;
        Node(int data){
            this.value = data;
        }
    }

    public void addele(int data){
        Node newnode = new Node(data);
        if(header==null){
            header = newnode;
            tail = newnode;
        }
        tail.next = newnode;
        newnode.next = header;
        tail = newnode;
    }
    public void printll(){
        Node currnode = header;
        if(header==null){
            System.out.println("ll is empty");
        }
        do{
            System.out.print(currnode.value+"=>");
            currnode = currnode.next;
        }while(currnode!=header);
        System.out.print("null");
    }
    public static void main(String[] args){
        circularll list = new circularll();
        list.addele(1);
        list.addele(2);
        list.addele(3);
        list.addele(4);
        list.printll();
    }
    
}

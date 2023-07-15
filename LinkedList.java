class LinkedList{
    class Node{
        String data;
        Node next;
    
        Node(String data){
            this.data = data;
            this.next = null;
        }
    
    }
    Node head=null;
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=newNode;
            newNode.next=null;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst("Anurag");
        ll.addFirst("Saini");
        ll.addLast("anuragsaini674@gmail.com");
        ll.display();
    }
}
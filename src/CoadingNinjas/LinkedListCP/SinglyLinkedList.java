package CoadingNinjas.LinkedListCP;

public class SinglyLinkedList {
    private ListNode head;
    private  static class ListNode{
        private int data;
        private ListNode next;
        public ListNode (int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public int  count(){
        if(head==null) {
            return 0;
        }
        int c=0;
        ListNode current=head;
        while(current!=null){
            c++;
            current=current.next;
        }
        return c;
    }
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public static void main(String[] args) {
        /*SinglyLinkedList sll=new SinglyLinkedList();
        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode fourth=new ListNode(11);
        sll.head.next=second;//10->1
        second.next=third;//10->1->8
        third.next=fourth;//10->1->8->11->null
        sll.display();
        System.out.print("Length is--> "+sll.count());*/
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(1);
        sll.display();
        System.out.println("Length -->  " +sll.count());
    }
}

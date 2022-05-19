package Recursion;

public class ReverseLinkList {
    public static void main (String[] args){
        Node head= new Node(0);
        Node node1= new Node(1);
        head.next=node1;
        Node node2= new Node(2);
        node1.next=node2;
        Node node3 =  new Node(3);
        node2.next=node3;

        printList(head);
        Node rev_head = reverse(head);
        printList(rev_head);
        //System.out.println("Head after reversal= "+rev_head.i);
        //System.out.println("Node 1 after reversal= "+rev_head.next.next.i);

    }
    public static Node reverse(Node node){
        if(node.next==null)
            return node;
        Node new_head=reverse(node.next);
        addToTail(new_head,node);
        return new_head;
    }
    public static void addToTail(Node node, Node new_node){
        if(node.next==null)
        {
            node.next=new_node;
            new_node.next = null;
        }
    }
    public static void printList(Node node){
        while(node!=null){
            System.out.print(node.i+" ->");
            node=node.next;
        }
    }
}

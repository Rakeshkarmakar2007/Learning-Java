public class LinkedList {
    public static void main(String[] args){
        Node start = new Node();
        Node current = start;
        current.deta = 1;

        for(int i=2; i<=10; i++) {
            current.next = new Node();
            current = current.next;
            current.deta = i;
        }

        Node middle = start;
        current = start;
        while(current != null && current.next != null) {
            middle = middle.next;
            current = current.next.next;
        }
        System.out.println(middle.deta);
    }
}
class Node {
    int deta;
    Node next;
}
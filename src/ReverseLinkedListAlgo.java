public class ReverseLinkedListAlgo {
    public LinkedList reverseLinkedList(LinkedList head) {
        // Write your code here.
        LinkedList t = null, temp = head.next;
        head.next = null;
        t = temp.next;
        while(temp.next != null){
            temp.next = head;
            head = temp;
            temp = t;
            t = t.next;
        }
        temp.next = head;
        return temp;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}

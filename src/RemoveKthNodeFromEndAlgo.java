public class RemoveKthNodeFromEndAlgo {
    public void removeKthNodeFromEnd(LinkedList head, int k) {
        // Write your code here.
        if(head == null){
            return ;
        }

        int len = 0;
        LinkedList dummy = new LinkedList(0);
        dummy.next = head;
        LinkedList temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        len = len - k - 1;
        temp = head.next;
        if(len < 0){
            head.value = head.next.value;
            head.next = head.next.next;
            return ;
        }else{
            while(len > 0){
                head = head.next;
                len--;
            }
            head.next = head.next.next;
        }
        //System.out.println(head.value);
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}

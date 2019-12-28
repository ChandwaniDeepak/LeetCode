import java.util.PriorityQueue;

public class MergeKSortedList23 {

    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length == 0){
            return null;
        }

        if(lists.length == 1){
            return lists[0];
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> {
            int res =  a.val;
            if(a.val > b.val){
                res = b.val;
            }else if(b.val > a.val){
                res = a.val;
            }
            return res;
        });

        ListNode node;
        for(int i = 0; i < lists.length; i++){
            node = lists[i];
            while(node != null){
                pq.add(node);
                node = node.next;
            }
        }

        ListNode head;
        if(pq.peek() != null && pq.size() > 0){
            node = pq.remove();
        }else{
            return null;
        }


        head = node;
        while(!pq.isEmpty()){
            if(pq.peek() != null){
                node.next = pq.remove();
                node = node.next;
            }else{
                return head;
            }
        }
        return head;
    }
}

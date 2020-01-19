import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AddTwoNumbersII445 {

    public ListNode addTwoNumbersStack(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }

        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }


        int sum = 0;
        ListNode node = new ListNode(0);
        while(!s1.isEmpty() || !s2.isEmpty()){
            if(!s1.isEmpty()){
                sum += s1.pop();
            }

            if(!s2.isEmpty()){
                sum += s2.pop();
            }

            node.val = sum % 10;
            ListNode temp = new ListNode(sum / 10); // carry
            temp.next = node;
            node = temp;
            sum /= 10;
        }

        return node.val == 0 ? node.next : node;
    }

    public ListNode addTwoNumbers(List<Integer> list1, List<Integer> list2) {

//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//
        List<Integer> list3 = new ArrayList<>();
//
//        ListNode temp1 = l1;
//        ListNode temp2 = l2;
//
//        while(temp1 != null){
//            list1.add(temp1.val);
//        }
//
//        while(temp2 != null){
//            list2.add(temp2.val);
//        }

        int size = list1.size() > list2.size() ? list1.size() : list2.size();

        for(int i = 0; i <= size; i++){
            list3.add(0);
        }

        int one = 0;
        size = list3.size();
        while(one < list1.size() && one < list2.size()){
            int sum = list1.get(list1.size() - 1 - one) + list2.get(list2.size() - 1 - one) +(list3.get(size - 1 - one));
            list3.set(size - 1 - one, (sum % 10));
            list3.set(size - 2 - one, sum / 10);
            one++;
        }

        while(one < list1.size()){
            int sum = list1.get(list1.size() - 1 - one) + (list3.get(size - 1 - one));
            list3.set(size - 1 - one, (sum % 10));
            list3.set(size - 2 - one, sum / 10);
            one++;
        }

        while(one < list2.size()){
            int sum = list2.get(list2.size() - 1 - one) + (list3.get(size - 1 - one));
            list3.set(size - 1 - one, (sum % 10));
            list3.set(size - 2 - one, sum / 10);
            one++;
        }

        ListNode demoHead = new ListNode(-1);
        ListNode head = demoHead;
        for(int i : list3){
            demoHead.next = new ListNode(i);
            demoHead = demoHead.next;
        }

        return head.next.val != 0 ? head.next : head.next.next;
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}

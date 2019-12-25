import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    Map<Integer, DoublyLinkedNode> hmap;

    class DoublyLinkedNode{
        int key;
        int value;
        DoublyLinkedNode next;
        DoublyLinkedNode prev;
    }

    DoublyLinkedNode head = null;
    DoublyLinkedNode tail = null;
    int size = 0, cap = 0;

    public LRUCache(int cap) {
        this.cap = cap;
        hmap = new HashMap();
    }

    public int get(int key) {
        int val = hmap.get(key) != null ? hmap.get(key).value : -1;
        if(val > -1){
            //System.out.println("get -> "+key+" key found");
            DoublyLinkedNode y = remove(key);
            addToHead(y);
        }
        // else{
        //     System.out.println("get -> "+key+" key NOT found");
        // }
        return val;
    }

    public void put(int key, int value) {
        DoublyLinkedNode node = new DoublyLinkedNode();
        node.key = key;
        node.value = value;
        node.next = null;
        node.prev = null;

        //before putting check
        if(hmap.get(key) == null){
            addToHead(node);
        }else{
            //DoublyLinkedNode node = hmap.get(key);
            remove(key);
            addToHead(node);
        }
    }

    public void addToHead(DoublyLinkedNode node){
        if(size == 0){
            head = node;
            tail = node;
            hmap.put(node.key, node);
            ++size;
            //System.out.println("addToHead key-> "+node.key+" addToHead value-> "+node.value);
        }else if(size == cap){
            popTail();
            addToHead(node);
        }else{
            node.next = head;
            head.prev = node;
            head = node;
            hmap.put(node.key, node);
            ++size;
            //System.out.println("addToHead key-> "+node.key+" addToHead value-> "+node.value);
        }

    }

    public void popTail(){
        //System.out.println("popTail key-> "+tail.key+" popTail value-> "+tail.value);
        DoublyLinkedNode x = tail.prev;
        tail.prev = null;
        hmap.remove(tail.key);
        tail = x;
        --size;
    }

    public DoublyLinkedNode remove(int key){
        DoublyLinkedNode x = hmap.get(key);
        if(x.next == null || tail.key == key){
            // it is tail
            popTail();
        }else if(x.prev == null || head.key == key){
            // it is head
            head = x.next;
            x.next = null;
            head.prev = null;
            hmap.remove(x.key);
            --size;
            //System.out.println("remove key-> "+x.key+" remove value-> "+x.value);
        }else{
            x.prev.next = x.next;
            x.next.prev = x.prev;
            hmap.remove(x.key);
            --size;
            //System.out.println("remove key-> "+x.key+" remove value-> "+x.value);
        }

        return x;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

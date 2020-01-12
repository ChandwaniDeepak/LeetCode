import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



    class KVPair<K, V>{
        K key;
        V value;
        public KVPair(K k, V v){
            key = k;
            value = v;
        }
    }

    class Bucket{
        List<KVPair<Integer, Integer>> bucket;

        public Bucket(){
            bucket = new LinkedList<KVPair<Integer, Integer>>();
        }

        public int get(int key){
            for(KVPair<Integer, Integer> pair : bucket){
                if(pair.key.equals(key)){
                    return pair.value;
                }
            }
            return -1;
        }

        public void remove(int k){
            for(KVPair<Integer, Integer> pair : bucket){
                if(pair.key.equals(k)){
                    bucket.remove(pair);
                    break;
                }
            }
        }

        public void update(int k, int v){
            boolean found = false;
            for(KVPair<Integer, Integer> pair : bucket){
                if(pair.key.equals(k)){
                    pair.value = v;
                    found = true;
                    break;
                }
            }
            if(!found){
                bucket.add(new KVPair<Integer, Integer>(k, v));
            }
        }
    }
class MyHashMap {

    List<Bucket> list;
    int maxSize = 2048;
    /** Initialize your data structure here. */
    public MyHashMap() {
        list = new ArrayList();
        for(int i = 0; i < maxSize; i++){
            //KeyValuePair kv = new KeyValuePair(i, -1);
            list.add(new Bucket());
        }
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int hashKey = key % maxSize;
        list.get(hashKey).update(key, value);
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int hashKey = key % maxSize;
        return list.get(hashKey).get(key);
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int hashKey = key % maxSize;
        list.get(hashKey).remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
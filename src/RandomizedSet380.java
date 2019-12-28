import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomizedSet380 {
    Set<Integer> set;
    List<Integer> index;
    int count = 0;
    /** Initialize your data structure here. */
    public RandomizedSet380() {
        set = new HashSet<>();
        index = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {

        if(!set.contains(val)){
            set.add(val);
            index.add(val);
            //count++;
            return true;
        }
        return false;

    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {

        if(set.contains(val)){
            set.remove(val);
            int size = index.size();
            int last = index.get(size-1);
            index.add(index.get(new Integer(val)), last);
            index.remove(size-1);
            //count--;
            return true;
        }
        return false;

    }

    /** Get a random element from the set. */
    public int getRandom() {
        if(index.size() == 1){
            return index.get(0);
        }else if(index.size() > 0){
            int random = getRandom(0, index.size() - 1);
            return index.get(random);
        }
        return 0;
    }
    public static int getRandom(int min, int max) {
        return (int) ((Math.random() * (max + 1 - min)) + min);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

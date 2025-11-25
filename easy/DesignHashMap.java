/**
 * Completed: 2024-04-21
 * Difficulty: Easy
 * 706. Design HashMap
 * https://leetcode.com/problems/design-hashmap/description/
 */

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

class DesignHashMap {
    private ArrayList<Integer> keys;
    private ArrayList<Integer> values;
    
    public DesignHashMap() {
        this.keys = new ArrayList<Integer>();
        this.values = new ArrayList<Integer>();
    }
    
    public void put(int key, int value) {
        int index = this.keys.indexOf(key);
        if (index >= 0) {
            // System.out.println("key " + key + " already exists");
            this.values.set(index, value);
        } else {
            // System.out.println("key " + key + " does NOT already exist");
            this.keys.add(key);
            this.values.add(value);
        }
        
        // Util.printArrayList(this.keys, this.values);
    }
    
    public int get(int key) {
        int index = this.keys.indexOf(key);
        if (index < 0) {
            return index;
        }
        // Util.printArrayList(this.keys, this.values);
        return this.values.get(index);
    }
    
    public void remove(int key) {
        int index = this.keys.indexOf(key);
        if (index >= 0) {
            this.keys.remove(index);
            this.values.remove(index);
            // Util.printArrayList(this.keys, this.values);
        }
    }
}

public class Util {

    public static void printArrayList(ArrayList<Integer> ar, ArrayList<Integer> ar2) {
        if (ar.size() > 0) {
            System.out.print("[");
            for (int i = 0; i < ar.size() - 1; i++) {
                System.out.print("[" + ar.get(i) + "," + ar2.get(i) + "],");
            }
            System.out.print("[" + ar.get(ar.size() - 1) + "," + ar2.get(ar.size() - 1) + "]]\n");
        } else {
            System.out.println("[]");
        }
    }
}

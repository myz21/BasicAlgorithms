/**
 * HashTable.java
 * Student’s custom separate-chaining hash table.
 *
 * TODO: Implement the following:
 *   - public HashTable(int M)
 *   - private int hash(double key)
 *   - public void put(double key, int value)
 *   - public Integer get(double key)
 *   - public boolean remove(double key)
 *   - public double loadFactor()
 *   - public int maxChainLength()
 *   - public double meanChainLength()
 *
 * NOTE: hash(double) is critical — this is where you design your
 *        double-to-bucket mapping. A naive (int)(x % M) is meaningless
 *        for doubles.
 *
 * Hints (comment only):
 *   - Convert double to raw bits: long bits = Double.doubleToRawLongBits(key);
 *   - Do bit mixing (e.g., XOR shifts, multiply by a large odd constant)
 *   - Make sure to return a non-negative integer within [0, M-1].
 */

 public class HashTable {
    private LinkList[] table;
    private int M;       // number of buckets
    private int size;    // number of stored elements

    public HashTable(int M) {
        // TODO: initialize tabl table[i] = new LinkList()
        // TODO: size = 0
        table = new LinkList[M];
        size = 0;
    }

    private int hash(double key) {
        // TODO: convert to bits: long bits = Double.doubleToRawLongBits(key);
        // TODO: mix bits (e.g., xor shifts or multiply)
        // TODO: map to [0, M-1] using modulo
        // TODO: ensure non-negative result


        return 0;
    }

    public void put(double key, int value) {
        // TODO: find bucket index = hash(key)
        // TODO: search for key; if found, update value
        // TODO: otherwise insert new node and size++
        if(table[hash(key)].search(key) !=null){
            table[hash(key)].insert(key, value);
            size++;
        }
        
    }

    //ok
    public Integer get(double key) {
        // TODO: find bucket index, search for key
        // TODO: if found, return value; else return null
        return table[hash(key)].search(key).value;
    }

    //ok
    public boolean remove(double key) {
        // TODO: find bucket index, delete node
        // TODO: if deleted, size-- and return true; else false
        return table[hash(key)].delete(key);
    }

    //ok
    public double loadFactor() {
        // TODO: return size / (double) M
        return size/M;
    }

    //ok
    public int maxChainLength() {
        // TODO: iterate buckets and find the longest linked list
        int max = 0;
        for(int i = 0 ; i< M; i++){
            if(table[i].length() > max)
                max = table[i];
        }
        return max;
    }

    //ok
    public double meanChainLength() {
        // TODO: sum all chain lengths and divide by M
        int sum = 0;
        for(int i = 0 ; i< M; i++){
            sum += table[i].length();
        }
        return sum/M;
    }
}

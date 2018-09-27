package lfu1;

public class TestLFUCache {
    public static void main(String args[]) {

        // Create LFU Cache with capacity - 5
        LFUCache<Integer, Integer> cache = new LFUCache<>(5);

        // Time complexity - O(1)
        cache.set(10, 13);
        cache.set(3, 17);
        cache.set(6, 11);
        cache.set(10, 5);
        

        // Time complexity - O(1)
        System.out.println(cache.get(10));
        cache.set(2, 19);
        System.out.println(cache.get(2));
        cache.set(1, 12);
        System.out.println(cache.get(10));
    }
}


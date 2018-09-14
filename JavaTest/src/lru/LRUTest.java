package lru;

public class LRUTest {

	public static void main(String[] args) {
    	System.out.println("LRU Tests");
    	LRUCache lru = new LRUCache(4);
    	lru.set(1, 10);
    	lru.set(2, 20);
    	lru.set(3, 30);
    	lru.set(4, 40);
    	lru.set(5, 50);
    	lru.set(3, 35);
    	lru.set(6, 66);
    	lru.set(4, 41);
    	lru.set(3, 39);
    	
    	lru.printLRU();
	}
}

package lru;

public class LRUCache {

	int capacity;
	CustomHashMap<Integer, Node> map = new CustomHashMap<Integer, Node>();
    Node head=null;
    Node end=null;
 
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
 
    public int get(int key) {
        if(null != map.get(key)){
            Node n = map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }
 
        return -1;
    }
 
    public void remove(Node n){
        if(n.pre!=null){
            n.pre.next = n.next;
        }else{
            head = n.next;
        }
 
        if(n.next!=null){
            n.next.pre = n.pre;
        }else{
            end = n.pre;
        }
 
    }
 
    public void setHead(Node n){
        n.next = head;
        n.pre = null;
 
        if(head!=null)
            head.pre = n;
 
        head = n;
 
        if(end ==null)
            end = head;
    }
 
    public void set(int key, int value) {
        if(null != map.get(key)){
            Node old = map.get(key);
            remove(old);
            old.value = value;            
            setHead(old);
        }else{
            Node created = new Node(key, value);
            if(map.size() >= capacity){
                map.remove(end.key);
                remove(end);
                setHead(created);
 
            }else{
                setHead(created);
            }    
 
            map.put(key, created);
        }
    }
    
    public void printLRU() {
    	if(null != head){
    		while(null != head){
    			System.out.println(head.key+" -- "+head.value);
    			head = head.next;
    		}
    	}
    }
}

package lfu1;

public class LFUCacheEntry<K, V> extends Node {
    private FrequencyNode frequencyNode;
    private K key;
    private V value;

    public LFUCacheEntry(K key, V value, FrequencyNode frequencyNode) {
        this.key = key;
        this.value = value;
        this.frequencyNode = frequencyNode;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public FrequencyNode getFrequencyNode() {
        return frequencyNode;
    }

    public void setFrequencyNode(FrequencyNode frequencyNode) {
        this.frequencyNode = frequencyNode;
    }
}


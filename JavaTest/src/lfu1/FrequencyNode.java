package lfu1;

public class FrequencyNode extends Node {
    private int frequency;
    private NodeList cacheEntryList;

    public int getFrequency() {
        return frequency;
    }

    public NodeList getCacheEntryList() {
        return cacheEntryList;
    }

    public FrequencyNode(int frequency) {
        this.frequency = frequency;
        cacheEntryList = new NodeList();
    }
}


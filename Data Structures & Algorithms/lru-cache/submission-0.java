class LRUCache {
    
    private int cap;
    private Map<Integer, Node> cache;
    private Node left;
    private Node right;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    public int get(int key) {

        if(cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }

        return -1;

    }

    public void put(int key, int val) {
        if(cache.containsKey(key)) {
            remove(cache.get(key));
        }

        Node node = new Node(key, val);
        cache.put(key, node);
        insert(node);

        if(cache.size() > cap) {
            Node lef = this.left.next;
            remove(lef);
            cache.remove(lef.key);
        }
    }

    private void insert(Node nodeToInsert) {
        Node lastRealNode = this.right.prev;

        lastRealNode.next = nodeToInsert;
        nodeToInsert.prev = lastRealNode;

        nodeToInsert.next = this.right;
        this.right.prev = nodeToInsert;
    }

    private void remove(Node nodeToRemove) {
        Node previousNode = nodeToRemove.prev;
        Node nextNode = nodeToRemove.next;

        previousNode.next = nextNode;
        nextNode.prev = previousNode;
    }
}

public class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val)
    {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
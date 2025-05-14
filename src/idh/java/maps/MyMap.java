package idh.java.maps;

import java.util.List;

public class MyMap<K, V> {
	class Node {
		K key;
		V value;
	}

	private List[] buckets;

	public MyMap() {
		buckets = new List[16];
	}

	public V get(K key) {
		int hc = key.hashCode();
		int bucketIndex = hc % buckets.length;

		List<Node> list = buckets[bucketIndex];
		for (Node node : list) {
			if (node.key.equals(key)) {
				return node.value;
			}
		}
		return null;
	}

	public void put(K key, V value) {
		int hc = key.hashCode();
		int bucketIndex = hc % buckets.length;

		Node node = new Node();
		node.key = key;
		node.value = value;

		buckets[bucketIndex].add(node);
	}

	public static void main(String[] args) {
		MyMap<String, Student> map = new MyMap<String, Student>();

	}
}

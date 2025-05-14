package idh.java.listimpls;

public class LinkedListDemo {

	public static void main(String[] args) {
		MyLinkedList<String> ll = new MyLinkedList<String>();
		ll.add("Hallo");
		ll.add("Welt");
		ll.add("!");
		ll.add("Was");
		ll.add("für");
		ll.add("eine");
		ll.add("tolle");
		ll.add("Liste");
		ll.add("!");
		ll.add("!");
		ll.get(2);
		for (String s : ll) {
			System.out.println(s);
		}

	}

}

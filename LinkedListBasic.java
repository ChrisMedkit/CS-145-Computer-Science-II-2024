
public class LinkedListBasic<T> {
	Node<T> headPointer;
	Node<T> tailPointer;
	public LinkedListBasic() {
		super();
		headPointer = null;
		tailPointer = null;
}
	public void add (T item) {
		Node<T> node = new Node<T>(item, null);
		if (headPointer == null) {
			headPointer = node;
			tailPointer = node;
		}
		else {
			tailPointer.setNext(node);
			tailPointer = node;}
		}
		public void printList() {
			Node<T> current = headPointer;
			while (current != null) {
				System.out.println(current.getValue() + "\n");
				current = current.getNext();
		}
	}

}


public class Node implements Comparable<Node> {

	private final char ch;
	private final int freq;
	public char getCh() {
		return ch;
	}

	public int getFreq() {
		return freq;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}


	private final Node left, right;

	Node(char ch, int freq, Node left, Node right) {
		this.ch = ch;
		this.freq = freq;
		this.left = left;
		this.right = right;
	}

	// check if it is leaf node
	public boolean isLeaf() {
		if((left == null) && (right == null)){
			return true;
		}
		return false;
	}


	public int compareTo(Node other) {
		return this.freq - other.freq;
	}

}

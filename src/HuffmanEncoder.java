import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class HuffmanEncoder {

	private static final int NCHARS = 256;
	Queue<Node> priorityQ;
	HashMap<Character, String> codeTable;
	private int[] frequencyTable;
	private char[] input;
	private String[] result;

	public HuffmanEncoder(char[] input) {
		frequencyTable = new int[256];
		this.input = input;
		priorityQ = new PriorityQueue<>();
		codeTable = new HashMap<>();

	}
	
	/*
	 * encodes the input and writes the content in file 
	 */
	public void encode() {
		buildFrequencyTable();
		Node root = buildHuffmanTree();
		buildCodeTable(root, "");

		for (int i = 0; i < input.length; i++) {
			System.out.println(codeTable.get(input[i]));
		}
	}

	/*
	 * builds frequency table of the input 
	 */
	private void buildFrequencyTable() {
		for (int i = 0; i < input.length; i++) {
			frequencyTable[input[i]]++;
		}
	}

	/*
	 * builds huffman tree using the previously created frequency table
	 * and priority queue to sort it
	 */
	private Node buildHuffmanTree() {
		for (char i = 0; i < NCHARS; i++) {
			if (frequencyTable[i] > 0) {
				priorityQ.add(new Node(i, frequencyTable[i], null, null));
			}
		}

		// parent node is the sum of frequencies of the children nodes
		while (priorityQ.size() > 1) {
			Node left = priorityQ.poll();
			Node right = priorityQ.poll();
			Node parent = new Node('\0', left.getFreq() + right.getFreq(), left, right);
			priorityQ.add(parent);
		}

		return priorityQ.poll();
	}

	/*
	 * maps every char to its encoded value
	 */
	private void buildCodeTable(Node node, String result) {
		if (!node.isLeaf()) {
			buildCodeTable(node.getLeft(), result + '0');
			buildCodeTable(node.getRight(), result + '1');
		} else {
			codeTable.put(node.getCh(), result);
		}

	}

}

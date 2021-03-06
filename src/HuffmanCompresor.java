import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class HuffmanCompresor {
	
	private static final int NCHARS = 256;
	Queue<Node> priorityQ;
	HashMap<Character,String> codeTable;
	private int[] frequencyTable;
	private char[] input;
	private String[] result;
	
	public HuffmanCompresor(char[] input){
		frequencyTable = new int[256];
		this.input = input;
		priorityQ = new PriorityQueue<>();
		codeTable = new HashMap<>();
		
	}
	
	public void encode(int start, int end){
		 for (int i = start; i < end; i++){
//			 System.out.println(i);
//			 System.out.println(input[i]);
	            frequencyTable[input[i]]++;
		 }
		 
		 Node root = buildHuffmanTree();
		 
		 buildCodeTable(root, "");
		 
		 for(int i = 0; i < input.length; i++){
			 //������� �� ���� ��� ����
		 }
	}

	private Node buildHuffmanTree() {
		for (char i = 0; i < NCHARS; i++) {
			if(frequencyTable[i] > 0){
				priorityQ.add(new Node(i, frequencyTable[i],null,null));
			}
		}
		
		//parent node is the sum of frequencies of the children nodes
		while(priorityQ.size() > 1){
			Node left = priorityQ.poll();
			Node right = priorityQ.poll();
			Node parent = new Node('\0', left.getFreq() + right.getFreq(), left, right); 
			priorityQ.add(parent);
		}
		
		return priorityQ.poll();
	}
	
	private void buildCodeTable(Node node, String result){
		if (!node.isLeaf()) {
            buildCodeTable(node.getLeft(),  result + '0');
            buildCodeTable(node.getRight(), result + '1');
        }
        else {
            codeTable.put(node.getCh(), result);
        }
		
	}

}

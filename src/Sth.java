import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sth {

	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		
		long start = System.nanoTime();
		
		final char[] arr = new char[1200000];
		br.read(arr, 0, 1200000);
		
		
		HuffmanCompresor hf = new HuffmanCompresor(arr);
		hf.encode(0,1200000);
	
		
//		hf.encode();
		
//		Thread[] thar = new Thread[4];
//		for (int i = 0; i < 4; i++) {
//			thar[i] = new Thread(){
//				public void run(){
//					HuffmanCompresor hf = new HuffmanCompresor(arr);
//					hf.encode(0,400000);
//				}
//			};
//			thar[i].start();
//		}
//		
//		for (int i = 0; i < thar.length; i++) {
//			thar[i].join();
//		}
		
		
		long end = System.nanoTime();
		System.out.println(end - start);
		
		

	}

}

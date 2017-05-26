import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.omg.CORBA.Principal;

public class Starter {

	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {

		Path path = Paths.get("C:\\Users\\4525s\\workspace\\RSA Project\\fileread.txt");
		AsynchronousFileChannel	fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);
	

		ByteBuffer buffer = ByteBuffer.allocate(6);
		ByteBuffer buffer2 = ByteBuffer.allocate(6);		
		ByteBuffer buffer3 = ByteBuffer.allocate(6);
		ByteBuffer buffer4 = ByteBuffer.allocate(6);
	
		Future<Integer> operation = fileChannel.read(buffer, 3);
		operation.get();
		String fileContent = new String(buffer.array()).trim();
		buffer.clear();
		
		Future<Integer> operation2 = fileChannel.read(buffer2, 6);	
		operation2.get();
		Future<Integer> operation3 = fileChannel.read(buffer3, 6);	
		operation2.get();
		Future<Integer> operation4 = fileChannel.read(buffer4, 6);	
		operation2.get();
		
		
		String fileContent2 = new String(buffer2.array()).trim();
		buffer2.clear();
		fileChannel.close();
		
		System.out.println(fileContent +"sth");
		System.out.println(fileContent2 +"2st");
		
	
		

		// HuffmanEncoder en = new HuffmanEncoder("ababca".toCharArray());
		// en.encode();

	}

}

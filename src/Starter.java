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

//		Path path = Paths.get("C:\\Users\\4525s\\workspace\\RSA Project\\fileread.txt");
//		AsynchronousFileChannel	fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);
//	
//
//		ByteBuffer buffer = ByteBuffer.allocate(6);
//		long position = 0;
//		
//		ByteBuffer buffer2 = ByteBuffer.allocate(6);
//		long position2 = 0;
//
//		Future<Integer> operation = fileChannel.read(buffer, position);
//		
//		Future<Integer> operation2 = fileChannel.read(buffer2, 6);	
//		
//		operation.get();
//		operation2.get();
//		String fileContent = new String(buffer.array()).trim();
//		buffer.clear();
//		
//		String fileContent2 = new String(buffer2.array()).trim();
//		buffer2.clear();
//		fileChannel.close();
//		
//		System.out.println(fileContent +"sth");
//		System.out.println(fileContent2 +"2st");
		
	
		

		// HuffmanEncoder en = new HuffmanEncoder("ababca".toCharArray());
		// en.encode();

	}

}

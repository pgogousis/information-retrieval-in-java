import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;

import org.apache.commons.io.FileUtils;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  System.out.println("Available processors (cores): " + 
		  Runtime.getRuntime().availableProcessors());
		
		  /* Total amount of free memory available to the JVM */
		  System.out.println("Free memory (bytes): " + 
		  Runtime.getRuntime().freeMemory());
		
		  File folder = new File("C:\\Users\\gogopavl\\git\\IRAssignment\\catalogue");
		  File[] listOfFiles = folder.listFiles();
		  String [] filesToSend = new String[listOfFiles.length];
		  //osa xwrane stin mnimi
		  for (int i = 0; i < listOfFiles.length; i++) {
		    File file = listOfFiles[i];
		    if (file.isFile() && file.getName().endsWith(".txt")) {
		      /* do somthing with content */
//		    	System.out.println(file.getName());
		    	filesToSend[i] = file.getName();
		    } 
		  }
		   
		  
		  
		  //invertedIndex i = new invertedIndex(filesToSend);
		  Runnable r = new invertedIndex(filesToSend);
		  new Thread(r).start();
		 
		  
		  System.out.println("Ended");
		  
	}

}

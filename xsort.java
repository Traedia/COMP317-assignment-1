import java.util.*;
import java.io.*;
import java.nio.*;

public class xsort{
    /**
      The main entry point of the program
      @ param args[] The arguments passed into the program. The arguments are separated by a space. 
     */
    main(String args[]){
    	int runSize = 0;
    	int numFiles = 0;
    	
    	
    	try
    	{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
		    
		    
		    //Data for output file
		    //No need for another file name, as there is one above (output.txt)
		    String dirName;
		    String fileName = "output.txt";
		    File dir = new File(dirName);
		    File actualOutput = new File(dir, actualOutput);
		    
		    PrintWriter writer = new Printwriter(actualOutput, "UTF-8");
		    
		    //Possibly needed for reading the data input.
		    //String[] input = br.readLine.split(" ");
		    
		if(args.length > 0){
			
		for(int i=0; i< args.length() ; i++)
		{
			//runsize
			if(args[i]=="-r")
			{
				if(Integer.parseInt(args[i+1]);
				{
					runSize = args[i+1];		
				}
			}
			
			//numfiles
			if(args[i]=="-k")
			{
				if(Integer.parseInt(args[i+1]);
				{
					numFiles = args[i+1];
				}	
			}
			
			//tempdir
			if(args[i]=="-d")
			{
				//Allow a Path variable to check if the path is real or not
				Path path = args[i+1];
				if(Files.exists(path));
				{
					//If the path is existing, then make the directory equal to the path.
					dirName = args[i+1];
				}	
			}
			
			//output filename
			if(args[i]=="-o")
			{	
				//As long as there's an acceptable character
				if(args[i+1] != null);
				{
					//specify the name of the output file
					fileName = args[i+1];
				}	
			}
			
		}
	}
	    // We need a way to parse the strings and run the program in the way the user has specified.
	    // args[] contains all the arguments seperated by a space
	    // one way to do it is to iterate through the array, parse the command check if its valid and check if the next element is an input.
	
	catch(IOException e)
	{
		System.err.println("Error: " + e);
	}



    }



}

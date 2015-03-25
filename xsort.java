import java.util.*;
import java.io.*;
import java.nio.file.Files;

public class xsort{
    /**
      The main entry point of the program
      @ param args[] The arguments passed into the program. The arguments are separated by a space. 
     */
    public static void main(String args[])
    {
    	int runSize = 0;
    	int numFiles = 0;
    	
    	
    	try
    	{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    
		    
		    //Data for output file
		    //No need for another file name, as there is one above (output.txt)
		    String actualOutput = "";
		    
		    PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		    
		    //Possibly needed for reading the data input.
		    //String[] input = br.readLine.split(" ");
		    
		if(args.length > 0){
			
		for(int i=1; i< args.length ; i++)
		{
			//runsize
			if(args[i]=="-r")
			{
				int runsize_ = Integer.parseInt(args[i+1]);
			}
			
			//numfiles
			if(args[i]=="-k")
			{
				int numfiles_ = Integer.parseInt(args[i+1]);
			}
			
			//tempdir
			if(args[i]=="-d")
			{
					//If the path is existing, then make the directory equal to the path.
					String dirName = args[i+1];

		    		File theDir = new File(dirName);
 
 					// if the directory does not exist, create it
  					if (!theDir.exists())
  					{
   						System.out.println("creating directory: " + dirName);
    					theDir.mkdir();
  					}	

			}
			
			//output filename
			if(args[i]=="-o")
			{	
				//As long as there's an acceptable character
				if(args[i+1] != null);
				{
					//specify the name of the output file
					actualOutput = args[i+1];
				}	
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

package com.TheMasterMindGroup.TextInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteIntoFile {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\kanastasov\\Desktop\\output.txt");
		
		if(file.exists()) {
			System.exit(0);
		}
		
		PrintWriter output = new PrintWriter(file);
		
		
		output.print("Winter is comming");
		output.println(" John snow is the king of the north!");
		
		output.print("John snow slept with his aunt");
		output.println(" If I had such an aunt I would too");
		
		
		output.close();
		
		
		
	}

}

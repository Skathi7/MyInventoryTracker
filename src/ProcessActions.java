import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import javax.swing.JTextField;

public class ProcessActions {
	String newItemName;

	public void addToInventory (JTextField textItemName) throws FileNotFoundException, UnsupportedEncodingException {
		
		newItemName = textItemName.getText(); //Geting the name of the item entered by the user
		
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("myFile.txt", true)))) {//Getting the file
		    out.println(newItemName);//Appending to the file
		    textItemName.setText("");//Setting this blank after entering
		    
		}catch (IOException e) {
		    System.err.println(e);
			}
		
	}//End of method add inventory
	
	
}

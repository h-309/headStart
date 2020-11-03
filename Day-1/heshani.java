import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class heshani {
	
   public static void main(String args[]) throws FileNotFoundException {
	   
     
      Scanner input1 = new Scanner(System.in);
	  
      System.out.println("Enter the word:");
      String search = input1.next();
	  
      boolean text = false;
      int count = 0;

      Scanner input2 = new Scanner(new FileInputStream("example.txt"));
      while(input2.hasNextLine()) {
         String line = input2.nextLine();
         if(line.indexOf(search)!=-1) {
            text = true;
            count = count+1;
         }
      }
	  
      if(text) {
         System.out.println("Word '" + search + "' was found");
      } else {
         System.out.println("Word '" + search + "' was NOT found");
      }
   }
}
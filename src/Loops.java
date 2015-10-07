
import java.util.*;

public class Loops{
    public static void main(String[] args) {
        // init scanner
        Scanner sc = new Scanner(System.in);
        // sentence input by user
        String in;
        // sentence divided into parts
        String[] inParts;
        
        // prompt user to enter sentence
        in = sc.nextLine();
        // splits the sentence into words and stores them into array
        inParts = in.split(" ");
        
        // goes through inParts array, if next "word" is a number, will 2x it
        for(int i = 0; i < inParts.length; i++){
            if(inParts[i].matches("\\d+\\.?\\d*")){
                double num;
                num = Double.parseDouble(inParts[i]);
                System.out.println(num * 2);
            }
            // if not a number, will just output accordingly
            else{
            System.out.println(inParts[i]);
            }
        }
    }
    
}
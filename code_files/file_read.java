import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class file_read {
    public static void main(String args[]) throws FileNotFoundException {

        //creating File instance to reference text file in Java
        File inputfile = new File("/Users/mansoor/Documents/SD_in_Blockchain/upgrad/quiz_numbers.txt"); // specify the path of the file

        Scanner scan = new Scanner(inputfile);
        int lineNumber = 1; 
        int sum = 0;

        while(scan.hasNext()==true){

            int number = scan.nextInt();
            sum = sum + number;
            lineNumber++;
            
        }
        double mean = sum / lineNumber;
        System.out.println(mean);
    }
}

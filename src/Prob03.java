import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// Example for Reading from File
// T will store number of test cases
// N will store the number of tests for each case

public class Prob03
{
    public static String INPUT_FILE_NAME = "ExampleInputs/Prob03.in.txt";
    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;
            
            // get the number of test cases
            int T = Integer.parseInt(br.readLine());
            
            // loop through test cases
            for (int i = 0; i < T; i++) {
                // get the number of lines in each test case
                int N = Integer.parseInt(br.readLine());
                
                // loop through the lines
                for (int j=0; j<N; j++) {
                    // read the line of text to get the test data
                    inLine = br.readLine();
                    
                    System.out.println(inLine);
                }
            }
            
            // clean up
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
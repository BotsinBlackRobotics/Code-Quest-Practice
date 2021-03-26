import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// Example for Reading from File
// T will store number of test cases
// N will store the number of tests for each case

public class Prob01
{
    public static String INPUT_FILE_NAME = "ExampleInputs/Prob01.in.txt";
    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;
            
            // get the number of test cases

            // TODO: HOW SHOULD WE KNOW NUMBER OF TEST CASES ON THESE TYPES OF PROBLEMS
            //int T = Integer.parseInt(br.readLine());
            int T = 10;

            // Fizz buzz words
            String code = "CODE";
            String quest = "QUEST";

            int line;

            // read the line of text to get the test data
            inLine = br.readLine();
            while (inLine != null) {
                line = Integer.parseInt(inLine);
                StringBuilder out = new StringBuilder();

                if ((line % 3 == 0) && (line % 7 == 0)) {
                    out.append(code + quest);
                } else if ((line % 7) == 0) {
                    out.append(code);
                } else if ((line % 3) == 0) {
                    out.append(quest);
                } else {
                    out.append(line);
                }

                // TODO: figure out why number will not appear
                if (out.equals("")) {
                    out.append(inLine);
                }


                System.out.println(out);
                inLine = br.readLine();
            }

            // clean up
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
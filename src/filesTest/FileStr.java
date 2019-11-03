package filesTest;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.*;

public class FileStr  {
    public static void main(String[] args) throws Exception {
        try (FileWriter writerFile = new FileWriter("test2.txt");
             FileReader readerFile = new FileReader("test2.txt")) {


            writerFile.write("All children, except one, grow up.");
            writerFile.append('\n');
            writerFile.write("They soon know that they will grow up, and the way Wendy knew was this.");   // writes
            writerFile.append('\n');
            writerFile.write("One day when she was two years old she was playing in a garden, and she plucked another flower and ran with it to her mother.");

            writerFile.close();

            /* Read file with class Scanner */
            Scanner scan = new Scanner(readerFile);
            System.out.println(scan);
        //    String[] strArray = {};
        //    int i = 0;

            while (scan.hasNextLine()) {
               System.out.println(scan.nextLine());
            }
            scan.close();




        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

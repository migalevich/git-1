package homework6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Objects;

public class DemoTask2 {
    public static void main(String[] args) throws Exception {

        /* text */
        String text = "All children, except one, grow up.\n"+
                "They soon know that they will grow up, and the way Wendy knew was this.\n"+
                "One day when she was two years old she was playing in a garden, and she plucked another flower and ran with it to her mother.";


        writeFile(text, "test2.txt");
        reWriteFile(Objects.requireNonNull(readAndFormatting()).toString());

    }

    /* Write text to the file */
    public static void writeFile(String text, String fileName) {
        try (Writer writerFile = new FileWriter(fileName)) {

            writerFile.write(text);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /* Read text from file and formatting (swap the first and last word) */
    private static StringBuilder readAndFormatting() {

        try (Reader readerFile = new FileReader("test2.txt");
             BufferedReader bufferedReader = new BufferedReader(readerFile);
        ) {

            String line;
            StringBuilder text = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strArray = line.split(" ");
                String temp;
                temp = strArray[0];
                strArray[0] = strArray[strArray.length - 1].replace(".", "");
                strArray[strArray.length - 1] = temp + ".";
                for (String s : strArray) {
                    text.append(" ").append(s);
                }
                text.append('\n');
            }
            return text;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /* Rewrite formatted text to the file */
    private static void reWriteFile(String text) {
        try (Writer writerFileNew = new FileWriter("test2.txt")) {

            writerFileNew.write(text);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

package homework6;

import java.io.BufferedReader;
import java.io.IOException;

public class ParagraphMiddleware extends Middleware {

    public boolean check(BufferedReader bufferedReader) throws IOException {
        int i = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] strArray = line.split("\n");
            i++;
        }
       // bufferedReader.reset();
        System.out.println(i + " Paragraphs in the text");
        return checkNext(bufferedReader);
    }

}
package homework6;

import java.io.BufferedReader;
import java.io.IOException;

public class WordsMiddleware extends Middleware {
    BufferedReader bufferedReader;

    public WordsMiddleware(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public boolean check(BufferedReader bufferedReader) throws IOException {
        bufferedReader.reset();
        int i = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words) {
              //  System.out.println(word);
                i++;
            }
        }
        System.out.println(i + " Words in the text");
        return checkNext(bufferedReader);
    }

}

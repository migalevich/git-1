package homework6;

import java.io.BufferedReader;
import java.io.IOException;

public class SentencesMiddleware extends Middleware {
    private BufferedReader bufferedReader;

    SentencesMiddleware(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public boolean check(BufferedReader bufferedReader) throws IOException {
        bufferedReader.reset();
        int i = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] sentences = line.split("[.?!]");
            for (String ignored : sentences) {
                i++;
            }
        }
        System.out.println(i + " Sentences in the text");
        return checkNext(bufferedReader);
    }


}

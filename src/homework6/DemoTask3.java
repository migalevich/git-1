package homework6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import static homework6.DemoTask2.writeFile;

public class DemoTask3 {
    public static void main(String[] args) {

        /* text */
        String text = "Peter was a little annoyed with them for knowing so much, but if he wanted to lord it over them his triumph was at hand, " +
                "for have I not told you that anon fear fell upon them?\n" +
                "It came as the arrows went, leaving the island in gloom.\n" +
                "In the old days at home the Neverland had always begun to look a little dark and threatening by bedtime. Then unexplored patches " +
                "arose in it and spread, black shadows moved about in them, the roar of the beasts of prey was quite different now, and above all, " +
                "you lost the certainty that you would win. You were quite glad that the night-lights were on. You even liked Nana to say that this " +
                "was just the mantelpiece over here, and that the Neverland was all make-believe.\n" +
                "Of course the Neverland had been make-believe in those days, but it was real now, and there were no night-lights, and it was getting " +
                "darker every moment, and where was Nana?";

        writeFile(text, "test3.txt");

        try (FileInputStream fi = new FileInputStream("test3.txt");
             InputStreamReader readerFile = new InputStreamReader(fi);
             BufferedReader bufferedReader = new BufferedReader(readerFile)
        ) {

            bufferedReader.mark(fi.available() + 1);

            /* Chain of Responsibilities Pattern */
            Middleware middleware = new ParagraphMiddleware();
            middleware.linkWith(new SentencesMiddleware(bufferedReader)).linkWith(new WordsMiddleware(bufferedReader));

            middleware.check(bufferedReader);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}

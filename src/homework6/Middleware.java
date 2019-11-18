package homework6;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class Middleware {
    private Middleware next;

    Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(BufferedReader bufferedReader) throws IOException;

    boolean checkNext(BufferedReader bufferedReader) throws IOException {
        if (next == null) {
            return true;
        }
        return next.check(bufferedReader);
    }
}
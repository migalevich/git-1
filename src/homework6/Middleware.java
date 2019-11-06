package homework6;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class Middleware {
    private Middleware next;

    /**
     * Помогает строить цепь из объектов-проверок.
     */
    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    /**
     * Подклассы реализуют в этом методе конкретные проверки.
     * @return
     */
    public abstract boolean check(BufferedReader bufferedReader) throws IOException;

    /**
     * Запускает проверку в следующем объекте или завершает проверку, если мы в
     * последнем элементе цепи.
     */

    protected boolean checkNext(BufferedReader bufferedReader) throws IOException {
        if (next == null) {
            return true;
        }
        return next.check(bufferedReader);
    }
}
package usefulInfo;

import java.io.*;
import java.util.*;

public class EndOfFile {
    /* EOF - это специальный внеполосный сигнал, который означает конец ввода. Это не символ (хотя в старые DOS-дни 0x1B действовал как EOF),
    а скорее сигнал от ОС, что вход закончился.   Ctrl+D */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 1;

        while (s.hasNext()) {
            String ns = s.nextLine();
            System.out.println(count + " " + ns);
            count++;
        }
    }
}






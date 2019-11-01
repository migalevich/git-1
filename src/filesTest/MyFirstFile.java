package filesTest;

import java.io.*;
import java.util.*;

public class MyFirstFile {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        try (FileWriter writerFile = new FileWriter("test.txt");
             FileReader readerFile = new FileReader("test.txt");
             FileWriter writerNewFile = new FileWriter("test.txt")) {

            int l = (int) (Math.random() * 4 + 7); // array length
            int[] array = new int[l];

            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 5 + 7);
                String s = Integer.toString(array[j]);
                writerFile.write(s + " ");   // writes the bytes
            }

            System.out.println(Arrays.toString(array));
            writerFile.close();

            /* Read file with class Scanner */
            Scanner scan = new Scanner(readerFile);
            List<Integer> ints = new ArrayList<Integer>();
            int i = 0;
            while (scan.hasNextInt()) {
                ints.add(scan.nextInt());
                i++;
            }

            ints.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (o1.equals(o2)) {
                        return 0;
                    } else {
                        if (o1 < o2) {
                            return -1;
                        } else {
                            return 1;
                        }
                    }
                }
            });
            System.out.println(ints);
            readerFile.close();


            writerNewFile.write(ints.toString().replaceAll("[-+.^:,“”?]","").replace("[","").replace("]",""));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }


}

package homework6;

import java.io.*;
import java.util.*;

public class DemoTask1 {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        writeFile(); // write random array to File
        writeNewFile(readFile()); // write new array to File
    }

    private static void writeFile() {
        try (Writer writerFile = new FileWriter("test1.txt")) {

            int l = (int) (Math.random() * 4 + 7); // array length
            int[] array = new int[l];

            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 5 + 7);
                String s = Integer.toString(array[j]);
                writerFile.write(s + " ");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static List<Integer> readFile() {
        List<Integer> ints = new ArrayList<Integer>();
        try (Reader readerFile = new FileReader("test1.txt")) {

            /* Read file with class Scanner */
            Scanner scan = new Scanner(readerFile);

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
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return ints;

    }

    private static void writeNewFile(List<Integer> integerList) {
        try (Writer writerNewFile = new FileWriter("test1.txt")) {

            writerNewFile.write(integerList.toString().replaceAll("[-+.^:,“”?]", "").replace("[", "").replace("]", ""));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


} // class


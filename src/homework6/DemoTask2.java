package homework6;


import java.io.*;

public class DemoTask2 {
    public static void main(String[] args) throws Exception {
        try (Writer writerFile = new FileWriter("test2.txt");
             Reader readerFile = new FileReader("test2.txt");
             BufferedReader bufferedReader = new BufferedReader(readerFile);
             Writer writerFileNew = new FileWriter("test2.txt")) {


            writerFile.write("All children, except one, grow up.");
            writerFile.append('\n');
            writerFile.write("They soon know that they will grow up, and the way Wendy knew was this.");
            writerFile.append('\n');
            writerFile.write("One day when she was two years old she was playing in a garden, and she plucked another flower and ran with it to her mother.");

            writerFile.close();

            /* Read file with class Scanner */
//            Scanner scan = new Scanner(readerFile);
//            String[] s = new String[3];
//            int i = 0;
//
//            while (scan.hasNextLine()) {
//                s[i] = scan.nextLine();
//                System.out.println(s[i]);
//                i++;
//            }
//            System.out.println(i);
//            scan.close();

            String line;
            String text="";
            while ((line = bufferedReader.readLine()) != null) {
                String[] strArray = line.split(" ");
                String temp;
                temp = strArray[0];
                strArray[0] = strArray[strArray.length - 1].replace(".","");
                strArray[strArray.length - 1] = temp+".";
                for (int i = 0; i < strArray.length; i++) {
                    text=text+" "+strArray[i];
                }
                text +='\n';
            }
            bufferedReader.close();

            writerFileNew.write(text);




        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
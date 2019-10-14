package homework4;

public class TasksString {
    public static void main(String[] args) {
        String s = "Mr. Darling used to boast to Wendy that her mother 764 not only loved 55.4 him but respected 55,6 him. He was one of those deep ones who know about stocks and shares. Of course no one really " +
                "knows, but he quite seemed to know, and he often said stocks were up and shares were down in a 6 way that would have made any woman respect him.";
        System.out.println(doFirstLetterBig(s)); // Task1
        System.out.println(countPunctuationMarks(s)); // Task2
        System.out.println(sumIntegers(s)); // Task3
        System.out.println(replaceLetter(s, 5, '^')); // Task4
        System.out.println(deletePartOfText(s, '“', '”')); // Task5
        countingWords(s); // Task6

    }

    private static String doFirstLetterBig(String s) {
        String[] words = s.split(" ");
        String wordWithBigLetter = "";
        for (String word : words) {
            wordWithBigLetter += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        return wordWithBigLetter;
    }

    private static int countPunctuationMarks(String s) {
        int numberMarks = 0;
        char[] marks = {'.', ',', '-', ':', ';', '?', '!'}; // massive of punctuation marks

        for (int i = 0; i < s.length(); i++) {
            //System.out.println(s.charAt(i));
            for (int j = 0; j < marks.length; j++) {
                if (s.charAt(i) == marks[j]) {
                    numberMarks++;
                }
            }
        }
        return numberMarks;
    }

    private static int sumIntegers(String s) {
        int summ = 0;
        char[] marks = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'}; // massive of digits
        String[] words = s.split(" ");
        for (String word : words) {
            if (!word.contains(".") && !word.contains(",")) {
                for (int j = 0; j < marks.length; j++) {
                    if (word.charAt(0) == marks[j]) {
                        summ += Integer.parseInt(word);
                        //  System.out.println(Integer.parseInt(word));
                    }
                }
            }
        }
        return summ;
    }

    /* 4. В каждом слове текста k-ю букву заменить заданным символом. Если  k больше длины слова, корректировку не выполнять. */
    private static String replaceLetter(String s, int k, char newSymbol) {
        String temp = "";
        String newText = "";
        for (String word : s.split(" ")) {
            if (k <= word.length()) {
                temp = "";
                temp += word.substring(0, k - 1);
                temp += newSymbol;
                temp += word.substring(k);
                word = temp;
            }
            newText += word + " ";
        }
        return newText;
    }

    /* 5. Удалить из текста его часть, заключенную между двумя символами, которые вводятся (например, между скобками ‘(’ и ‘)’ или между звездочками ‘*’ и т.п.).  */
    private static String deletePartOfText(String s, char firstSymbol, char secondSymbol) {
        String temp = "";
        String newText = "";
        for (String words : s.split(Character.toString(firstSymbol))) {
            if (words.contains(Character.toString(secondSymbol))) {
                temp = "";
                temp += words.substring(words.indexOf(Character.toString(secondSymbol)) + 1);
                words = temp;
            }
            newText += words + " ";
        }
        return newText;
    }

    /* 6.  Найти и напечатать, сколько раз повторяется в тексте каждое слово, которое встречается в нем. */
    private static void countingWords(String text) {
        String[] word2;
        text = text.replaceAll("\n", " ").replaceAll("[-+.^:,“”]", "");
        for (String word : text.split(" ")) {
            //  System.out.println("длинна = "+text.length());
            int k = 0;
            word2 = text.split(" ");
            for (int i = 0; i < word2.length; i++) {
                if (word2[i].toUpperCase().contains(word.toUpperCase())) {
                    k++;
                }
            }
            System.out.println(word.toUpperCase() + " counter:" + k);
        }
    }

}

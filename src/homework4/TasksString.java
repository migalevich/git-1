package homework4;

import java.util.Arrays;

public class TasksString {
    public static void main(String[] args) {
        String s = "We have a saying in English “Manners maketh man”. “Maketh” is an old form of “makes” or “make”. So the expression means that, " +
                "if you want to be a real man, you have to have good manners.\n" + "“Manners” means 55 the way that you behave to other people, " +
                "particularly in public. If you have good manners you are polite and courteous. You remember 66 to say “please” and “thank you”." +
                " You make people feel welcome and at ease. And if you have bad manners you are rude and discourteous? You say unpleasant things to " +
                "people? You make them feel unwelcome and upset.";
        System.out.println(s);
        System.out.println("------- Task 1 -------");
        System.out.println(doFirstLetterBig(s)); // Task1
        System.out.println("------- Task 2 -------");
        System.out.println(countPunctuationMarks(s)); // Task2
        System.out.println("------- Task 3 -------");
        System.out.println(sumIntegers(s)); // Task3
        System.out.println("------- Task 4 -------");
        System.out.println(replaceLetter(s, 5, '^')); // Task4
        System.out.println("------- Task 5 -------");
        System.out.println(deletePartOfText(s, '“', '”')); // Task5
        System.out.println("------- Task 6 -------");
        countingWords(s); // Task6
        System.out.println("------- Task 7 -------");
        countingLettersType(s);
        System.out.println("------- Task 8 -------");
        getWordsByLength(s, 3);

    }

    /* 1. Преобразовать текст так, чтобы каждое слово начиналось с заглавной буквы. */
    private static String doFirstLetterBig(String s) {
        String[] words = s.split(" ");
        String wordWithBigLetter = "";
        char mark = '“';
        for (String word : words) {
            if (word.charAt(0) == mark) {  /* дописать еще со скобкой случай */
                wordWithBigLetter += word.substring(0, 1) + Character.toUpperCase(word.charAt(1)) + word.substring(2) + " ";
            } else {
                wordWithBigLetter += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }
        return wordWithBigLetter;
    }

    /* 2. Подсчитать количество содержащихся в данном тексте знаков препинания */
    private static int countPunctuationMarks(String s) {
        int numberMarks = 0;
        char[] marks = {'.', ',', '-', ':', ';', '?', '!'}; // massive of punctuation marks

        for (int i = 0; i < s.length(); i++) {
            //System.out.println(s.charAt(i));
            for (char mark : marks) {
                if (s.charAt(i) == mark) {
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
                for (char mark : marks) {
                    if (word.charAt(0) == mark) {
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
        text = text.replaceAll("\n", " ").replaceAll("[-+.^:,“”?]", "");
        for (String word : text.split(" ")) {
            //  System.out.println("длинна = "+text.length());
            int k = 0;
            word2 = text.split(" ");
            for (String s : word2) {
                if (s.toUpperCase().contains(word.toUpperCase())) {
                    k++;
                }
            }
            System.out.println(word.toUpperCase() + " counter:" + k);
        }
    }

    /* 7. Найти, каких букв, гласных или согласных, больше в каждом предложении текста */
    private static void countingLettersType(String text) {
        text = text.replaceAll("\n", " "); //.replaceAll("[-+.^:,“”]", "");
        String[] sentences = text.split("[.!?]");
        for (String sentence : sentences) {
            int vowels = 0;
            int consonant = 0;
            String newSentence = sentence.replaceAll("[-+.^:,“”]", "").replaceAll("\\s", "").toLowerCase();
            vowels = newSentence.replaceAll("[aeyuio]", "").length();
            consonant = newSentence.length() - vowels;
            System.out.println("Sentence has vowels = " + vowels + " consonant = " + consonant);
        }
    }

    /* 8. Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины */
    private static void getWordsByLength(String text, int len) {
        text = text.replaceAll("\n", " ").replaceAll("[?]", "<question>?"); //.replaceAll("[-+.^:,“”]", "");
        String[] sentences = text.replaceAll("[-+^:,“”]", "").split("[.!?]");
        for (String sentence : sentences) {
            String wordsLen = "";
            if (sentence.endsWith("<question>")) { // choose questions
                System.out.println("Question: " + sentence.replaceAll("<question>", "?"));
                sentence = sentence.replaceAll("<question>", "").toLowerCase();
                String[] words = sentence.split(" ");
                for (String word : words) {
                    if (word.length() == len) {
                        if (!wordsLen.contains(word.trim().toLowerCase())) { // write words without duplicates
                            wordsLen += word.toLowerCase() + " ";
                        }
                    }
                }
                System.out.println("Words by length " + len + " from question: " + wordsLen);
            }
        }
    }

}

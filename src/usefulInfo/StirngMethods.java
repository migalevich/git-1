package usefulInfo;

public class StirngMethods {

    public static void main(String[] args) {
        char[] testArray = {'a', 'b', 'c'};
        byte[] byteArray = {66, 77, 88};
        int a = 'c';
        System.out.println("Char test: " + a);
        System.out.println(new String(testArray));
        System.out.println(new String(byteArray));
        System.out.println("asdasdasd");
        System.out.println(new String("asdasdasd" + "q2123123").intern());
        System.out.println("asdasdasd".equals("qweqweqw"));
        System.out.println("     asdasdasd      ".equalsIgnoreCase("     ASDASDASD      "));
        System.out.println("asdasdasd".concat("qweqweqw"));
        System.out.println("asdasdasd".length());
        System.out.println("asdasdasd".contains("sd"));
        System.out.println("asdasdasd".contains("qw"));
        System.out.println("asdasdasd".indexOf("qw"));
        System.out.println("asdasdasd".replace("as", "QQQ"));
        System.out.println("     asdasdasd      ".trim());
        System.out.println("     asdasdasd      ".substring(1));
        System.out.println("     asdasdasd      ".toLowerCase());
        System.out.println("     asdasdasd      ".toUpperCase());
        System.out.println("asdasdasd".split("a"));
    }
}

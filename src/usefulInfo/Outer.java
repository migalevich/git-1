package usefulInfo;


import java.util.Date;

/* Inner classes */
public class Outer {
    private String str = "hello";
    Inner in = new Inner();

    class Inner {
        public void method() {
            System.out.println(str);
            in.method(); // доступ к элементам внутреннего ТОЛЬКО из внешнего через объект  внутрненнего
        }
    }
}

/* Nested classes */
class Outer2 {
    private int i = 3;
    static int y = 5;

    static class Inner2 {
        public void method() {
            Outer2 out = new Outer2(); // должен создавать объект внешнего класса
            System.out.println(out.i);
            System.out.println(y); // все есть доступ к статическим переменным и методам внешнего класса
        }
    }
}

/* Anonymous classes */
class AnonymEx {
    public void ex() {
        Date d = new Date() { // объявление ананимного класса происходит одновременно с созданием объекта new
            @Override
            public String toString() {
                return "Override toString";
            }
        };
    }
}

/* Local classes */
class Outer3 {
    private String str = "hello";

        public void method() {
            class Inner3 { // класс внутри метода

            }
        }

}

/* Параметризация (перегрузка методов)*/
class GenericMethodOverload<T>{
    private T y;

    public static <Type> void method(Type obj){
        System.out.println(" <Type> void method(Type obj)");
    }
    public static void method(Number obj){
        System.out.println("static void method(Number obj)");
    }
    public static void method(Integer obj){
        System.out.println("static void method(Integer obj)");
    }
    public static void method(String obj){
        System.out.println("static void method(String obj)");
    }

    public static void main(String[] args) {
        Number number = new Integer(1);
        Integer integer = new Integer(2);
        method(number);
        method(integer);
        method(23);
        method("hello");
        method(new Date());
    }

}
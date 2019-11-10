package usefulInfo;

public class TestExceptions {
    public static void main(String[] args) {
        int a;
              try {
        a = 1;//args.length;
        System.out.println("a= " + a);
        //   int b = 42 / a;
        func(a);
//            int[] c = new int[a];
//            c[a] = 666;
//            throw new ArithmeticException("Деление на ноль ");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль " + e);
    }
//        catch (ArithmeticException|ArrayIndexOutOfBoundsException e){ // мульти catch
//           // System.out.println("Деление на ноль!!!"+e);
//            System.out.println("Ошибка "+e);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//         //   e.printStackTrace();
//            System.out.println(e);
//        }
    }

    public static void func(int a) throws ArithmeticException, IndexOutOfBoundsException {
        //       try {
        if (a == 1) {
           // a = a / (a - a);
            throw new ArithmeticException("00000000 очень вче плохо");
        }
        if (a == 2) {
//            int c[] = {1};
//            c[42] = 99;
            throw new IndexOutOfBoundsException("not found index");
        }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Индекс выходит за границу массива " + e);
//        }

    }


}

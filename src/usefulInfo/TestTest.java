package usefulInfo;

import java.io.Console;
import java.sql.SQLOutput;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TestTest {
    public void mQ(int i){
        System.out.println("mQ"+i);
    }
}

class   TestTest5 extends TestTest{
    public void mQ(int i){
        System.out.println("mQuest"+i);
    }

    public void mP(int i){
        System.out.println("mP"+i);
    }

    public static void main(String[] args) {
//        TestTest ob = new TestTest5();
//        ob.mQ(1);
//        System.out.println(ob);
//       // ob.mP(1); // err not found method

//        int i = 0;
//        i++;
//        System.out.print(i);
//        i = i++;
//        System.out.println(i);

//        NavigableSet<String> mySet = new TreeSet<>();
//        mySet.add("a"); mySet.add("b");mySet.add("c");
//        mySet.add("aa");mySet.add("bb");mySet.add("cc");
//        System.out.println(mySet.higher("aaa"));
//        System.out.println(mySet.lower("a"));
//        System.out.println(mySet.floor("a"));


//        Console c;
//        String id = c.readLine("%s", "Enter UserId:"); //1
//        System.out.println("userid is " + id); //2
//        String pwd = c.readPassword("%s", "Enter Password :"); //3
//        c.readPassword()
//        System.out.println("password is " + pwd); //4

        int[] a = { 1, 2, 3, 4 };
        int[] b = { 2, 3, 1, 0 };
        System.out.println( a [ (a = b)[3] ] );

//        int i = 0;
//        char ch = 'a';
//        i=ch;
//        System.out.println(i);
//        i = (int) ch;
//        System.out.println(i);
//       i = Character.getNumericValue(ch) ;
//        System.out.println(i);
//        i = Integer.parseInt(""+(int)ch);
//        System.out.println(i);
////        i = Integer.parseInt(""+ch);


       // String[] sA = {new String( "aaa")};
        String[] sA = { "aaa"};


        int size = 10;
        int[] arr = new int[size];
        for (int i = 0 ; i < size ; ++i) System.out.println(arr[i]);


    }





}

class TestClass
{
    static boolean b;
    static int[] ia = new int[1];
    static char ch;
    static boolean[] ba = new boolean[1];
    public static void main(String args[]) throws Exception
    {
        boolean x = false;
        if( b )
        {
            x = ( ch == ia[ch]);
        }
        else x = ( ba[ch] = b );
        System.out.println(x+" "+ba[ch]);
    }
}
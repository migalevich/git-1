package usefulInfo;

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

        int i = 0;
        i++;
        System.out.print(i);
        i = i++;
        System.out.println(i);

    }





}
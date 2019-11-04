package SerializationTest;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        DataObject obj = new DataObject();
        obj.setMyData("hahahahaha");
        File file = new File("Store.bin");

        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream so = new ObjectOutputStream(fo);
        so.writeObject(obj);
        so.flush();
        so.close();
        System.out.println(obj);

        /* чтение объета */
        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream si = new ObjectInputStream(fi);
        DataObject objNew = (DataObject) si.readObject();
        System.out.println(objNew);
        si.close();



    }

}

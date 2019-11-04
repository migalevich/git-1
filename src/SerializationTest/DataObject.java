package SerializationTest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class DataObject extends NonSerializable implements Serializable {
    private int i = 5;
    private String s = "aaa";
    private transient String[] def = {"a", "b", "c"};
    private CustomObject co = new CustomObject();


    @Override
    public String toString() {
        return "DataObject{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", def=" + Arrays.toString(def) +
                ", co=" + co +
                ", myData='" + myData + '\'' +
                '}';
    }

    private void writeObject(ObjectOutputStream out)
            throws IOException {
        out.defaultWriteObject();
        out.writeObject(getMyData());
    }

    private void readObject(ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        setMyData(in.readObject().toString());

    }

}

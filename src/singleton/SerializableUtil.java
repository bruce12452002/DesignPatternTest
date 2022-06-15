package singleton;

import java.io.*;

public class SerializableUtil {
    private final static String serializableName = "testSerializable";

    static <T> void serializable(T t) {
        try (
                FileOutputStream fos = new FileOutputStream(serializableName);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(t);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Object unSerializable() {
        try (
                FileInputStream fis = new FileInputStream(serializableName);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

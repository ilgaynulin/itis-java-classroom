import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainMessage {
    public static void main(String[] args) {

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Message.out"));
            Message msg = (Message) ois.readObject();
            System.out.println(msg);
            msg.saveImage();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

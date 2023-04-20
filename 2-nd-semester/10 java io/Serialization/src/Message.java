import java.io.*;

public class Message implements Serializable {
    private static final long serialVersionUID = 1;

    private String sender;
    private String message;
    private byte[] pic;
    private String picType;

    public Message(String sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public Message(String sender, String message, byte[] pic, String picType) {
        this.sender = sender;
        this.message = message;
        this.pic = pic;
        this.picType = picType;
    }

    @Override
    public String toString() {
        return "Сообщение от " +
                sender + ": " + message + ".";
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public String getPicType() {
        return picType;
    }

    public void setPicType(String picType) {
        this.picType = picType;
    }

    public void saveImage() {
        try {
            OutputStream os = new FileOutputStream("picIn." + picType);
            os.write(pic);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

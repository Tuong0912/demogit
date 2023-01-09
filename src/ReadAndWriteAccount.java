import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReadAndWriteAccount {
    public void write(Map<String, String> account, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(account);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("---------");
    }


    public Map<String, String> read(String path) {
        Map<String, String> account = new HashMap<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            account = (Map<String, String>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception eee) {
            eee.printStackTrace();
        }
        return account;
    }
}

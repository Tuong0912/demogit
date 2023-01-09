import TaiKhoan.Student;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteStudent {
    public void write(ArrayList<Student> students, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------");

    }


    public ArrayList<Student> read(String path) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (ArrayList<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ee) {
            ee.printStackTrace();
        }
        return students;
    }
}

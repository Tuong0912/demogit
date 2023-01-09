package TaiKhoan;

import java.io.Serializable;

public class Account implements Serializable {
    private String name;
    private String pass;

    public Account(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "name = '" + name + '\'' +
                ", pass = '" + pass + '\'' +
                '}';
    }
}

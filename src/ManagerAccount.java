import TaiKhoan.Account;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ManagerAccount {
    String path = "C:\\Users\\Admin\\Desktop\\QuanLySV\\src\\file\\taikhoan.txt";
    Main main = new Main();
    Scanner sc = new Scanner(System.in);
    ReadAndWriteAccount readAndWriteAccount = new ReadAndWriteAccount();
    static Map<String, String> quanlytk = new HashMap<>();

    public ManagerAccount() {
        quanlytk = readAndWriteAccount.read(path);
    }

    public boolean checkContainAccount(String name) {
        return quanlytk.containsKey(name);
    }

    public void registerAnAccount() {
        System.out.print("Nhập tên tài khoản : ");
        String name = sc.nextLine();
        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
        if (checkContainAccount(name)) {
            System.err.println("Tên tài khoản đã tồn tại");
            System.out.println("--------------------");
            System.out.print("Mời nhập lại tài khoản : ");
            String name1 = sc.nextLine();
            if (checkContainAccount(name1)) {
                System.err.println("Tên tài khoản đã tồn tại");
                System.out.println("--------------------");
                System.out.print("Mời nhập lại tài khoản : ");
                name1 = sc.nextLine();
                if (checkContainAccount(name1)) {
                    System.err.println("Bạn đã nhập sai quá 3 lần , mời nhập lại từ đầu");
                } else {
                    System.out.print("Mời nhập mật khẩu : ");
                    String pass2 = sc.nextLine();
                    if (pattern.matcher(pass2).matches()) {
                        accountAndPass(name1, pass2);
                        System.out.println("Đăng ky thành công");
                    } else {
                        System.err.println("Mật khẩu không đủ độ an toàn");
                    }
                }
            } else {
                System.out.print("Mời nhập mật khẩu : ");
                String pass1 = sc.nextLine();
                if (pattern.matcher(pass1).matches()) {
                    accountAndPass(name1, pass1);
                    System.out.println("Đăng ký thành công");
                } else {
                    System.out.println("Mật khẩu không đủ độ an toàn , mời nhập lại mật khẩu");
                    String pass2 = sc.nextLine();
                    if (pattern.matcher(pass2).matches()) {
                        accountAndPass(name1, pass2);
                        System.out.println("Đăng ký thành công");
                    } else System.err.println("Mật khẩu không đủ độ an toàn , mời nhập lại từ đầu");
                }
            }
        } else {
            System.out.print("Nhập mật khẩu : ");
            String pass = sc.nextLine();
            if (pattern.matcher(pass).matches()) {
                accountAndPass(name, pass);
                System.out.println("Đăng ký thành công");
            } else {
                System.out.println("Mật khẩu không đủ độ an toàn");
                System.out.println("Mời nhập mật khẩu");
                String pass1 = sc.nextLine();
                if (pattern.matcher(pass1).matches()) {
                    System.out.println("Đăng ký thành công");
                    accountAndPass(name, pass1);
                } else {
                    System.err.println("Mật khẩu không đủ độ an toàn");
                }
            }
        }
        readAndWriteAccount.write(quanlytk, path);
    }

    public void accountAndPass(String name, String pass) {
        Account account = new Account(name, pass);
        quanlytk.put(account.getName(), account.getPass());
    }

    public void changePassWord() {          //Dùng while để nhập đúng thì thôi
        System.out.print("Nhập tài khoản : ");
        String name = sc.nextLine();
        System.out.print("Nhập mật khẩu : ");
        String pass = sc.nextLine();
        if (quanlytk.containsKey(name)) {
            if (quanlytk.get(name).equals(pass)) {
                System.out.println("Mời nhập mật khẩu mới");
                String pass1 = sc.nextLine();
                System.out.println("Xác nhận lại mật khẩu mới");
                String pass2 = sc.nextLine();
                if (pass2.equals(pass1)) {
                    if (pass2.equals(pass)) {
                        System.out.println("Không được nhập lại mật khẩu cũ");
                        System.out.println("Mời nhập lại mật khẩu mới");
                        String pass3 = sc.nextLine();
                        System.out.println("Xác nhận lại mật khẩu mới");
                        String pass4 = sc.nextLine();
                        if (pass3.equals(pass4)) {
                            if (pass3.equals(pass)) {
                                System.out.println("Không được nhập lại mật khẩu cũ");
                                System.out.println("Mời nhập lại từ đầu");
                            } else {
                                Account account = new Account(name, pass3);  //check nhập lại pass khong trùng
                                quanlytk.put(account.getName(), account.getPass());
                                System.out.println("Đăng ký thành công");
                            }
                        } else {
                            Account account = new Account(name, pass4);
                            quanlytk.put(account.getName(), account.getPass());
                        }
                    } else {
                        Account account = new Account(name, pass2);
                        quanlytk.put(account.getName(), account.getPass());
                    }
                } else {
                    System.err.println("Sai mật khẩu");
                }
            } else {
                System.err.println("Sai mật khẩu");
            }
        } else {
            System.err.println("Tài khoản không tồn tại");
        }
        readAndWriteAccount.write(quanlytk, path);
    }

    public void loginUser() {
        System.out.print("Nhập tài khoản : ");
        String name = sc.nextLine();
        System.out.print("Nhập mật khẩu : ");
        String pass = sc.nextLine();
        if (quanlytk.containsKey(name)) {
            if (quanlytk.get(name).equals(pass)) {
                System.out.println("Đăng nhập thành công");
                main.studentMenu();
            } else {
                System.err.println("Sai mật Khẩu");
            }
        } else {
            System.err.println("Tài khoản không tồn tại ");
            System.out.println("------------------------");

        }
    }

    public void loginAdmin() {
        System.out.print("Mời nhập tài khoản : ");
        String taiKhoan = sc.nextLine();
        System.out.print("Mời nhập mật khẩu : ");
        String pass = sc.nextLine();
        if (taiKhoan.equals("admin")) {
            if (pass.equals("123")) {
                System.out.println();
                System.out.println("--- Chào mừng ADMIN ---");
                main.editAccountStudent();
            } else {
                System.err.println("Sai tài khoản hoặc mật khẩu");
            }

        } else {
            System.err.println("Sai tài khoản hoặc mật khẩu");
        }
    }

    public void forGotPassWord() {
        System.out.print("Mời nhập tài khoản : ");
        String name = sc.nextLine();
        if (quanlytk.containsKey(name)) {
            System.out.println("Mật khẩu của bạn là : " + quanlytk.get(name));
        } else {
            System.err.println("Tài khoản không tồn tại");
        }
    }
}

//  public void login() {
//        System.out.println("Nhập tài khoản");
//        String name = scanner.nextLine();
//        System.out.println("Nhập mật khẩu");
//        String password = scanner.nextLine();
//        if (quanlytk.containsKey(name)) {
//            if (quanlytk.get(name).equals(password)) {
//                System.out.println("Đăng nhặp thành công");
//                run.QuanLy();
//            } else {
//                System.out.println("Nhập lại mật khẩu");
//                String password1 = scanner.nextLine();
//                if (quanlytk.get(name).equals(password1)) {
//                    System.out.println("Đăng nhập thành công");
//                    run.QuanLy();
//                } else {
//                    System.out.println("Đăng nhập thất bại");
//                    System.exit(0);
//                }
//            }
//        } else {
//            System.out.println("Tài Khoản không tồn tại , mời bạn đăng ký hoặc đăng nhập lại");
//        }
//    }
//
//    public void dangKy() {
//
//        System.out.println("Nhập tài khoản");
//        String name = scanner.nextLine();
//        System.out.println("Nhập mật khẩu có ít nhất 1 chữ viết hoa , 1 số và 1 ký tự đặc biệt và dài từ 8 đến 15 ký tự :DD ");
//        String pass = scanner.nextLine();
//        Pattern p = Pattern.compile("((?=.*\\d)(?=.*[A-Z])(?=.*\\W).{8,15})");
//        if (!quanlytk.isEmpty() && quanlytk.containsKey(pass)) {
//            System.out.println("Tài khoản đã tồn tại");
//        } else if (p.matcher(pass).find()) {
//            TaiKhoan taiKhoan = new TaiKhoan(name, pass);
//            quanlytk.put(taiKhoan.getAcc(), taiKhoan.getPassword());
//            System.out.println("Đăng kí thành công");
//        } else {
//            System.out.println("Mật khẩu không đủ độ an toàn , mời nhập lại ");
//        }
//        ReadAndWrite.write(quanlytk);
//    }
//
//    public void doiMatKhau() {
//        System.out.println("Nhập tài khoản");
//        String name = scanner.nextLine();
//        System.out.println("Nhập mật khẩu");
//        String pass = scanner.nextLine();
//        if (quanlytk.containsKey(name)) {
//            if (quanlytk.get(name).equals(pass)) {
//                System.out.println("Nhập mật khẩu mới");
//                String pass1 = scanner.nextLine();
//
//                Pattern p = Pattern.compile("((?=.*\\d)(?=.*[A-Z])(?=.*\\W).{8,15})");
//                if (p.matcher(pass1).find()) {
//                    quanlytk.put(name, pass1);
//                    System.out.println("Đổi mật khẩu thành công");
//                }else {
//                    System.out.println("Mật khẩu không đủ an toàn , mời nhập lại");
//                }
//            } else {
//                System.out.println("Sai mật khẩu");
//            }
//        } else {
//            System.out.println("Tài khoản không tồn tại");
//        }
//    }



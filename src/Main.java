import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        login();
    }


    public static void login() {
        Scanner sc = new Scanner(System.in);
        ManagerAccount managerAccount = new ManagerAccount();
        while (true) {
            try {
                System.out.println();
                System.out.println("[1] Đăng nhập ADMIN");
                System.out.println("[2] Đăng Nhập sinh viên");
                System.out.println("[3] Đổi mật khẩu");
                System.out.println("[4] Nhập bất kỳ để thoát ( Except [1] -> [3] )");
                System.out.print("Nhập lựa chọn : ");
                int choice = Integer.parseInt(sc.nextLine());
                System.out.println();
                switch (choice) {
                    case 1 -> managerAccount.loginAdmin();
                    case 2 -> managerAccount.loginUser();
                    case 3 -> managerAccount.changePassWord();
                    default -> System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("Mời nhập lại");
            }
        }
    }

    public void studentMenu() {
        ManagerStudent managerStudent = new ManagerStudent();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println();
                System.out.println("[1] Đăng ký môn học");
                System.out.println("[2] Đăng ký bài kiểm tra");  // truongbwf hợp ko có môn trong đối tượng
                System.out.println("[3] Nhấn bất kỳ để đăng xuất");
                System.out.print("Nhập lựa chọn : ");
                int a = Integer.parseInt(sc.nextLine());
                switch (a) {
                    case 1 -> managerStudent.registerTheCourse();
                    case 2 -> managerStudent.registerForTheTest();

                    default -> {
                        return;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Chỉ nhập từ 1 đến 3");

            }
        }
    }

    public void adminMenu() {
        ManagerStudent managerStudent = new ManagerStudent();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println();
                System.out.println("Menu");
                System.out.println("[1] Thêm sinh viên vào danh sách");
                System.out.println("[2] Hiển thị danh sách");
                System.out.println("[3] Sửa theo id");
                System.out.println("[4] Hiển thị sinh viên có điểm thấp nhất");
                System.out.println("[5] Hiển thị sinh viên có điểm cao nhất");
                System.out.println("[6] Xóa sinh viên theo ID");
                System.out.println("[7] Tìm sinh viên theo tên đã nhập");
                System.out.println("[8] Kiểm tra những sinh viên học chung lớp");
                System.out.println("[9] Sắp xếp sinh viên theo điểm");
                System.out.println("[10] Đăng xuất");
                System.out.print("Mời nhập lựa chọn : ");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println();
                switch (a) {
                    case 1 -> managerStudent.add();
                    case 2 -> managerStudent.show();
                    case 3 -> managerStudent.edit();
                    case 4 -> {
                        System.out.println("Sinh viên có điểm thấp nhất là");
                        managerStudent.showMinPoint();
                    }
                    case 5 -> {
                        System.out.println("Sinh viên có điểm thấp nhất là");
                        managerStudent.showMaxPoint();
                    }
                    case 6 -> {
                        System.out.println("Danh sách sau khi sắp xếp");
                        managerStudent.delete();
                    }
                    case 7 -> managerStudent.search();
                    case 8 -> managerStudent.checkClass();
                    case 9 -> {
                        managerStudent.sortUpByPoint();
                        System.out.println("Danh sách sau khi sắp xếp");
                        managerStudent.show();
                    }
                    case 10 -> {
                        return;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại");
            }
        }
    }

    public void editAccountStudent() {
        System.out.println();
        ManagerAccount account = new ManagerAccount();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("[1] Chỉnh sửa thông tin tài khoản sinh viên");
                System.out.println("[2] Chỉnh sửa thông tin sinh viên");
                System.out.println("[3] Nhập bất kỳ để đăng xuất");
                System.out.print("Mời nhập lựa chọn : ");
                int choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1 -> {
                        while (true) {
                            try {
                                System.out.println();
                                System.out.println("[1] Đăng ký tài khoản cho sinh viên");
                                System.out.println("[2] Lấy lại mật khẩu cho sinh viên");
                                System.out.println("[3] Nhập bất kỳ để đăng xuất");
                                System.out.print("Mời nhập lựa chọn : ");
                                choose = Integer.parseInt(sc.nextLine());
                                switch (choose) {
                                    case 1 -> account.registerAnAccount();
                                    case 2 -> account.forGotPassWord();
                                    default -> {
                                        return;
                                    }
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Chỉ nhập từ [1] -> [3] ");
                            }

                        }
                    }
                    case 2 -> this.adminMenu();
                    default -> {
                        return;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Chỉ nhập từ [1] -> [2]");
            }

        }
    }
}
//Tham trị ( biến trong ngoặc phương thức
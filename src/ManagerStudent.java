import TaiKhoan.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ManagerStudent {

    SetOfJavaQuestion setOfJavaQuestion = new SetOfJavaQuestion();
    SetOfMathQuestion setOfMathQuestion = new SetOfMathQuestion();
    ReadAndWriteStudent readAndWriteStudent = new ReadAndWriteStudent();
    Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();
    String path = "C:\\Users\\Admin\\Desktop\\QuanLySV\\src\\file\\sinhvien.txt";

    int id = 0;

    public ManagerStudent() {
        students = readAndWriteStudent.read(path);
    }

    public void show() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
        readAndWriteStudent.write(students, path);
    }

    public void add() {
        System.out.print("nhập tên : ");
        String name = sc.nextLine();
        Pattern p = Pattern.compile("[a-zA-Z]{1,7}");
        do {
            if (p.matcher(name).matches()) {
                {
                    for (int i = 0; i < students.size(); i++) {
                        if (name.equals(students.get(i).ten())) {
                            System.out.println("Tên đã tồn tại , mời nhập lại");
                            name = sc.nextLine();
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Chỉ nhập chữ   -   Mời nhập lại");
                name = sc.nextLine();
            }
        } while (!p.matcher(name).matches());

        int age = 0;
        do {
            try {
                System.out.print("Nhập age : ");
                age = Integer.parseInt(sc.nextLine());
                if (age < 18 || age > 60) {
                    System.out.println("Chỉ nhập từ 18 -> 60");
                }
            } catch (NumberFormatException e) {
                System.out.println("Chỉ nhập số");
            }
        } while (age < 18 || age > 60);


        String gender;
        System.out.println("1. Chọn nam");
        System.out.println("2. Chọn nữ");
        System.out.println("3. Khác");
        System.out.print("Chọn giới tính : ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> gender = "Nam";
            case 2 -> gender = "Nữ";
            default -> gender = "Khác";
        }

        System.out.print("Nhập địa chỉ : ");
        String diaChi = sc.nextLine();

        for (Student s : students) {
            if (id < s.id()) {
                id = s.id();
            }
        }
        id++;

        String className;
        System.out.println("1. Lớp C10");
        System.out.println("2. Lớp C09");
        System.out.println("3. Lớp C08");
        System.out.println("4. Nhập để đăng ký lớp học");
        System.out.print("Chọn lớp để học : ");
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1 -> className = "C10";
            case 2 -> className = "C09";
            case 3 -> className = "C08";
            case 4 -> className = sc.nextLine();
            default -> className = "Chọn linh tinh , đánh bome -.-";
        }
//        Lop tenLop = new Lop(className);
        double dtb = 0;
        String monhoc = "";
        String hanhKiem = "";
        Student student1 = new Student(id, name, age, gender, diaChi, dtb, className, monhoc, hanhKiem);
        // id,  ten,  tuoi,  gender,  diaChi,  dtb,                         monHoc,  hanhKiem,  tenLop
        students.add(student1);
        readAndWriteStudent.write(students, path);
    }


    public void showMaxPoint() {
        double max = students.get(0).dtb();
        Student student = students.get(0);
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).dtb() > max) {
                max = students.get(i).dtb();
                student = students.get(i);
            }
        }
        System.out.println(student);
    }

    public void showMinPoint() {
        double min = students.get(0).dtb();
        Student student1 = students.get(0);
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).dtb() < min) {
                student1 = students.get(i);
            }
        }
        System.out.println(student1);
    }

    public void delete() {
        System.out.println("Nhập id cần xóa");
        int id = Integer.parseInt(sc.nextLine());
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).id()) {
                index = i;

            }
        }
        students.remove(index);
    }

    public void search() {
        System.out.println("Nhập tên cần tìm");
        String name = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).ten().toLowerCase().contains(name.toLowerCase())) {
                check = true;
                System.out.println(students.get(i));
            }
        }
        if (!check) {
            System.out.println("Không có tên tương ứng trong danh sách sinh viên");
        }
    }

    public void edit() {
        System.out.println("Nhập id cần sửa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).id()) {
                System.out.println("Nhập tên muốn sửa");
                String name = sc.nextLine();
                if (name.equals("")) {
                    System.out.println("không sửa");
                } else {
                    students.get(i).setTen(name);
                }

                System.out.println("Nhập tuổi muốn sửa");
                String age = sc.nextLine();
                if (age.equals("")) {
                    System.out.println("không sửa");
                } else {
                    students.get(i).setTuoi(Integer.parseInt(age));
                }

                System.out.println("Thay đổi giới tính");
                String gender;
                System.out.println("[1] Nam");
                System.out.println("[2] Nữ");
                System.out.println("[3] Khác");
                System.out.println("[4] Bỏ qua !! ");
                System.out.print("Chọn : ");
                int choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1 -> gender = "Nam";
                    case 2 -> gender = "Nữ";
                    default -> gender = "Khác";
                }
                if (choose == 4) {
                    System.out.println("Không sửa");
                } else {
                    students.get(i).setGender(gender);
                }

                System.out.println("Nhập địa chỉ muốn sửa");
                String diaChi = sc.nextLine();
                if (diaChi.equals("")) {
                    System.out.println("Không sửa");
                } else {
                    students.get(i).setDiaChi(diaChi);
                }

//                System.out.println("Nhập điểm trung bình muốn sửa");
//                String dtb = sc.nextLine();
//                if (dtb.equals("")) {
//                    System.out.println("Không sửa");
//                } else {
//                    students.get(i).setDtb(Double.parseDouble(dtb));
//                }
            }
        }
        readAndWriteStudent.write(students, path);
    }

    public void checkClass() {
        System.out.println("[1] C10");
        System.out.println("[2] C09");
        System.out.println("[3] C08");
        System.out.println("[4] Khác");
        System.out.print("Mời nhập lựa chọn : ");
        int choice = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        switch (choice) {
            case 1 -> {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).tenLop().equalsIgnoreCase("C10")) {
                        System.out.println(students.get(i).toString());
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Không có sinh viên học lớp này");
                }
            }
            case 2 -> {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).tenLop().equalsIgnoreCase("C09")) {
                        System.out.println(students.get(i).toString());
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Không có sinh viên học lớp này");
                }
            }
            case 3 -> {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).tenLop().equalsIgnoreCase("C08")) {
                        System.out.println(students.get(i).toString());
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Không có sinh viên học lớp này");
                }
            }
            case 4 -> {
                System.out.println("Mời nhập tên lớp : ");
                String className = sc.nextLine();
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).tenLop().equalsIgnoreCase(className)) {
                        System.out.println(students.get(i).toString());
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Không có sinh viên học lớp này");
                }
            }
        }
    }

    public void registerTheCourse() {
        System.out.print("Nhập tên sinh viên muốn đăng ký môn học : ");
        String nameHocSinh = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (nameHocSinh.equalsIgnoreCase(students.get(i).ten())) {
                if (students.get(i).getMonHoc().equals("")) {
                    students.get(i).setMonHoc(chooseASubject());
                    check = true;
                } else {
                    System.out.println();
                    System.out.println("Sinh viên đã đăng ký môn rồi");
                    return;
                }
            }
        }
        if (!check) System.out.println("Sinh viên không tồn tại");

        readAndWriteStudent.write(students, path);
    }


    public String chooseASubject() {
        String nameOject;
        System.out.println("Chọn môn học");
        System.out.println("[1] Toán");
        System.out.println("[2] Java");
        System.out.println("[3] Anh");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> nameOject = "Toán";
            case 2 -> nameOject = "Java";
            case 3 -> nameOject = "Anh";
            default -> nameOject = "";
        }
        readAndWriteStudent.write(students, path);
        return nameOject;

    }

    public String setConductStudents(double dtb) {
        if (dtb == 10) {
            return "Xuất sắc";
        } else if (dtb > 8.5) {
            return "Giỏi";
        } else if (dtb > 6.5) {
            return "Khá";
        } else {
            return "Trung Bình";
        }
    }

    public void registerForTheTest() {
        System.out.print("Nhập tên sinh viên để kiểm tra : ");
        boolean check = false;
        String nameStudent = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (nameStudent.equalsIgnoreCase(students.get(i).ten())) {
                check = true;
                if (students.get(i).dtb() > 0) {
                    System.out.println();
                    System.out.println("Sinh viên đã hoàn thành bài thi , không được làm lại");
                    return;
                } else {
                    if (students.get(i).getMonHoc().equalsIgnoreCase("Java")) {
                        students.get(i).setDtb(this.practiceWithJava());
                        students.get(i).setHanhKiem(this.setConductStudents(students.get(i).dtb()));
                        break;
                    }
                    if (students.get(i).getMonHoc().equalsIgnoreCase("Toán")) {
                        students.get(i).setDtb(this.practiceWithMath());
                        students.get(i).setHanhKiem(this.setConductStudents(students.get(i).dtb()));
                        break;
                    }
                }
            }
        }
        if (!check) {
            System.err.println("Sinh viên không tồn tại !! ");
        }
        readAndWriteStudent.write(students, path);
    }

    public double practiceWithMath() {
        return setOfMathQuestion.mathTest();
    }

    public double practiceWithJava() {
        return setOfJavaQuestion.javaTest();
    }

    public void sortUpByPoint() { //Sắp xếp tăng dần
        Collections.sort(this.students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.dtb() < o2.dtb()) {
                    return -1;
                } else if (o1.dtb() > o2.dtb()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

}


//    private void demo(String nameSinhVien) {
//        for (int i = 0; i < students.size(); i++) {
//            if (nameSinhVien.equalsIgnoreCase(students.get(i).ten())) {
//                if (students.get(i).getMonHoc().equalsIgnoreCase("Java")) {
//                    if (students.get(i).dtb() == 10) {
//                        students.get(i).setHanhKiem("Giỏi");
//                    } else if (students.get(i).dtb() > 8.5) {
//                        students.get(i).setHanhKiem("Giỏi");
//                    } else if (students.get(i).dtb() > 6.5) {
//                        students.get(i).setHanhKiem("Khá");
//                    } else {
//                        students.get(i).setHanhKiem("Trung Bình");
//                    }
//                    break;
//                }
//            }
//        }
//    }

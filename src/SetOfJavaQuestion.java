import java.time.LocalTime;
import java.util.Scanner;

public class SetOfJavaQuestion {
    Scanner sc = new Scanner(System.in);
    LocalTime localTime;

    public double javaTest() {
        int countHint = 3;
        int countCode = 0;
        localTime = LocalTime.now();
        System.out.println( "                           Thời gian bắt đầu làm " + localTime);
        System.out.println();
        System.out.println();

        System.out.println("                            ------ BÀI KIỂM TRA JAVA ------");
        System.out.println("                                   Bạn có 2' làm bài");
        System.out.println();

        System.out.println("                            ------ Bạn có 3 lần gợi ý ------");
        System.out.println("                                  Nhấn Y để dùng gợi ý");


        System.out.println();
        System.out.println("                            Câu 1 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("                            Tìm lỗi sai về định nghĩa phương thức trong lớp sau:");
        System.out.println("""
                1                                class MyClass {
                2                                String method1() {
                3                                return "A";\s
                4                                }\s
                5                                void method() {
                6                                }\s
                7                                double method() {
                8                                return 1.5;\s
                9                                }\s
                10                                method() {\s
                11                                 }\s
                12                                } \s""");
        System.out.println();
        System.out.println("""
                Select one:

                a. void method(){}

                b. String method1(){return "A";}

                c. double method(){return 1.5;}

                d. method(){}\s""");
        System.out.println();

        System.out.print("Mời nhập đáp án : ");
        String a = sc.nextLine();
        if (a.equalsIgnoreCase("Y")) {
            System.out.println("Đáp án là : d. method(){}");
            countHint--;
            System.out.print("Mời nhập đáp án : ");
            String b = sc.nextLine();
            if (b.equalsIgnoreCase("D")) {
                System.out.println("Đúng");
                countCode++;
                Integer countCode1 = checkTime(countCode);
                if (countCode1 != null) return countCode1;
            } else System.err.println("Sai     Đáp án : d. method(){}");
        } else if (a.equalsIgnoreCase("D")) {
            System.out.println("Đúng");
            countCode++;
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        } else {
            System.err.println("Sai     Đáp án : d. method(){}");
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        }


        System.out.println();


        System.out.println();
        System.out.println("                            Câu 2 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("                            Có mấy 'Dạng' kế thừa trong Java  ");
        System.out.print("Mời nhập đáp án : ");
        a = sc.nextLine();
        if (a.equalsIgnoreCase("Y")) {
            System.out.println("Đáp án là : 3");
            countHint--;
            System.out.print("Mời nhập đáp án : ");
            String b = sc.nextLine();
            if (b.equals("3")) {
                System.out.println("Đúng");
                countCode++;
                Integer countCode1 = checkTime(countCode);
                if (countCode1 != null) return countCode1;
            } else {
                System.err.println("Sai");
                System.err.println("Có 3 dạng kế thừa chính trong Java");
                System.err.print(" Kế thừa từ Class - ");
                System.err.print(" Kế thừa từ lớp trừu tượng (Abstract class) - ");
                System.err.println(" Kế thừa từ Interface");
                Integer countCode1 = checkTime(countCode);
                if (countCode1 != null) return countCode1;
            }
        } else if (a.equals("3")) {
            System.out.println("Đúng");
            countCode++;
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        } else {
            System.err.println("Sai");
            System.err.println("Có 3 dạng kế thừa chính trong Java");
            System.err.print("Kế thừa từ Class - ");
            System.err.print(" Kế thừa từ lớp trừu tượng (Abstract class) - ");
            System.err.println(" Kế thừa từ Interface");
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        }

        System.out.println("----------------------------------------------");


        System.out.println("                            Câu 3 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("                            Mời đọc dòng lệnh sau");
        System.out.println("                            Kiểm tra số nguyên tố ");
        System.out.println(
                """
                        1                                    Scanner scanner = new Scanner(System.in);
                        2                                    while (true) {
                        3                                        System.out.print("Enter a number:");
                        4                                        int number = scanner.nextInt();
                        5                                        if (number < 2) {
                        6                                            System.out.println(number + " is not a prime");
                        7                                        } else {
                        8                                            int i = 2;
                        9                                            boolean check = true;
                        10                                            while (i <= Math.sqrt(number)) {
                        11                                               if (number % i != 0) {
                        12                                                  check = false;
                        13                                                 break;
                        14                                            }
                        15                                           i++;
                        16                                      }
                        17                                            if (check)
                        18                                                System.out.println(number + " is a prime");
                        19                                            else
                        20                                                System.out.println(number + " is not a prime");
                        21                                        }
                        22                                    }
                        """);
        System.out.println("Nhập vị trí không đúng trong đoạn code trên");
        System.out.print("Mời nhập đáp án : ");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("Y")) {
            System.out.println("Đáp án là : 11");
            countHint--;
            System.out.print("Mời nhập đáp án : ");
            String b = sc.nextLine();
            if (b.equals("11")) {
                System.out.println("Đúng");
                countCode++;
                Integer countCode1 = checkTime(countCode);
                if (countCode1 != null) return countCode1;
            } else {
                System.err.println("Sai     Đáp án : Vị trí 11");
                Integer countCode1 = checkTime(countCode);
                if (countCode1 != null) return countCode1;
            }
        } else if (input.equalsIgnoreCase("11")) {
            System.out.println("Đúng");
            countCode++;
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        } else {
            System.err.println("Sai     Đáp án : Vị trí 11");
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        }


        System.err.println();


        System.out.println("                            Câu 4 ( Bạn có " + countHint + " lần gợi ý ) ");
        System.out.println("                                        Map         ");
        System.out.println("                                ↗              ↖     ");
        System.out.println("                             AbstractMap     SortedMap");
        System.out.println("                                 ∆    ↖          ⇡ ");
        System.out.println("                                 |      ↖     NavigableMap");
        System.out.println("                                 |        ↖      ↗    ");
        System.out.println("                               ???        TreeMap");
        System.out.print("Nhập đáp án : ");


        String hashMap = sc.nextLine();


        if (hashMap.equalsIgnoreCase("Y")) {
            if (countHint == 0) {
                System.out.println("Bạn đã dùng hết gợi ý");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("HashMap")) {
                    System.out.println("Đúng");
                    countCode++;
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                } else System.err.println("Sai     Đáp án : HashMap");
            } else {
                countHint--;
                System.out.println("Gợi ý : Has...");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("HashMap")) {
                    System.out.println("Đúng");
                    countCode++;
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                } else {
                    System.err.println("Sai     Đáp án : HashMap");
                    System.out.println();
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                }
            }

        } else if (hashMap.equalsIgnoreCase("HashMap")) {
            System.out.println("Đúng");
            countCode++;
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        } else {
            System.err.println("Sai     Đáp án : HashMap");
            System.out.println();
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        }


        System.out.println();


        System.out.println("                            Câu 5 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("                            Trong Map , một cặp Key - Value được gọi là gì ?");
        System.out.print("Nhập đáp án : ");
        String entry = sc.nextLine();
        if (entry.equalsIgnoreCase("Y")) {
            if (countHint == 0) {
                System.out.println("Bạn đã dùng hết gợi ý");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("Entry")) {
                    System.out.println("Đúng");
                    countCode++;
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                } else System.err.println("Sai     Đáp án : Entry");
            } else {
                System.out.println("Gợi ý : En...");
                countHint--;
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("Entry")) {
                    System.out.println("Đúng");
                    countCode++;
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                } else System.err.println("Đã gợi ý còn sai , gà vl");
            }
        } else if (entry.equalsIgnoreCase("Entry")) {
            System.out.println("Đúng");
            countCode++;
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        } else {
            System.out.println("Sai       Đáp án : Entry");
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        }

        System.out.println();


        System.out.println("                            Câu 6 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("""
                                            Giả sử có 2 lớp NhanVien và TruongPhong được khai báo như sau?\s

                                            public class NhanVien {
                                                public String hoTen;
                                                protected double luong;

                                                public NhanVien(String hoTen, double luong) {
                                                }

                                                void xuat() {
                                                }

                                                private double getThuNhap() {
                                                    return 0;
                                                }
                                            }

                                            public class TruongPhong extends NhanVien {
                                                public double trachNhiem;

                                                public TruongPhong(String hoTen, double luong, double trachNhiem) {
                                                }

                                                public void xuat() {
                                                    super.hoTen = "Tuấn";
                                                    super.luong = 500;
                                                    super.xuat();
                                                    double thuNhap = super.getThuNhap();
                                                }
                                            }
                """);
        System.out.println("                            Hãy chọn dòng mã lệnh phát sinh lỗi lúc dịch");
        System.out.print(" ");
        System.out.println("""

                                                  a. super.hoTen = "Tuấn"

                                                  b. double thuNhap = super.getThuNhap()

                                                  c. super.luong = 500

                                                  d. super.xuat()\
                                                  
                """);
        System.out.print("Mời nhập đáp án : ");
        String bb = sc.nextLine();
        if (bb.equalsIgnoreCase("Y")) {
            if (countHint == 0) {
                System.out.println("Bạn đã dùng hết gợi ý");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("b")) {
                    System.out.println("Đúng");
                    countCode++;
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                } else System.out.println("Sai     Đáp án : b. double thuNhap = super.getThuNhap()");
            } else {
                System.out.println("Gợi ý : b. double thuNhap = super.getThuNhap()");
                countHint--;
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("b")) {
                    System.out.println("Đúng");
                    countCode++;
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                } else System.err.println("Sai     Đáp án : b. double thuNhap = super.getThuNhap() ");
            }
        } else if (bb.equalsIgnoreCase("B")) {
            System.out.println("Đúng");
            countCode++;
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        } else {
            System.err.println("Sai     Đáp án : b. double thuNhap = super.getThuNhap()");
        }


        System.out.println();


        System.out.println("                            Câu 7 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("                            Từ khoá gì được sử dụng để kế thừa Interface ?");
        System.out.print("Nhập đáp án : ");
        String extend = sc.nextLine();
        if (extend.equalsIgnoreCase("Y")) {
            if (countHint == 0) {
                System.out.println("Bạn đã dùng hết gợi ý");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("extends")) {
                    System.out.println("Đúng");
                    countCode++;
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                } else System.err.println("Sai     Đáp án : extends");
            } else {            //Khi countHint != 0
                countHint--;
                System.out.println("Gợi ý : ex...");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("extends")) {
                    System.out.println("Đúng");
                    countCode++;
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                } else {
                    System.err.println("Sai       Đáp án : extends");
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                }
            }


        } else if (extend.equalsIgnoreCase("Extends")) {
            System.out.println("Đúng");
            countCode++;
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        } else {
            System.err.println("Sai       Đáp án : extends");
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        }

        System.out.println();


        System.out.println("                            Câu 8 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("                                     Collection  ");
        System.out.println("                                   ↗            ↖ ");
        System.out.println("                                list      AbstractCollection");
        System.out.println("                                   ↖            ↗   ");
        System.out.println("                                        ?????        ");
        System.out.print("Mời nhập đáp án : ");
        String abstractList = sc.nextLine();
        if (abstractList.equalsIgnoreCase("Y")) {
            if (countHint == 0) {
                System.out.println("Bạn đã dùng hết gợi ý");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("AbstractList")) {
                    System.out.println("Đúng");
                    countCode++;
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                } else System.err.println("Sai     Đáp án : AbstractList");
            } else {
                countHint--;
                System.out.println("Gợi ý : Abs...");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("AbstractList")) {
                    System.out.println("Đúng");
                    countCode++;
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                } else {
                    System.err.println("Sai       Đáp án : AbstractList");
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                }
            }


        } else if (abstractList.equalsIgnoreCase("AbstractList")) {
            System.out.println("Đúng");
            countCode++;
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        } else {
            System.err.println("Sai     Đáp án : AbstractList");
        }


        System.out.println();


        System.out.println("                            Câu 9 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("                            Phương thức sau đây là loại sắp xếp gì ");
        System.out.println("""
                public static void sort(int[] array)
                {
                                             int min;
                                                for (int  i = 0; i < array.length - 1; i++){
                                                    min = i;
                                                 for(int j = i + 1; j < array.length; j++)
                                                      if (array[j] < array[min])
                                                         min = j;
                                                  if (min != i){
                                                       int temp = array[min];
                                                        array[min] = array[i];
                                                      array[i] = temp;
                                                 }
                                              }
                }""");
        System.out.println("A. Bubble Sort  ");
        System.out.println("B. Choose Sort  ");
        System.out.println("C. Insertion Sort   ");
        System.out.println("D. Selection Sort   ");
        System.out.print("Mời nhập đáp án : "); //Thuật toán sắp xếp chọn (Selection Sort)
        String selectionSort = sc.nextLine();
        if (selectionSort.equalsIgnoreCase("Y")) {
            if (countHint == 0) {
                System.out.println("Bạn đã dùng hết gợi ý");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("D")) {
                    System.out.println("Đúng");
                    countCode++;
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                } else System.err.println("Sai     Đáp án : D. Selection Sort ");
            } else {
                countHint--;
                System.out.println("Gợi ý : Sắp xếp chọn");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("D")) {
                    System.out.println("Đúng");
                    countCode++;
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                } else {
                    System.err.println("Sai       Đáp án : D. Selection Sort ");
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                }
            }


        } else if (selectionSort.equalsIgnoreCase("D")) {
            System.out.println("Đúng");
            countCode++;
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        } else {
            System.err.println("Sai    Đáp án : D. Selection Sort ");
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        }

        System.out.println();
        System.out.println("                            Câu 10 ( Bạn có " + countHint + " lần gợi ý )");
        System.out.println("""
                                           Phương thức nào không sử dụng để duyệt cây ?

                                           Select one:

                                           a. Duyệt hậu thứ tự (Post-order Traversal)

                                           b. Duyệt trung thứ tự (In-order Traversal)
                                           \s

                                           c. Duyệt tiền thứ tự (Pre-order Traversal)
                                           \s

                                           d. Duyệt tuyến tính (Linear Traversal)
                                           Feedback
                """);
        System.out.println("                    Bạn có " + countHint + " lần gợi ý");
        System.out.print("Nhập đáp án : ");
        String linearTraversal = sc.nextLine();
        if (linearTraversal.equalsIgnoreCase("Y")) {
            if (countHint == 0) {
                System.out.println("Bạn đã dùng hết gợi ý");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("D")) {
                    System.out.println("Đúng");
                    countCode++;
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                } else System.err.println("Sai     Đáp án : d. Duyệt tuyến tính (Linear Traversal)\n" +
                        "                Feedback");
            } else {
                System.out.println("Gợi ý : Duyệt t....");
                System.out.print("Mời nhập đáp án : ");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase("D")) {
                    System.out.println("Đúng");
                    countCode++;
                    Integer countCode1 = checkTime(countCode);
                    if (countCode1 != null) return countCode1;
                } else System.err.println("Sai       Đáp án : d. Duyệt tuyến tính (Linear Traversal)\n" +
                        "                Feedback");
            }
        } else if (linearTraversal.equalsIgnoreCase("D")) {
            System.out.println("Đúng");
            countCode++;
            Integer countCode1 = checkTime(countCode);
            if (countCode1 != null) return countCode1;
        } else System.err.println("Sai     Đáp án : d. Duyệt tuyến tính (Linear Traversal) Feedback");

        System.out.println();

        System.out.println("                                   Điểm kiểm tra " + countCode + "đ");
        return countCode;

    }

    private Integer checkTime(int countCode) {
        LocalTime time = LocalTime.now();
        if (time.getMinute() - localTime.getMinute() == 2 || time.getMinute() - localTime.getMinute() == 3) {
            System.out.println("LocalTime" + localTime);
            System.out.println("Time" + time);
            System.err.println("Hết giờ , điểm của bạn là : " + countCode + " điểm");
            System.out.println("--------------------------------------");
            return countCode;
        }
        return null;
    }
    //        } else {
    //            System.err.println("Sai       Đáp án : extends");
    //            Integer countCode1 = checkTime(countCode);
    //            if (countCode1 != null) return countCode1;
    //        }


    //Tìm hiểu thêm về luồng timeline ( thời gian giảm dần cho bài kiểm tra ) - DONE !!!! - ( Sử dụng LocalTime )
    //Ném bộ câu hỏi sang 1 file text cùng đáp án - "Too hard for me"
}

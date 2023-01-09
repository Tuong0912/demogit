import java.time.LocalTime;
import java.util.Scanner;

public class SetOfMathQuestion {  //Tại bất kì 1 câu hỏi nào , nếu thời gian hết thì hãy cho làm nốt câu rồi mới kết thúc
    Scanner sc = new Scanner(System.in);

    LocalTime localTime; // Bắt đầu làm bài thì biến " d " sẽ lưu thời gian tại thời điểm đó

    public double mathTest() { //Tại tất cả các câu hỏi , khai báo lại biến timenow để lưu thời gian tại thời điểm đó
        localTime = LocalTime.now();
        int count = 0;
        System.out.println("------ BÀI KIỂM TRA TOÁN ------");
        System.out.println("       Bạn có 45' làm bài");
        System.out.println();


        System.out.println("1 + 1 = ?");
        int a = Integer.parseInt(sc.nextLine());
        if (a == 2) {
            System.out.println("Đúng");
            count++;
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        } else {
            System.out.println("Sai");
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        }


        System.out.println("2 + 1 = ?");
        int b = Integer.parseInt(sc.nextLine());
        if (b == 3) {
            System.out.println("Đúng");
            count++;
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        } else {
            Integer count1 = integer(count);
            if (count1 != null) return count1;
            System.out.println("Sai");
        }


        System.out.println("100 + 1 = ?");
        int c = Integer.parseInt(sc.nextLine());
        if (c == 101) {
            System.out.println("Đúng");
            count++;
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        } else {
            System.out.println("Sai");
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        }


        System.out.println("1+11");
        a = Integer.parseInt(sc.nextLine());
        if (a == 12) {
            System.out.println("Đúng");
            count++;
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        } else {
            System.out.println("Sai");
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        }


        System.out.println("123*321");
        a = Integer.parseInt(sc.nextLine());
        if (a == 343) {
            System.out.println("Đúng");
            count++;
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        } else {
            System.out.println("Sai");
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        }


        System.out.println("Pi = ?");
        System.out.println("Làm tròn đến 4 số ");
        double d = Double.parseDouble(sc.nextLine());
        if (d == 3.1415) {
            System.out.println("Đúng");
            count++;
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        } else {
            System.out.println("Sai");
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        }


        System.out.println(" 123+321 = ?");
        a = Integer.parseInt(sc.nextLine());
        if (a == 444) {
            System.out.println("Đúng");
            count++;
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        } else {
            System.out.println("Sai");
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        }


        System.out.println("1 + 1 = ?");
        a = Integer.parseInt(sc.nextLine());
        if (a == 2) {
            System.out.println("Đúng");
            count++;
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        } else {
            System.out.println("Sai");
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        }


        System.out.println("1 + 1 = ?");
        a = Integer.parseInt(sc.nextLine());
        if (a == 2) {
            System.out.println("Đúng");
            count++;
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        } else {
            System.out.println("Sai");
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        }


        System.out.println("1 + 1 = ?");
        a = Integer.parseInt(sc.nextLine());
        if (a == 2) {
            System.out.println("Đúng");
            count++;
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        } else {
            System.out.println("Sai");
            Integer count1 = integer(count);
            if (count1 != null) return count1;
        }
        return count;
    }

    private Integer integer(int count) {
        LocalTime d2 = LocalTime.now();
        if (d2.getMinute() - localTime.getMinute() == 1 || d2.getMinute() - localTime.getMinute() == 2) {
            System.err.println("Hết giờ , điểm của bạn là : " + count + " điểm");
            System.out.println();
            return count;
        }
        return null;
    }
}

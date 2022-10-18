# demogit
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<!--Bài 1: Tạo hàm alertMessage() hiển thị hộp thoại chứa chuỗi-->
<!--"Xin chao". Gọi hàm từ trong phần "body" của trang web.-->
<!--<script>-->
<!--    function alertMessage(a){-->
<!--        return a;-->
<!--    }-->
<!--    let a="Xin chào";-->
<!--    alert(alertMessage(a));-->
<!--Bài 2: Tạo hàm nhận vào một đối số dạng số, tăng giá trị đối số đó lên 1 và trả lại giá trị cho lời gọi hàm.
Gọi hàm từ trong phần"body" của trang web và hiển thị kết quả lên màn hình.-->
<!--<script>-->
<!--function ham(a){-->
<!--    b=a+1;-->
<!--    return b;-->
<!--}-->
<!-- let c=ham(5);-->
<!--alert(c);-->
<!--</script>-->
<!--Bài 3: Tạo hàm nhận vào hai tham số. Nếu giá trị của tham số thứ nhất lớn hơn tham số thứ hai, hiển thị hộp thoại thông -->
<!--báo cho người dùng. Nếu giá trị của tham số thứ nhất nhỏ hơn hoặc bằng tham số thứ hai, trả về tổng của hai tham số.-->
<!--<script>-->
<!--    function tong(){-->
<!--        if(a>b)-->
<!--            return alert("smt");-->
<!--        else-->
<!--            c=a+b;-->
<!--        return c;-->
<!--    }-->
<!--    let a = +prompt("Nhập a");-->
<!--    let b = +prompt("Nhập b");-->
<!--    let c=0;-->
<!--    document.write(tong());-->
<!--</script>-->
<!--Bài 4>-->
<!--<script>-->
<!--    function addNumbers() {-->
<!--        firstNum = 4;-->
<!--        secondNum = 8;-->
<!--        result = firstNum + secondNum;-->
<!--        return alert(result);-->
<!--    }-->
<!--    alert(result = 0) ;-->
<!--     result = addNumbers();-->
<!--     alert(result);-->
<!--</script>-->
<!--Bài 5-->
<script>
    let star1 = ["Polaris", "Aldebaran", "Deneb", "Vega", "Altair", "Dubhe", "Regulus"]
    let star2 = ["Ursa Minor", "Tarurus", "Cygnus", "Lyra", "Aquila", "Ursa Major", "Leo"]

    function check_star(star) {
        let result = "";
        for (let i = 0; i < star1.length ; i++) {
            if (star == star1[i]) {
                result = star2[i];
                return result;
            }
        }
        result = "Không tìm thấy sao";
        return result;
    }
    let star = prompt("Nhập vào ngôi sao: ")
    document.write(check_star(star));
</script>
</body>
</html>

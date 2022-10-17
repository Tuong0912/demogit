# demogit
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table>
  <input type="number" id="a">
  <input type="number" id="b">
  <button onclick="cong()">Cộng</button>
  <button onclick="tru()">Trừ</button>
  <button onclick="nhan()">Nhân</button>
  <button onclick="chia()">Chia</button>

  <p id="end">kết quả</p>
  <script>
    function cong()
    {
      let a = +document.getElementById("a").value;
      let b = +document.getElementById("b").value;
      let tong = a + b;
      document.getElementById("end").innerHTML= tong;
    }
    function tru(){
      let a = +document.getElementById("a").value;
      let b = +document.getElementById("b").value;
      let tru = a - b ;

      document.getElementById("end").innerHTML = tru
    }
    function nhan() {
      let a = +document.getElementById("a").value;
      let b = +document.getElementById("b").value;
      let nhan = a * b;
      document.getElementById("end").innerHTML = nhan;
    }
    function  chia(){
      let a = +document.getElementById("a").value;
      let b = +document.getElementById("b").value;
      let chia = a / b;
      document.getElementById("end").innerHTML = chia;
    }
  </script>
</table>
</body>
</html>

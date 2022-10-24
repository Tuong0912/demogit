# demogit
<!--Bài 1
<script>
  function findAvg() {
    let arr=[1,2,3,4,5,6,7,8,9,10]
    let sum=0;
    let avg=0;
    for (let i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    avg=sum/arr.length;
    console.log(avg);
  }
  findAvg();
</script>-->

<!--Bài 2
<script>
  let arr=[1,2,3,4,5,6,7,8];
  let x = +prompt("Nhập X");
  let index=+prompt("Nhập index");
  function insertNumberToArray() {
    if (x < 0 || x > arr.length) {
      alert(arr) ;
    }
    else{
      arr.splice(index,0,x);
      console.log(arr);
    }
  }
  insertNumberToArray();
</script>-->

<!--Bài 3
<script>

  let arr = [];
  let x = +prompt("Nhập X")
  let tong=0;
  sumOfListPrime(x,tong);
  function sumOfListPrime(x,tong,) {
    for (j = 0; j < x; j++) {
      if (checkNguyenTo(j) == true) {
        arr.push(j);
        tong+=j;
      }
    }
    document.write(arr);
    document.write(tong);
  }

  function checkNguyenTo(number) {
    if (number > 1 && number <= 3) {
      return true;
    } else {
      for (let i = 2; i < number; i++) {


        if (number % i == 0) {
          return  false;
          break;
        } else {
          return true;
        }
      }
    }
  }
</script>-->

<!--Bài 4
<canvas id="DemoCanvas" width="500" height="600"></canvas>
<script>
  var canvas = document.getElementById("DemoCanvas");
  if (canvas.getContext)
  {
    var ctx = canvas.getContext('2d');
    ctx.fillStyle='#ff0000';    // color of fill
    ctx.fillRect(10,10, 140, 160); // create rectangle
  }
</script>-->

# demogit
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<canvas id="DemoCanvas" width="500" height="600"></canvas>
<script>
  class Rectangle {
    width;
    height;
    constructor (width,height) {
      this.width = width;
      this.height = height;
    }
    getWidth(){
      return this.width;
    }
    getHeight(){
      return this.height;
    }
    setWidth(width){
      this.width = width;
    }
    setHeight(height){
      this.height = height;
    }
    getDientich(){
      return this.width * this.height;
    }
    getChuvi(){
      return (this.width + this.height) * 2;
    }
  }
  let myRectangle = new Rectangle(0,0);
  myRectangle.setWidth(200);
  myRectangle.setHeight(400);
  let width = myRectangle.getWidth();
  let height = myRectangle.getHeight();
  let Chuvi = myRectangle.getChuvi();
  let Dientich = myRectangle.getDientich();



  document.write(myRectangle.getWidth() + "<br>");
  document.write("Chu vi =" + Chuvi + "<br>");
  document.write("Diện tích =" + Dientich + "<br>");

  let canvas = document.getElementById("DemoCanvas");
  let ctx = canvas.getContext('2d');
  ctx.fillStyle='#fa4b2a';
  ctx.fillRect(10, 10, width, height)
</script>
</body>
</html

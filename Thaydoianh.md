# demogit
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h2>What Can JavaScript Do?</h2>
<p>JavaScript can change HTML attributes.</p>
<p>In this case JavaScript changes the src (source) attribute of an image.</p>
<button onclick="document.getElementById('myImage').src='https://www.w3schools.com/js/pic_bulbon.gif'">Turn on the light</button>
<img  id="myImage" src="https://www.w3schools.com/js/pic_bulboff.gif" style="width:100px">
<button onclick="document.getElementById('myImage').src='https://www.w3schools.com/js/pic_bulboff.gif'">Turn off</button>
</body>
</html>
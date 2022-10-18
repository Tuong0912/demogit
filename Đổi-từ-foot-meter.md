# demogit
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<script>
  function foottometer(){
     let meter= 0.305 * foot;
    return meter;
  }
  function metertofoot(){
     let foot=3.279 * meter;
    return foot;
  }
  let foot = prompt("Nhập foot");
  let meter = prompt("Nhập meter");
  document.write(foot + "foot" + "=" + foottometer() + "meter"
  + "<br>")
  document.write(meter + "meter" + "=" + metertofoot() + "foot");
</script>
</body>
</html>

# demogit
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<script>
  let a=[1,2,3,4,5];
  let first=0;
  let last =a.length-1;
  while (first<last){
      let c = a[first];
      a[first]=a[last];
      a[last]= c;
      first++;
      last--;
  }
  document.write(a);
</script>
</body>
</html>

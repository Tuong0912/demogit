# demogit
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<script>
  class Temperature{
    celsius;
    constructor(celsius) {
      this.celsius = celsius;
    }
    fahrenheit(){
      return 9/5*this.celsius + 32;
    }
    kelvins(){
      return this.celsius + 273.15
    }
  }
  let temperature = new Temperature(25);
  let NewFahrenheit = temperature.fahrenheit();
  let NewKelvin = temperature.kelvins();
  document.write("Nhiệt độ K: " + NewKelvin + "<br>"
          + "Nhiệt độ F: " + NewFahrenheit)


</script>
</body>
</html>

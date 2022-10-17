# demogit
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<p>
    <label>Fahrenheit</label>
    <input id="inputFahrenheit" type="number" placeholder="Fahrenheit"
           oninput="temperatureConverter(value)">
</p>
<p>Celsius: <span id="outputCelsius"></span></p>
<script>

    function temperatureConverter(valNum) {
        valNum = parseFloat(valNum); //Chuyển từ chuỗi sang số
        document.getElementById("outputCelsius").innerHTML = (valNum - 32) / 1.8;
    }
</script>
</body>
</html>

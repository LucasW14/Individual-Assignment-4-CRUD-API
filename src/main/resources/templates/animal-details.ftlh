<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title >Nyoka</title>

    <link rel="stylesheet" href="/css/style.css">






</head>
<body>

<label for="menu">Menu:</label>
<select id="menu" onchange="location = this.value;">
    <option value="index.html">Select</option>
    <option value="/snakes/all">Home</option>
    <option value="/snakes/createForm">Create Snake</option>
    <!--    <option value="about.html">About</option>-->
<!--    <option value="details.html">Details</option>-->
</select>



<h1 style="color: black; text-align: center">${snake.title}</h1>

<div style="text-align: center;">
    <img src="https://ferrebeekeeper.wordpress.com/wp-content/uploads/2015/10/blackmamba.jpg"
         alt="Black Mamba image" width="400" height="250">
</div>
<div>
<p>ID: ${snake.snakeId?c}</p>

<p>Name: ${snake.title}</p>

<p>Habitat: ${snake.habitat}</p>

<p>About: ${snake.about}</p>

<p>length: ${snake.lengthM} in Meters</p>

<p>Age: ${snake.age}</p>

    <p><a href="/snakes/update/${snake.snakeId?c}"><button>Update Snake</button></a></p>

</div>



</body>
</html>
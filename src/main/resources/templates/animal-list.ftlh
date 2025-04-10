<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>Snakester</title>


    <link rel="stylesheet" type="text/css" href="/css/style.css">




    <!--    <link rel="stylesheet" type="text/css" href="styles.css">-->

    <!--    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">-->
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

<h1 style="color: green; text-align: center">Snakester </h1>
<h1>${title}</h1>

<h2 style="color: White; text-align: center">Save the snakes </h2>
<div class="search-bar">
    <form action="/snakes/title" style="flex: 1; display: flex;">
        <input type="text" name="search" placeholder="Search By Name 🔍" required>
        <button type="submit">Search</button>
    </form>
</div>
<div class="table-container">
    <#list snakeList as snake>

    <table border="1">
        <tr>
            <th><img src="https://wwfgifts-files.worldwildlife.org/wwfgifts/images/cobra-large-photo.jpg"
                     alt="Cobra image" width="104" height="142"></th>
        </tr>
        <tr>
            <td>Name: ${snake.title}</td>
        </tr>
        <tr>
            <td>Classification: ${snake.about}</td>
        </tr>
        <tr>
        <td>Location: ${snake.habitat}</td>
        </tr>
        <tr>
            <td><a href="/snakes/${snake.snakeId?c}"><button>View details</button></a></td>
        </tr>
        <tr>
            <td><a href="/snakes/update/${snake.snakeId?c}"><button>Update Snake</button></a></td>
        </tr>
        <tr>
            <td><a href="/snakes/delete/${snake.snakeId?c}"><button>Delete Snake</button></a></td>
        </tr>

    </table>
</#list>



</div>


</body>
</html>
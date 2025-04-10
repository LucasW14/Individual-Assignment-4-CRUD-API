<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Snakester</title>


    <link rel="stylesheet" href="/css/style.css">




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
<h2 style="color: White; text-align: center">${title}</h2>

<form id="new-snake" action="/snakes/new" method="post">


    <!-- Full Name -->
    <label for="title">Snake Title(name): </label>
    <input type="text" id="title" name="title" placeholder="Enter Snake Name" required>
    <br>
    <br>
    <br>
    <!-- Username -->
    <label for="habitat">Habitat: </label>
    <input type="text" id="habitat" name="habitat" placeholder="where does the snake live  ?" required>
    <br>
    <br>
    <br>
    <!-- Email -->
    <label for="about">About: </label>
    <input type="text" id="about" name="about" placeholder="what type of snake" required>
    <br>
    <br>
    <br>
    <!-- Password -->
    <label for="lengthM">Length</label>
    <input type="number" id="lengthM" name="lengthM" step="0.01"/>
    <br>
    <br>
    <br>
    <!-- Phone # -->
    <label for="age">Age: </label>
    <input type="number" id="age" name="age" placeholder="What age is the snake"required>
    <br>
    <br>
    <br>
    <!-- Account Type -->
    <!--  <label for="account-type">Account Type: </label>-->
    <!--  <select id="account-type" name="account-type" required >-->
    <!--    <option value="customer">Customer</option>-->
    <!--    <option value="seller">Seller</option>-->
    <!--  </select>-->
    <!--  <br>-->
    <!--  <br>-->
    <!--  <br>-->
    <!--  <label for="genre">Preferred Book Genre:</label>-->
    <!--  <select id="genre" name="genre" required>-->
    <!--    <option value="fiction">Fiction</option>-->
    <!--    <option value="non-fiction">Non-Fiction</option>-->
    <!--    <option value="mystery">Mystery</option>-->
    <!--    <option value="fantasy">Fantasy</option>-->
    <!--    <option value="science-fiction">Science Fiction</option>-->
    <!--    <option value="biography">Biography</option>-->
    <!--    <option value="history">History</option>-->
    <!--    <option value="romance">Romance</option>-->
    <!--  </select>-->
    <!--  <br>-->
    <!--  <br>-->
    <!--  <br>-->
    <!--  <label for="profile-pic">*Optional* Upload Profile Picture:</label>-->
    <!--  <input type="file" id="profile-pic" name="profile-pic" accept="image/*">-->
    <!--  <br>-->
    <!--  <br>-->
    <!-- Submit Button -->
    <button type="submit" class="btn btn-primary">Create</button>
    <a href="/snakes/all" class="btn btn-outline-danger">Cancel</a>

</form>

</body>
</html>
API Endpoints 


Base URL - http://localhost:8080/snakes

/all (GET)

Gets a list of all Snakes in the database.

Response - A JSON array of Snake objects.



[
    {
        "snakeId": 1,
        "habitat": "africa",
        "title": "leoooo",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 3,
        "habitat": "africa",
        "title": "ron",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 4,
        "habitat": "africa",
        "title": "ron",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 5,
        "habitat": "africa",
        "title": "leo",
        "about": "cobra",
        "age": 6,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 6,
        "habitat": "asia",
        "title": "lonnie",
        "about": "viper",
        "age": 6,
        "description": null,
        "lengthM": 5.5
    },
    {
        "snakeId": 7,
        "habitat": "south america",
        "title": "leon",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 8,
        "habitat": "south america",
        "title": "leon",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 10,
        "habitat": "asia",
        "title": "bertram",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    }
]

/{snakeId} (GET)

Gets an individual Snake in the system. Each Snake is identified by a numeric snakeId

Parameters

Path Variable: snakeId <integer> - REQUIRED

Response - A single Snake



{
        "snakeId": 1,
        "habitat": "africa",
        "title": "leoooo",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    }

    /title (GET)

Gets a list of snakes with a name that contains the given string.

query parameter: search lt;String> - REQUIRED

Response - A JSON array of Snake objects.

{
        "snakeId": 7,
        "habitat": "south america",
        "title": "leon",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 8,
        "habitat": "south america",
        "title": "leon",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    }


/habitat/{habitat}(GET) 

Gets a list of snakes for a named habitat.

Parameters 

path variable: habitat <String> - REQUIRED

Response - A JSON array of Snake objects.


[
    {
        "snakeId": 6,
        "habitat": "asia",
        "title": "lonnie",
        "about": "viper",
        "age": 6,
        "description": null,
        "lengthM": 5.5
    },
    {
        "snakeId": 10,
        "habitat": "asia",
        "title": "bertram",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    }
]


/long (GET)

Gets a list of snakes with a length meeting the Threshold.

Parameters

query parameter: length <Double> - REQUIRED


[
    {
        "snakeId": 1,
        "habitat": "africa",
        "title": "leoooo",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 3,
        "habitat": "africa",
        "title": "ron",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 4,
        "habitat": "africa",
        "title": "ron",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 5,
        "habitat": "africa",
        "title": "leo",
        "about": "cobra",
        "age": 6,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 7,
        "habitat": "south america",
        "title": "leon",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 8,
        "habitat": "south america",
        "title": "leon",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 10,
        "habitat": "asia",
        "title": "bertram",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    }
]

/length/{lengthM} (GET)

Gets a list of snakes with a length exactly as that of the Threshold.

Parameters

path variable: lengthM <Double> - REQUIRED

Response - A JSON array of Snake objects.



[
    {
        "snakeId": 1,
        "habitat": "africa",
        "title": "leoooo",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 3,
        "habitat": "africa",
        "title": "ron",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 4,
        "habitat": "africa",
        "title": "ron",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 5,
        "habitat": "africa",
        "title": "leo",
        "about": "cobra",
        "age": 6,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 7,
        "habitat": "south america",
        "title": "leon",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 8,
        "habitat": "south america",
        "title": "leon",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 10,
        "habitat": "asia",
        "title": "bertram",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    }
]


/new (POST)

Create a new Snake entry

Request Body

A snake object. 
Note that the snakeId is auto assigned in the 
database so is not needed in the request.

  {
        
        "habitat": "africa",
        "title": "bob",
        "about": "viper",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    }

Response - The updated list of Students.


[
    {
        "snakeId": 1,
        "habitat": "africa",
        "title": "leoooo",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 3,
        "habitat": "africa",
        "title": "ron",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 4,
        "habitat": "africa",
        "title": "ron",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 5,
        "habitat": "africa",
        "title": "leo",
        "about": "cobra",
        "age": 6,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 6,
        "habitat": "asia",
        "title": "lonnie",
        "about": "viper",
        "age": 6,
        "description": null,
        "lengthM": 5.5
    },
    {
        "snakeId": 7,
        "habitat": "south america",
        "title": "leon",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 8,
        "habitat": "south america",
        "title": "leon",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 10,
        "habitat": "asia",
        "title": "bertram",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 11,
        "habitat": "africa",
        "title": "bob",
        "about": "viper",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    }
]

/update/{snakeId} (PUT) 

Update an existing Snake.

Parameters

Path Variable: snakeId <integer> - REQUIRED

    Request Body

A snake object with the updates.

{
        "snakeId": 10,
        "habitat": "africa",
        "title": "bertram",
        "about": "cobra",
        "age": 6,
        "description": null,
        "lengthM": 6.5
    }

    Response - the updated Snake object.

{
    "snakeId": 10,
    "habitat": "africa",
    "title": "bertram",
    "about": "cobra",
    "age": 6,
    "description": null,
    "lengthM": 6.5
}

/delete/{snakeId} (DELETE)

Delete an existing Snake.

Parameters

Path Variable: snakeId <integer> - REQUIRED

Response - the updated list of Snakes.

[
    {
        "snakeId": 1,
        "habitat": "africa",
        "title": "leoooo",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 3,
        "habitat": "africa",
        "title": "ron",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 4,
        "habitat": "africa",
        "title": "ron",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 5,
        "habitat": "africa",
        "title": "leo",
        "about": "cobra",
        "age": 6,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 6,
        "habitat": "asia",
        "title": "lonnie",
        "about": "viper",
        "age": 6,
        "description": null,
        "lengthM": 5.5
    },
    {
        "snakeId": 7,
        "habitat": "south america",
        "title": "leon",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 8,
        "habitat": "south america",
        "title": "leon",
        "about": "cobra",
        "age": 5,
        "description": null,
        "lengthM": 6.5
    },
    {
        "snakeId": 10,
        "habitat": "africa",
        "title": "bertram",
        "about": "cobra",
        "age": 6,
        "description": null,
        "lengthM": 6.5
    }
]


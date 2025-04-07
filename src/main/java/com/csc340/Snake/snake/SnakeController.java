package com.csc340.Snake.snake;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * StudentController.java.
 * Includes all REST API endpoint mappings for the Student object.
 */
@RestController
@RequestMapping("/snakes")

public class SnakeController {

    @Autowired
    private SnakeService service;

    @GetMapping("/all")
    public Object getAllStudents() {
        return new ResponseEntity<>(service.getAllSnakes(), HttpStatus.OK);

    }

    @GetMapping("/{snakeId}")
    public Object getASnake(@PathVariable int snakeId) {
        return new ResponseEntity<>(service.getSnakeById(snakeId), HttpStatus.OK);


    }

    @GetMapping("/name")
    public Object getSnakesByName(@RequestParam(name = "search", defaultValue = "") String search){
        return new ResponseEntity<>(service.getSnakesByName(search), HttpStatus.OK);


    }

    @GetMapping("/title")
    public Object getSnakesByTitle(@RequestParam(name = "search", defaultValue = "") String search){
        return new ResponseEntity<>(service.getSnakesByTitle(search), HttpStatus.OK);


    }

    @GetMapping("/habitat/{habitat}")
    public Object getSnakesByHabitat(@PathVariable String habitat){
        return new ResponseEntity<>(service.getSnakesByHabitat(habitat), HttpStatus.OK);


    }

    @GetMapping("/length/{lengthM}")
    public Object getSnakeByLength(@PathVariable double lengthM) {
        return new ResponseEntity<>(service.getSnakesByLength(lengthM), HttpStatus.OK);


    }


    @GetMapping("/long")
    public Object getSnakesByLengthExact(@RequestParam(name = "length", defaultValue = "3.0") double length) {
        return new ResponseEntity<>(service.getSnakesByLength(length), HttpStatus.OK);

    }





    @PostMapping("/new")
    public Object addNewStudent(@RequestBody Snake snake) {
        System.out.println(snake.toString());
        service.addNewSnake(snake);
        return new ResponseEntity<>(service.getAllSnakes(), HttpStatus.CREATED);

    }

    @PutMapping("/update/{snakeId}")
    public Object updateSnake(@PathVariable int snakeId, @RequestBody Snake snake) {
        service.updateSnake(snakeId, snake);
        return new ResponseEntity<>(service.getSnakeById(snakeId), HttpStatus.CREATED);

    }

    @DeleteMapping("/delete/{studentId}")
    public Object deleteStudentById(@PathVariable int studentId) {
        service.deleteSnakesById(studentId);
        return new ResponseEntity<>(service.getAllSnakes(), HttpStatus.OK);
    }


    }

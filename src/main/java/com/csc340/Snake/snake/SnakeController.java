package com.csc340.Snake.snake;



import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * StudentController.java.
 * Includes all REST API endpoint mappings for the Student object.
 */
@Controller
@RequestMapping("/snakes")

public class SnakeController {

    @Autowired
    private SnakeService service;

    @GetMapping("/all")
    public Object getAllSnakes(Model model) {
        model.addAttribute("snakeList", service.getAllSnakes());
        model.addAttribute("title", "All Snakes");
        return "animal-list";
    }

    @GetMapping("/{snakeId}")
    public Object getASnake(@PathVariable int snakeId, Model model) {
        //return new ResponseEntity<>(service.getSnakeById(snakeId), HttpStatus.OK);
        model.addAttribute("snake", service.getSnakeById(snakeId));
        model.addAttribute("title", "Snake #: " + snakeId);
        return "animal-details";

    }

    @GetMapping("/name")
    public Object getSnakesByName(@RequestParam(name = "search", defaultValue = "") String search, Model model){
        return new ResponseEntity<>(service.getSnakesByName(search), HttpStatus.OK);


    }

    @GetMapping("/title")
    public Object getSnakesByTitle(@RequestParam(name = "search", defaultValue = "") String search, Model model){
        model.addAttribute("snakeList", service.getSnakesByTitle(search));
        model.addAttribute("title", "Snakes by Name: " + search);
        return "animal-list";

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

    @GetMapping("/createForm")
    public String showCreateForm(Model model) {
        Snake snake = new Snake();
        model.addAttribute("snake", snake);
        model.addAttribute("title", "Create New Snake");
        return "animal-create";
    }



    @PostMapping("/new")
    public Object addNewSnake( Snake snake, Model model) {
        System.out.println(snake.toString());
        service.addNewSnake(snake);
        //return new ResponseEntity<>(service.getAllSnakes(), HttpStatus.CREATED);
        return "redirect:/snakes/all";

    }

    @GetMapping("/update/{snakeId}")
    public Object showUpdateForm(@PathVariable int snakeId, Model model) {
        model.addAttribute("snake", service.getSnakeById(snakeId));
        model.addAttribute("title", "Update Snake");
        return "animal-update";

    }

    @GetMapping("/delete/{snakeId}")
    public Object deleteSnakeById(@PathVariable int snakeId) {
        service.deleteSnakesById(snakeId);

        return "redirect:/snakes/all";

    }


    }

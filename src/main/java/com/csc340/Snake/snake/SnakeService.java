package com.csc340.Snake.snake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SnakeService {

    @Autowired
    private SnakeRepository snakeRepository;



    public List<Snake> getAllSnakes(){

        return snakeRepository.findAll();


    }

    public Snake getSnakeById(int snakeId){

        return snakeRepository.findById(snakeId).orElse(null);



    }

    public List<Snake> getSnakesByLength(double lengthM){

        return snakeRepository.getSnakesByLength(lengthM);


    }

    public List<Snake> getSnakesByName(String name){


        return snakeRepository.getSnakesByName(name);
    }

    public List<Snake> getSnakesByTitle(String title){


        return snakeRepository.getSnakesByTitle(title);
    }

    public List<Snake> getSnakesByHabitat(String title){


        return snakeRepository.getSnakesByHabitat(title);
    }


    public void addNewSnake(Snake snake){

        snakeRepository.save(snake);

    }

    public void updateSnake(int snakeId, Snake snake) {
//        Snake existing = getSnakeById(snakeId);
//        existing.setSnakeName(snake.getSnakeName());
//        existing.setDescription(snake.getDescription());
//        existing.setLengthM(snake.getLengthM());

        //Technically the 4 lines above are not necessary because the save method merges by default.
        snakeRepository.save(snake);
    }

public void deleteSnakesById(int snakeId){

        snakeRepository.deleteById(snakeId);


}

}

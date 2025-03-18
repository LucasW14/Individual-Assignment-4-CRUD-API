package com.csc340.Snake.snake;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SnakeRepository extends JpaRepository<Snake, Integer> {


    @Query(value = "select * from snakes s where s.lengthM >= ?1", nativeQuery = true)
    List<Snake> getSnakesByLength(double lengthM);

    @Query(value = "select * from snakes s where s.name like %?1% ", nativeQuery = true)
    List<Snake> getSnakesByName(String name);

    @Query(value = "select * from snakes s where s.title like %?1% ", nativeQuery = true)
    List<Snake> getSnakesByTitle(String title);

    List<Snake> getSnakesByHabitat(String habitat);

}








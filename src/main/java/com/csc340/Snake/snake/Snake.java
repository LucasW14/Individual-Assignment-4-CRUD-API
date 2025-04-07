package com.csc340.Snake.snake;
import jakarta.persistence.*;


@Entity
@Table(name = "snakes")
public class Snake {

    @Override
    public String toString() {
        return "Snake{" +
                "snakeId=" + snakeId +
                ", snakeName='" + snakeName + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                ", lengthM=" + lengthM +
                ", title=" + title +
                ", about=" + about +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int snakeId;

    //@Column(nullable = false)
    private String snakeName;

    private  String habitat;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String about;

    private String description;

    private double lengthM;


    private  int age;

    public Snake(int snakeId,  String habitat, int age, String description, double lengthM, String about, String title) {
        this.snakeId = snakeId;
        this.habitat = habitat;
        this.age = age;
        this.description = description;
        this.lengthM = lengthM;
        this.about = about;
        this.title = title;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


/*
    public Snake(int snakeId, String name, String description, double lengthM) {
        this.snakeId = snakeId;
        this.name = name;
        this.description = description;
        this.lengthM = lengthM;
    }

*/
    public Snake( String description, double lengthM) {

        this.description = description;
        this.lengthM = lengthM;
    }

    public Snake(){




    }

    public int getSnakeId(){

        return snakeId;
    }

    public void setSnakeId(int snakeId) {
        this.snakeId = snakeId;
    }


//    public String getSnakeName() {
//        return snakeName;
//    }
//
//
//    public void setSnakeName(String snakeName){
//
//        this.snakeName = this.snakeName;
//    }

    public String getDescription() {
        return description;
    }


    public void setDescription(String description){

        this.description = this.description;

    }

    public double getLengthM() {
        return lengthM;
    }

    public void setLengthM(double lengthM) {
        this.lengthM = lengthM;
    }

    public String getTitle(){
        return title;

    }

    public void setTitle(String title){
        this.title = title;

    }

    public String getAbout(){
        return about;

    }

    public void setAbout(String about){
        this.about = about;

    }


}

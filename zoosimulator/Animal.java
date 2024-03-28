/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosimulator;

/**
 *
 * @author Billy lu
 */
public abstract class Animal implements IEntity {

    /**
     * store the x value of the location of the animal
     */
    private int x;
    /**
     * store the y value of the location of the animal
     */
    private int y;
    /**
     * store the id of the animal
     */
    private int id;

    /**
     * Count the total number of animalNum
     */
    protected static int animalNum;

    /**
     * Store the height of the animal
     */
    private int height;

    /**
     * Store the name of the animal
     */
    protected String name;

    /**
     * Store the sex of the animal
     */
    protected String sex;

    /**
     * Store the age of the animal
     */
    protected int age;

    /**
     * Store the hunger of the animal from 0 - 100 (starving to full)
     */
    protected int hunger = 100;

    /**
     * Store the level of fatigue of the animal from 0 - 100 (tired to
     * replenished)
     */
    protected int fatigue = 100;

    /**
     * Store the size of the animal in m
     */
    protected double size;

    /**
     * Store the speed of the animal
     */
    protected int speed;

    /**
     * Store the sound of the animal
     */
    protected String sound;

    /**
     * Store the image of the animal
     */
    protected Image image;

    /**
     * Store how many degree the animal have turned
     */
    protected int degree;

    /**
     * store the species of the animal
     */
    protected String species;

    /**
     * Constructor for Animal
     *
     * @param x The x position of the animal
     * @param y The y position of the animal
     * @param height The height of the animal
     * @param name The name of the animal
     * @param sex The sex of the animal
     * @param age The age of the animal
     * @param size The size of the animal in m
     * @param speed The speed of the animal(1-3 = slow, 4-6 = medium, 7-10 =
     * fast)
     * @param image The image of the animal
     * @param species The species of the animal
     * @param sound The sound of the animal
     */
    public Animal(int x, int y, int height, String name, String sex, int age, int size, int speed, Image image, String species, String sound) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.size = size;
        this.speed = speed;
        this.image = image;
        this.species = species;
        this.sound = sound;
        animalNum++;
        id = animalNum;

    }

    /**
     * Constructor for Animal
     *
     * @param height The height of the animal
     * @param name The name of the animal
     * @param sex The sex of the animal
     * @param age The age of the animal
     * @param size The size of the animal in m
     * @param speed The speed of the animal(1-3 = slow, 4-6 = medium, 7-10 =
     * fast)
     * @param image The image of the animal
     * @param species The species of the animal
     * @param sound The sound of the animal
     */
    public Animal(int height, String name, String sex, int age, int size, int speed, Image image, String species, String sound) {
        this.x = 0;
        this.y = 0;
        this.height = height;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.size = size;
        this.speed = speed;
        this.image = image;
        this.species = species;
        this.sound = sound;
        animalNum++;
        id = animalNum;
    }

    /**
     * turn the animal counterclockwise
     *
     * @param degree The number of degrees to turn
     */
    @Override
    public void turn(int degree) {
        this.degree += degree;
    }

    /**
     * place the animal to a x--y location
     *
     * @param x The x value of the location for the animal to be placed
     * @param y The x value of the location for the animal to be placed
     *
     */
    @Override
    public void place(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * move the animal with its speed and degrees turned
     */
    @Override
    public void move() {
        x += speed * Math.cos(Math.toRadians(degree));
        y += speed * Math.sin(Math.toRadians(degree));
    }

    /**
     * Let the animal eat and regain hunger value
     */
    @Override
    public void eat() {
        System.out.println(this.name + " is eating");
        this.hunger = 100;
    }

    /**
     * Let the animal sleep and regain fatigue value
     */
    @Override
    public void sleep() {
        System.out.println(this.name + " is sleeping");
        this.fatigue = 100;
    }

    /**
     * Let the animal make sounds
     */
    @Override
    public abstract void makeSound();

    /**
     * Get the total number of animal
     *
     * @return The total number of animals
     */
    public static int getAnimNum() {
        return animalNum;
    }
}

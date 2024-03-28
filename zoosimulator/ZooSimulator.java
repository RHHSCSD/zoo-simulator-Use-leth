/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosimulator;

/**
 * A Zoo Simulator
 *
 * @author Billy Lu
 */
public class ZooSimulator {

    /**
     * @param args the command line arguments
     */
    public static Animal[] animals = new Animal[10];
    public static ArrayList<Animal> animals = new ArrayList<Animal>();

    public static void main(String[] args) {
        // TODO code application logic here
        Image image1 = new Image();

        for (int i = 0; i < 10; i++) {
            long a = Math.round(Math.random() * 2);
            if (a == 0) {
                animals.add(new LandAnim(10, "landAnim", "male", 5, 5, 5, image1, "landspecies", "moooo"));
            }
            if (a == 1) {
                animals.add( new BirdAnim(10, "BirdAnim", "male", 5, 5, 5, image1, "landspecies", "birrrrr"));
            }
            if (a == 2) {
                animals.add(new WaterAnim(10, "WaterAnim", "male", 5, 5, 5, image1, "landspecies", "gulugulu"));
            }
        }
        for (int i = 0; i < 10; i++) {
            animals[i].makeSound();
        }

    }

    /**
     * Display the statistics of all of the animals
     */
    public static void displayStatistics() {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(Animal.getAnimNum());
        }
    }

    /**
     * Let every animal sleep and regain fatigue
     */
    public static void allSleep() {
        for (int i = 0; i < animals.length; i++) {
            animals[i].sleep();
        }
    }

    /**
     * Let every animal sleep and regain hunger
     */
    public static void allEat() {
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
        }
    }

    /**
     * Let every animal move according to their speed and direction
     */
    public static void allMove() {
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
    }
}

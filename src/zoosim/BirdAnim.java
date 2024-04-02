/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosimulator;

/**
 *
 * @author Billy Lu
 */
public class BirdAnim extends Animal implements IFlyable {

    /**
     * True if this animal can fly
     */
    protected boolean canFly = true;
    /**
     * True if this animal is flying;
     */
    private boolean flying = false;

    /**
     * Constructor for BirdAnim
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
     *
     */
    public BirdAnim(int x, int y, int height, String name, String sex, int age, int size, int speed, Image image, String species, String sound) {
        super(x, y, height, name, sex, age, size, speed, image, species, sound);

    }

    /**
     * Constructor for BirdAnim
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
     *
     */
    public BirdAnim(int height, String name, String sex, int age, int size, int speed, Image image, String species, String sound) {
        super(height, name, sex, age, size, speed, image, species, sound);
    }

    /**
     * let the Bird animal fly if it can
     */
    public void fly() {
        if (canFly) {
            flying = true;
        }

    }

    /**
     * let the Bird animal land
     */
    public void land() {
        flying = false;

    }

    /**
     * determine if a bird animal is flying
     *
     * @return true if this bird animal is flying
     */
    public boolean isflying() {
        return flying;
    }

    /**
     * let this bird animal make sound
     */
    public void makeSound() {
        System.out.println(name + ":" + sound);
    }

}

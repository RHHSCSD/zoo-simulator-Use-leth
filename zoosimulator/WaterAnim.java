/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosimulator;

/**
 *
 * @author chixi
 */
public class WaterAnim extends Animal implements ISwimmable {

    boolean canBreathe;

    /**
     * Constructor for WaterAnim
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
    public WaterAnim(int x, int y, int height, String name, String sex, int age, int size, int speed, Image image, String species, String sound) {
        super(x, y, height, name, sex, age, size, speed, image, species, sound);
        canBreathe = true;
    }

    /**
     * Constructor for WaterAnim
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
    public WaterAnim(int height, String name, String sex, int age, int size, int speed, Image image, String species, String sound) {
        super(height, name, sex, age, size, speed, image, species, sound);
        canBreathe = true;
    }

    /**
     * Determine if an animal can surface(can breathe in air)
     *
     * @return true if it can surface
     */
    public boolean canSurface() {

        return canBreathe;
    }

    /**
     * Let the animal make sound
     */
    public void makeSound() {
        System.out.println(name + ":" + sound);
    }

}

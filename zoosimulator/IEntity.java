/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosimulator;

/**
 *
 * @author chixi
 */
public interface IEntity extends IObject {

    /**
     * An entity needs to be able to move
     */
    public void move();

    /**
     * An entity needs to be able to eat
     */
    public void eat();

    /**
     * An entity needs to be able to sleep
     */
    public void sleep();

    /**
     * An entity needs to be able to make sound
     */
    public void makeSound();
}

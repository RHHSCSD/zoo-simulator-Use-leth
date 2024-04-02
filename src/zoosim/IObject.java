/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosimulator;

/**
 *
 * @author Billy Lu
 */
public interface IObject {

    /**
     * Turn an object
     */
    public void turn(int degree);

    /**
     * Place an object with x and y location
     */
    public void place(int x, int y);
}

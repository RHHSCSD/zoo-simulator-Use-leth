/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosimulator;

/**
 *
 * @author chixi
 */
public interface IFlyable {

    /**
     * An bird animal needs to be able to fly
     */
    public void fly();

    /**
     * An bird animal needs to be able to land
     */
    public void land();

    /**
     * Determine if something flyable is flying
     *
     * @return true if it is flying
     */
    public boolean isflying();
}

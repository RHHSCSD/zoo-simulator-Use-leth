/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosimulator;

/**
 *
 * @author chixi
 */
public class ZooObjects implements IObject {

    private String type;
    private String size;
    private int x = 0;
    private int y = 0;
    private int degree;

    /**
     * Constructor
     *
     * @param type the name of this Zoo Object
     * @param size the size of this Zoo Object
     */
    public ZooObjects(String type, String size) {
        this.type = type;
        this.size = size;
        x = 0;
        y = 0;
        degree = 0;
    }

    public ZooObjects(int x, int y, String type, String size) {
        this.type = type;
        this.size = size;
        this.x = x;
        this.y = y;
        x = 0;
        y = 0;
        degree = 0;
    }

    /**
     * turn the zoo object
     *
     * @param degree the degrees to be turned counterclockwise
     */
    public void turn(int degree) {
        this.degree += degree;
    }

    /**
     * place the zoo object using x and y coordinate
     *
     * @param x the x value of the location for the zoo object to be placed
     * @param y the x value of the location for the zoo object to be placed
     */
    public void place(int x, int y) {
        this.x = x;
        this.y = y;
    }

}


import java.awt.Color;

/**
     * Class Name: Car
     * Class Author: Tyler Hockett
     * **************************
     * Purpose of the Class
     * This will hold store and manipulate
     * attributes of a car
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     * Date Changed:
     * **************************
     * Look At This!
     * 
     * 
     * **************************
     */
public class Car 
{
    private String make;
    private String model;
    private Color color;
    private int speed;
    /**
     * Method Name: Car
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * this is the constructor for the car class
     * 
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     */
public Car(String make, String model, Color color)
{
    this.make=make;
    this.model=model;
    this.color=color;
    this.speed=0;
}
/**
     * Method Name:getMake
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * this will return the value of make
     * when used
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     */
public String getMake()
{
    return make;
}
/**
     * Method Name:setMake
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * this will set the value of make
     * when used
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     */
public void setMake(String make)
{
    this.make=make;
}
/**
     * Method Name:getModel
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * this will return the value of model
     * when used
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     */
public String getModel()
{
    return model;
}
/**
     * Method Name:setModel
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * this will set the value of model
     * when used
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     */
public void setModel(String model)
{
    this.model=model;
}
/**
     * Method Name:getColor
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * this will return the value of Color
     * when used
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     */
public Color getColor()
{
    return color;
}
/**
     * Method Name:setColor
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * this will return the value of Color
     * to the color class
     * when used
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     */
public void setColor(Color color)
{
    this.color=color;
}
/**
     * Method Name:getSpeed
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * this will return the value of speed
     * when used
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     */
public int getSpeed()
{
    return speed;
}
/**
     * Method Name:accelerate
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * this will increase the value of
     * speed by 5
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     */
public void accelerate()
{
    speed+=5;
}
/**
     * Method Name:brake
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * this will decrease the value of
     * speed by 5 but only if it is 
     * equalto or greaterthan 5
     * **************************
     * Date: 9/14/2017 USA
     * **************************
     */
public void brake()
{
    if(speed>=5)
    {
        speed-=5;
    }
}
}

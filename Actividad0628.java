
/**
 * Write a description of class Actividad0628 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Actividad0628
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Actividad0628
     */
    public Actividad0628()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int jugandoALosDardos(double valorx, double valory)
    {
        double dardo = Math.sqrt(Math.pow(valorx,2) + Math.pow(valory,2));
        int num = 0;
        if(dardo <= 1 ){
            num = 10;
        }
        else if(dardo <= 5){
            num = 5;
        }
        else if(dardo <= 10){
            num = 1;
        }
        else{
            num = 0;
        }
        return num;    
    }
}

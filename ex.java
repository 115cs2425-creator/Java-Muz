
import java.lang.*;


class calculator{
    double i;
    double x = Math.sqrt(i);

}
    @SuppressWarnings("unused")
class ex{
    public static void main(String args[]) {
        calculator c = new calculator();
        c.i = Integer.parseInt(args[0]);
        System.out.println("Square root of"+c.i+ "is" + c.x) ;
    }
}
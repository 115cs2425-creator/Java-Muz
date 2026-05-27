class Circle{
    @SuppressWarnings("unused")
            double x;
    @SuppressWarnings("unused")
    double y;
    double r;
//method for circumference
    double circumference(){
        return 2*3.14*r;
    }
    double area(){
        return 3.14*r*r;
    }
}
@SuppressWarnings("unused")
class Demon_6 {
    public static void main(String args[]){
        Circle c = new Circle();
        c.x = 0.0;
        c.r = 5.0;
        System.out.println("Circumference" + c.circumference());
        System.out.println("Area" + c.area());
     }
}
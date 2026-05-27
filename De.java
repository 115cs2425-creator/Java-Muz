class point{
    int x,y;
    void Setpoint(){
        x=10;
        y=20;
    }
}
@SuppressWarnings("unused")
class De{
    public static void main(String args[]){
        point p = new point();
        p.Setpoint(); 
        System.out.print("x is " + p.x);
        System.out.print("y is " + p.y);
    }
} 
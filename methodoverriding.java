class bike{
    void run(){
        System.out.println("running");
    }
}
class honda extends bike{
    void run(){
        System.out.println("running safely with 100kmph");
    }
}public class methodoverriding {
    public static void main(String[] args) {
        honda h = new honda();
        h.run();
        bike b = new bike();
        b.run();
        bike b1 = new honda();
        b1.run();
    }
}
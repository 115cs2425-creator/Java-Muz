import java.util.Scanner;
public class New{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("to find max of two numbers");
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        if(a>b){
            System.out.printf("Maximum is %d\n",a);
        }
        else{
              System.out.printf("Maximum is %d\n",b); 
        }
    }
}
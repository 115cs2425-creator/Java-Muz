import java.util.*;
class arraylist{
 public static void main(String[] args) {
     int sum = 0;
     float avg = 0;
     
     @SuppressWarnings({"unused", "Convert2Diamond"})
     ArrayList <Integer> l;
     l = new ArrayList<Integer>();
     System.out.println("enter input");
         Scanner input = new Scanner(System.in);
         while (input.hasNextInt()) {
             l.add(input.nextInt());
             
         }
         for (int i = 0; i < l.size(); i++) {
             sum = sum + l.get(i);
             
         }
          avg = sum/(l.size());
          System.out.println("Avrage"+avg);

 }
}
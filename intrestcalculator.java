import java.io.*;
class intrestcalculator{
    public static void main(String args[]) throws IOException{
        Float principalamount = Float.valueOf(0);
        Float rate = Float.valueOf(0);
        int years = 0;
        DataInputStream in = new DataInputStream(System.in);
        String tempString;
        System.out.println("Enter principal amount");
        System.out.flush();
        tempString = in.readLine();
        principalamount = Float.valueOf(tempString);
        System.out.println("Enter rate of interest");
        System.out.flush();
        tempString = in.readLine();
        rate = Float.valueOf(tempString);
        System.out.println("Enter number of years");
        System.out.flush();
        tempString = in.readLine();
        years = Integer.parseInt(tempString);


        float intresttotal = principalamount*rate*years;
        System.out.println("Total Intrest " + intresttotal);


    }

}

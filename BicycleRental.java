import java.util.Scanner;
public class BicycleRental{
    public static void main(String [] args){
        Scanner y = new Scanner(System.in);
        int start;
        int end;
        int rate;
        int total = 0;
        System.out.println("enter the starting hour: ");
        start= y.nextInt();
        System.out.println("enter the ending hour: ");
        end= y.nextInt();
        for(int i=start; i<end;i++){
            if(i<7){
                rate=500;
            }
            else if(i<14){
                rate=1000;
            }
             else if(i<19){
                rate=1500;
             }
             else if(i<21){
                rate=1000;
             }
             else if(i<24){
                rate=500;
             }
             else {
                rate= 0;
             }
             total=total+rate;
        }
System.out.println("Total amount to be paid is: "+total+"RWF");
    }
}
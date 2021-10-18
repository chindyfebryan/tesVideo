import java.util.*;
public class Atm {
    public static void main(String[]args){
        Scanner chindy=new Scanner(System.in);
        int pinBenar=2020;
        int inputan=0;
        
        while(chindy.hasNext()){
            int pin=chindy.nextInt();
            inputan++;
            if (pin==pinBenar){
                System.out.println("Pin Anda benar");
                break;
            }
            System.out.println("Pin Anda salah");
            if (inputan==3){
                System.out.println("Rekening Anda diblokir");
                break;
            }
        }
        System.out.println("Ada "+inputan+" kali inputan dilakukan");
        chindy.close();
    }
}

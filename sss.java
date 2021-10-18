import java.util.*;
public class Divisor {
    public static void main(String[]args){
        Scanner chindy=new Scanner(System.in);
        int n= chindy.nextInt();
        chindy.close();

        for(int d=1;d<n;d++){
            if(n%d==0){
                System.out.println(d);
            }
        }
    }   
}

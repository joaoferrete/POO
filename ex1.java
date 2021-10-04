import java.util.Scanner;

public class ex1{
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        int a=0, b=1, c, i, d=0;
        while(d<1) d=input.nextInt();
        System.out.printf("0 ");
        if(d>1) System.out.printf("1 ");
        for(i=2;i<d;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.printf("%d ",c);
        }
        System.out.printf("\n");
        input.close();
    }
}
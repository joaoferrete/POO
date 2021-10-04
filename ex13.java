import java.util.Scanner;

public class ex13{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int a=1;
        while(a!=0){
            System.out.printf("Insira um número: ");
            a=input.nextInt();
            if(a!=0) System.out.printf("%d\n", a*a);
        }
        input.close();
    }
}
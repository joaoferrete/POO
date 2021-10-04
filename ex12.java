import java.util.Scanner;

public class ex12{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int n, i, result=0;
        do{
            System.out.printf("Insira um número natural maior que 0\n");
            n=input.nextInt();
        }while(n<1);

        for(i=1; i<n-2;i++){
            result=(i*(i+1)*(i+2));
            if(result==n)break;
        }
        if(result==n) System.out.printf("O número é triangular\n");
        else System.out.printf("O número não é triangular\n");
        input.close();

    }
}
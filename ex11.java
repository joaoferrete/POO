import java.util.Scanner;

public class ex11{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int a, i, soma=0;
        do{
            System.out.printf("Insira um número natural maior que 0\n");
            a=input.nextInt();
        }while(a<1);
        for(i=1; i<a; i++){
            if(a%i==0) soma+=i;
        }
        if(a==soma)System.out.printf("O número é perfeito\n");
        else System.out.printf("O numero não é perfeito\n");
        input.close();
    }
}
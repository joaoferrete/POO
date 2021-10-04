import java.util.Scanner;

public class ex8{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int a=0,b;
        float saldo=0, entrada;
        
        while(a!=2){
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("0 - Debito\n");
            System.out.printf("1 - Crédito\n");
            System.out.printf("2 - Fim da inserção\n");
            a=input.nextInt();
            if(a==0) saldo-=input.nextFloat();
            else if (a==1) saldo+=input.nextFloat();
            else break;
        }
        System.out.printf("O saldo final é de R$%.2f\n", saldo);
        input.close();
    }
}
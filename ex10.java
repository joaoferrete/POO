import java.util.Scanner;

public class ex10{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        float a, b;
        int op;
        System.out.printf("Insira dois números: ");
        a=input.nextFloat();
        b=input.nextFloat();
        System.out.printf("Escolha a operação:\n");
        System.out.printf("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
        op=input.nextInt();
        if(op==1) System.out.printf("O resultado é %f\n", a+b);
        else if (op==2) System.out.printf("O resultado é %f\n", a-b);
        else if (op == 3) System.out.printf("O resultado é %f\n", a*b);
        else System.out.printf("O resultado é %f\n", a/b);
        input.close();

    }
}
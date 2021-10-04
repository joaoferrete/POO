import java.util.Scanner;

public class ex9{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        float valor, salario;
        int kw;

        System.out.printf("Digite o valor do salário mínimo: ");
        salario=input.nextFloat();
        System.out.printf("Digite a quatidade de KW gastos: ");
        kw=input.nextInt();
        valor = (salario/8)/100;
        System.out.printf("O valor pago por cada KW é R$%.2f\n",valor);
        System.out.printf("O valor a ser pago é de R$%.2f\n", valor*kw);
        System.out.printf("O valor a ser pago com desconto é de R$%.2f\n", (valor*kw)*0.85);
        input.close();
    }
}
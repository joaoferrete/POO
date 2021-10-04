import java.util.Scanner;

public class ex14{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        float maior=0, menor=0, media=0, ent;
        int i, n;
        System.out.printf("Insira o número de alunos: ");
        n=input.nextInt();
        System.out.printf("Insira as notas\n");
        for(i=0;i<n;i++){
            ent=input.nextFloat();
            media+=ent;
            if(i==0) menor=ent;
            if (ent>maior) maior = ent;
            if(ent < menor) menor = ent;
        }
        System.out.printf("A maior nota é %.2f\n", maior);
        System.out.printf("A menor nota é %.2f\n", menor);
        System.out.printf("A média das notas é %.2f\n", media/n);
        input.close();



    }
}
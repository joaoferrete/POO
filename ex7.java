import java.util.Scanner;

public class ex7{
    public static void main(String []args){
        float alunos[][] = new float[10][4];
        int i, a;
        Scanner input = new Scanner(System.in);

        for(i=0;i<10;i++){
            System.out.printf("Digite as nota do %dº aluno:\n", i+1);
            alunos[i][0]= input.nextFloat();
            alunos[i][1]= input.nextFloat();
            alunos[i][2]= input.nextFloat();
            alunos[i][3] = (alunos[i][0] + alunos[i][1] + alunos[i][2])/3;
            if(alunos[i][3]>=7)System.out.printf("Aprovado!\n");
            else if(alunos[i][3]<4) System.out.printf("Reprovado!\n");
            else System.out.printf("Prova Final!\n");
        }
        input.close();
    }
}
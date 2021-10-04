import java.util.Scanner;

public class ex3{
    public static void main(String []args){
        int vetor[] = new int[20];
        int a, b=0, i;
        Scanner input= new Scanner(System.in);
        for(i=0;i<20; i++){
            vetor[i]=input.nextInt();
        }
        for(i=0; i<20; i++){
            b=0;
            if(vetor[i]==2) System.out.printf("2 ");
            if(vetor[i]%2==0) b=1;
            if(vetor[i]%2==1){
                for(a=3; a<vetor[i]; a++){
                    if(vetor[i]%a==0){
                        b=1;
                        break;
                    }
                }
            }
            if(b==0) System.out.printf("%d ", vetor[i]);
        }
        input.close();
    }
}
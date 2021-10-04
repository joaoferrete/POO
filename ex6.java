import java.util.Scanner;

public class ex6{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int v[] = new int[10];
        int a=0, i, j, aux;
        System.out.printf("Insira os 10 numeros\n");
        for(i=0;i<10;i++){
            v[i] = input.nextInt();
        }
        for(i=0;i<10;i++){
            a=i;
            for(j=i+1;j<10;j++){
                if(v[a]>v[j]){
                    a = j;
                }
            }
            aux= v[i];
            v[i]= v[a];
            v[a]= aux;
        }
        for(i=0;i<10;i++){
            System.out.printf("%d ",v[i]);
        }
        System.out.printf("\n");

        input.close();
    }
}
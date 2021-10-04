import java.util.Scanner;

public class ex4{
    public static void main(String []args){
        int matriz[][] = new int[10][10];
        int i, j;

        for(i=0;i<10; i++){
            for (j=0;j<10; j++){
                if(i==j)matriz[i][j]=1;
                else matriz[i][j]=0;
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.printf("\n");
        }
        
    }
}
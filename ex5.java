import java.util.Scanner;

public class ex5 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int m1[][] = new int[4][4];
        int m2[][] = new int[4][4];
        int m3[][] = new int[4][4];
        int i, j, k;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                m1[i][j] = input.nextInt();
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                m2[i][j] = input.nextInt();
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                for(k=0;k<4;k++){
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.printf("%d  ",m3[i][j]);
            }
            System.out.printf("\n");
        }
        input.close();
    }
}
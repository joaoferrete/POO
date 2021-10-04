import java.util.Scanner;
import javax.swing.JOptionPane;


public class ex2{
    public static boolean ehTriangulo(int a, int b, int c){
        return ((Math.abs(b-c)<a && a<b+c) && (Math.abs(a-c)<b && b< a+c) && (Math.abs(a-b)<c && c<a+b));
    }
    public static boolean ehEquilatero(int l1, int l2, int l3){
        return (l1==l2 && l2==l3);
    }
    public static boolean ehIsosceles(int l1, int l2, int l3){
        return (l1==l2 || l2==l3 || l1==l3);
    }
    public static void main(String []agrs){
        int a, b, c, d;
        Scanner input = new Scanner(System.in);

        a=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado A"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado B"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado C"));
        if(ehTriangulo(a,b,c)){
            JOptionPane.showMessageDialog(null, "Os lados formam um triangulo", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            if(ehEquilatero(a, b, c)) JOptionPane.showMessageDialog(null, "O triangulo é Equilátero", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            else if(ehIsosceles(a, b, c)) JOptionPane.showMessageDialog(null, "O triangulo é Isósceles", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            else JOptionPane.showMessageDialog(null, "O triangulo é escaleno", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null, "Os lados não formam um triangulo", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        input.close();
    }
}
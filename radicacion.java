import java.util.Scanner;

public class radicacion {
     public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        
        double numero, indice, resultado;

        
        System.out.print("Ingrese el número al que desea hallar la raíz: ");
        numero = entrada.nextDouble();

        
        System.out.print("Ingrese el índice de la raíz (por ejemplo, 2 para cuadrada, 3 para cúbica): ");
        indice = entrada.nextDouble();

        
        resultado = Math.pow(numero, 1.0 / indice);

        
        System.out.println("La raíz " + indice + " de " + numero + " es: " + resultado);

        
        entrada.close();
    }
}


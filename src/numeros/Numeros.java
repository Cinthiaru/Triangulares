/*
 * Instituto Tecnológico Superior de Xalapa
 * Analisis y diseño de algoritmos
 * Cinthia Rubi Hernandez Gonzalez.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author rubi_
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        boolean respuesta;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el número: ");
        x = teclado.nextInt();
        
        respuesta = Triangular(x);
        if(respuesta){
            System.out.print("El número es triangular");
        }else{
            System.out.print("El número no es triangular");
        }

    }
    
    public static boolean Triangular(int x){
        int resultado=0;
        for(int j=0; j<=x; j++ ){
            resultado= resultado+j;
            if (resultado ==x){
                return true;
            }
        }
        return false;
    }
    
}

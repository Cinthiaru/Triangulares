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
        int x=1;
        boolean respuesta;

        Scanner teclado = new Scanner(System.in);
        System.out.println("-----Números Triangulares----");
        
        while(x!=0){
            
            System.out.println("Para calcular un número triangular ingrese un número mayor o igual a 1");
            
            System.out.println("Presione 0 para salir");
            System.out.print("Introduzca el número: ");
           
            x = teclado.nextInt();
            
            if(x==0){
                return;
            }
            
            respuesta = Triangular(x);
            
            if(respuesta){
                System.out.println("El número es triangular");
                System.out.println("------------------------");
            }else{
                System.out.println("El número no es triangular");
                System.out.println("------------------------");
            }
        };
        

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

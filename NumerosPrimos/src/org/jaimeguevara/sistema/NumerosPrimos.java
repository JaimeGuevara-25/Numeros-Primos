
package org.jaimeguevara.sistema;
import java.util.Scanner;
public class NumerosPrimos {
     Scanner entrada = new Scanner(System.in);
       
    public void menuSelec(){
         boolean negacion=false;
        while(!negacion){
            int numeroIngresado = 0;
            int contador = 0;
             System.out.println("+---------------------NUMEROS PRIMOS----------------------+");
            System.out.println("+ Por favor, Ingrese el numero que desea saber si es primo +");
            System.out.println("+----------------------------------------------------------+");
            System.out.print(" >");
            numeroIngresado = entrada.nextInt();
            for(int i=1;i<(numeroIngresado+1);i++){
                if(numeroIngresado%i==0){
                    contador++;
                }
            }
            if(contador!=2){
                System.out.println("+++++++++++++++++++");
                System.out.println("No es numero Primo");
                System.out.println("+++++++++++++++++++");
                }else{
                System.out.println("+++++++++++++++++++");
                System.out.println("Si es numero Primo");
                System.out.println("+++++++++++++++++++");
            }
        }
    }
    
   
       
}

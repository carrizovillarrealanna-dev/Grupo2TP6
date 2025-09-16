/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6g5.pkg1;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class Ejercicio6G51 {

    /**
     * @param matriz
     */
    
    public static void cargarMatriz(int [] [] matriz){
        Scanner leer  = new Scanner(System.in);
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.println("Ingrese un numero entero entre 1 a 9");
                matriz[i] [j]= leer.nextInt();
                while(matriz[i] [j] <1 || matriz[i] [j] >9){
                    System.out.println("Ingrese de nuevo el  numero");
                    System.out.println("Un numero entre 1 a 9");
                    matriz[i][j] = leer.nextInt();
                }
            }
        }
    }
    
    public static void mostrarMatriz(int [] [] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.print(matriz[i] [j] +" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    
    public static boolean matrizMagica(int [] [] matriz){
        boolean magica=false;
        int aux=0, a=0, b=0;
        for(int i =0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                aux=aux+matriz[i][j];
                a=a+matriz[i][i];
                b=b+matriz[i][matriz.length-1-i];
            }
            
        }
        if(aux%3==0 && a==b){
            magica=true;
        }else{
            magica=false;
        }
        return magica;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz = new int[3] [3];
        cargarMatriz(matriz);
        mostrarMatriz(matriz);
        boolean magica = matrizMagica(matriz);
        if(magica==true){
            System.out.println("La matriz es magica");
        }else{
            System.out.println("La matriz no es magica");
        }
    }
    
}

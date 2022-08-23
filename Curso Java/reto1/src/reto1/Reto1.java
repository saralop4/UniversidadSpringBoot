
package reto1;

import java.util.Scanner;

/**
 *
 * @author Sarah
 */
public class Reto1 {
    
    public static void main(String[] args) {
        
        
         Scanner leer= new Scanner(System.in);
         int n = Integer.parseInt(leer.nextLine());       
         int vector[] = new int[n];
         
         for (int e = 0; e < n; e++) {
             int valor= Integer.parseInt(leer.nextLine());
             vector[e]=valor;
            
        }
         
        int suma = 0;
        int mayor = vector[0];
        int menor = vector[0];
         
        for(int i=0; i<n; i++){
            suma += vector[i];
             
            if(vector[i] > mayor){
                mayor = vector[i];
            }
             
            if(vector[i] < menor){
                menor = vector[i];
            }
        }
         
        int promedio = suma / n;
         
        //promedio
        System.out.println( categorizar(promedio) );
        
        //mayor
        System.out.println( categorizar(mayor) );
        
        //menor 
        System.out.println( categorizar(menor) );
    }
    
   public static String categorizar(int value){
       
       if(value >= 80 && value <= 100){
              return "INVIABLE SANITARIAMENTE";
        }
         
        if(value >= 35 && value < 80){
             return "ALTO";
        }
         
        if(value >= 14 && value < 35){
              return "MEDIO";
        }
         
        if(value >= 5 && value < 14){
              return "BAJO";
        }
         
        if(value >= 0 && value < 5){
            return "SIN RIESGO";
        }
        
        return "NINGUNO";
   
    }
    
}

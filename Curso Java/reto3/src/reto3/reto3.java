package reto3;

import java.util.Scanner;


public class reto3 {
    
    public static void main(String[] args) {
        
        int n,cont=0,contM=0;
        String[] linea;
        String riesgo;
        
        Scanner Leer = new Scanner(System.in);
        n = Leer.nextInt();
        Leer.nextLine();
        CuerpoDeAgua[] Vector = new CuerpoDeAgua[n];  
        
        //Leemos datos
        for (int i = 0; i < n; i++) {
            //Leemos la linea
            linea = Leer.nextLine().split(" ");
            //convertimos los datos
            int identificador = Integer.parseInt(linea[1]);
            float irca = Float.parseFloat(linea[3]);
            //creamos el vector de objetos
            Vector[i] = new CuerpoDeAgua(linea[0],identificador,linea[2],irca,"Blanco","Rojo"); 
        }
        //Clasificamos los IRCA
        for (int i = 0; i < Vector.length; i++) {
            //ejectuamos el metodo nivel
            riesgo = Vector[i].nivel();
            System.out.println(riesgo);
            //encontramos los que son inferiores o iguales a medio
            if(Vector[i].getIrca()>=0 && Vector[i].getIrca() <= 35){
                cont++;
            }
            //encontramos la cantidad de medios
            if("MEDIO".equals(riesgo)){
                contM++;
            }
        }
        //imprimimos el cont
        System.out.println(cont);
        //Encontramos los que son medio y los imprimimos
        if(contM > 0){
            for (int i = 0; i < Vector.length; i++) {
                riesgo = Vector[i].nivel();
                if("MEDIO".equals(riesgo)){
                    System.out.print(Vector[i].getNombre()+" ");
                }
            }
        }else{
            //imprimimos NA
            System.out.print("NA");
        }
        
        //Encontrar el menor
        float menor = Vector[0].getIrca();
        String nomb = Vector[0].getNombre();
        int cod = Vector[0].getCodigo();
        for (int i = 0; i < Vector.length; i++) {
             if (Vector[i].getIrca() < menor){
                 menor = Vector[i].getIrca();
                 nomb = Vector[i].getNombre();
                 cod = Vector[i].getCodigo();
             }
        }        
        
        System.out.println("\n" + nomb + " " + cod);
        
    }
    
}

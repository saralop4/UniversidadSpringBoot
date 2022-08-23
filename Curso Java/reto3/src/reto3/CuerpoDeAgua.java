package reto3;

public class CuerpoDeAgua extends ObjetoGeografico {
    
      public CuerpoDeAgua(String nombre, int codigo, String municipio, float irca, String TipoDeAgua, String TipoCuerpoAgua) {
        super(nombre, codigo, municipio, irca, TipoDeAgua, TipoCuerpoAgua);
    }
    
    //metodo
    public String nivel(){
        if (getIrca() >= 0 && getIrca() <=5){
            return "SIN RIESGO";
        }else if(getIrca() > 5 && getIrca() <=14){
            return "BAJO";
        }else if(getIrca() > 14 && getIrca() <=35){
            return "MEDIO";
        }else if(getIrca() > 35 && getIrca() <=80){
            return "ALTO";
        }else if(getIrca() > 80 && getIrca() <=100){
           return "INVIABLE SANITARIAMENTE";
        }    
        return "No clasifica";
    }
    
    
}

public class Moto {
    public String marca;
    public String modelo;
    public int cilindradas; 

    public String retornarMarca(String ma){
        marca = ma; 
        return marca; 
    }

    public String retornarModelo(String mo){
        modelo = mo;
        return modelo; 
    }

    public int retornarCilindradas(int ci){
        cilindradas = ci; 
        return cilindradas; 
    }
}

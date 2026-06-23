package model;

import java.io.Serializable;

public class Resposta implements Serializable{
    
    private float resultado;

    public Resposta(float resultado) {
        this.resultado = resultado;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    } 

}

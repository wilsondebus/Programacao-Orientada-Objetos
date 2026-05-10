public class Casa{

    int precoMetroQuadrado = 1900;
    int precoQuartoAdicional = 800; 

    public float calcularPreco(int tamanho){
        return tamanho * precoMetroQuadrado;
    }

    public float calcularPreco(int tamanho, int quartos){
        return tamanho * precoMetroQuadrado + (quartos * precoQuartoAdicional); 
    }
}
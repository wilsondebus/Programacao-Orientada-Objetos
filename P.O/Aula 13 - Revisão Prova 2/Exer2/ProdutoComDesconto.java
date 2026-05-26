public class ProdutoComDesconto extends Produto {
    
    private double percentualDesconto;  

    public ProdutoComDesconto(double preco, double percentualDesconto){
        super(preco);
        this.percentualDesconto = percentualDesconto; 
    }

    public void desconto(){
        double desconto = preco * (percentualDesconto / 100); 
        double precoFinal = preco - desconto; 
        System.out.println("Preco com desconto R$ "+precoFinal);
    }

}

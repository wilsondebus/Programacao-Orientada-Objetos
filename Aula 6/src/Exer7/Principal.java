public class Principal {
    public static void main(String[] args) {
        

        Pedido p1 = new Pedido();

        System.out.println("\tDados dos Produtos: ");
        System.out.println(p1.numero);
        System.out.println(p1.produto);
        System.out.println(p1.preco);
        System.out.println(p1.quantidade);

        System.out.println("Valor SubTotal do Produto: "+p1.calcularSubtotal());
        
        float desconto = p1.calcularDesconto(); 
        float valorComDesconto = p1.calcularTotal(desconto); 

        System.out.println("Valor do produto com desconto "+valorComDesconto);

        p1.resumoFinalPedido(); 
    }
}

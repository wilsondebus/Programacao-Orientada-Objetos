public class Principal {
    public static void main(String[] args) {

        Produto p1 = new Produto("Caixa de Papelão", 3, 100);

        System.out.println("Valor total em Estoque: "+p1.calcularValorTotalEstoque());
        System.out.println("Tem estoque: "+p1.temEstoque());
        p1.adicionarEstoque();
        System.out.println("Quantidade em estoque: " +p1.quantidade);
        p1.venderEstoque();
        System.out.println("Quantidade final em estoque: "+p1.quantidade);

    }
}

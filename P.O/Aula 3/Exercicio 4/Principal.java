public class Principal{
    public static void main(String[]args){

        Livro l1 = new Livro();
        l1.titulo = "Clean Code"; 
        l1.autor = "Robert Cecil Martin";
        l1.anoPublicacao = 2008; 

         System.out.println("\tINFORMAÇÕEES LIVRO: ");
         System.out.println("TITULO: "+l1.titulo);
         System.out.println("AUTOR: "+l1.autor);
        System.out.println("PUBLICAÇÃO: "+l1.anoPublicacao);
    }
}

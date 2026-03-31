public class Principal {
    public static void main(String[] args) {
        

        Filme f1 = new Filme(); 

        System.out.println("Nome do Filme: "+f1.titulo);
        System.out.println("Duração em horas: "+f1.converterDuracaoEmHoras());
        System.out.println("Pode assistir? "+f1.podeAssistir());
        String informacoesFilme = f1.informacoes();
        System.out.println(informacoesFilme);
    }
}

package exer9;

public class Filme {
    
    public String titulo;
    public String diretor;
    public int duracaoFilme;
    public String genero; 


    public void exibirDetalhes(){
        System.out.println("\tDADOS DO FILME: ");
        System.out.println("Titulo : "+titulo);
        System.out.println("Diretor : "+diretor);
        System.out.println("Duração : "+duracaoFilme);
        System.out.println("Genero : "+genero);
        System.out.println("É longo : "+ehLongo(duracaoFilme));
    }

    public boolean ehLongo(int duracaoFilme){
        if(duracaoFilme > 120){
            return true;
        } else {
            return false;
        }
    }
}

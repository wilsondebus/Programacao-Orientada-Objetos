public class Notificacao{

    protected String mensagem; 

    public Notificacao(String mensagem){
        this.mensagem = mensagem;
    }

    public void enviar(){
        System.out.println("Notificando..."+mensagem);
    }
}
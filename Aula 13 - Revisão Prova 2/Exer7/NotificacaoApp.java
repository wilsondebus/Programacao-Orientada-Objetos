public class NotificacaoApp extends Notificacao{
    
    public NotificacaoApp(String mensagem){
        super(mensagem);
    }

    public void enviar(){
        System.out.println("Enviando notificação..."+mensagem);
    }

}

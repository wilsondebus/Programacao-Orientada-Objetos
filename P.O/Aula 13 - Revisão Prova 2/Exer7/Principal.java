public class Principal {
    public static void main(String[] args) {
        
        Notificacao notificacao = new Notificacao("oi"); 
        notificacao.enviar();


        NotificacaoEmail email = new NotificacaoEmail("Prezado Professor");
        email.enviar(); 
        System.out.println("----------------");
        email.enviar("@wilsonddebus.gmail.com"); 
        System.out.println("----------------");
        email.enviar("@wilsonddebus@gmail.com", "alexz@ufn.edu.br");

        NotificacaoApp whatsApp = new NotificacaoApp("Boa tarde"); 
        whatsApp.enviar(); 
    }
}

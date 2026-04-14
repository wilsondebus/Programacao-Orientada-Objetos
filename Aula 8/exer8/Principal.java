package exer8;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        Usuario u1 = new Usuario("wilsondebus", "wilsondebus123");

        System.out.println("Digite seu nome de usuario: ");
        String verificarNome = teclado.nextLine(); 
        System.out.println("Digite sua senha: ");
        String verificarSenha = teclado.nextLine(); 

        u1.login(verificarNome, verificarSenha); 
        
        System.out.println("Digite 1 para ver status ou 2 para fazer logout: ");
        int fazerLogout = teclado.nextInt(); 
        teclado.nextLine(); 

        if(fazerLogout == 1){
            System.out.println("Usuario Logado: "+u1.exibirStatus());
        } else if(fazerLogout == 2){
            u1.logout();
            System.out.println("Usuario Logado: "+u1.exibirStatus());
        } else {
            System.out.println("Caracter Invalido!");
        }
        
        teclado.close(); 
    }
}

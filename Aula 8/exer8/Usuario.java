package exer8;

import java.util.Scanner;

public class Usuario {
    public String nomeUsuario;
    public String senha; 
    public boolean logado = false;

    Scanner teclado = new Scanner(System.in); 
    
    public Usuario(String nomeUsuario, String senha){
        this.nomeUsuario = nomeUsuario;
        this.senha = senha; 
    }

    public boolean login(String verificarNome, String verificarSenha){
        if(verificarNome.equals(nomeUsuario) && verificarSenha.equals(senha)){
            System.out.println("Login Sucedido!");
            return logado = true; 
        } else {
            System.out.println("Dados incorretos!");
            return logado = false; 
        }
    }

    public boolean logout(){
        return logado = false; 
    }

    public boolean exibirStatus(){
        return logado; 
    }


}

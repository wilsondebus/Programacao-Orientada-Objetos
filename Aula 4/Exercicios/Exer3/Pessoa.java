package Exercicio3;

public class Pessoa{

    public String nome;
    public String email;
    public String dataNascimento;
    public String endereco;
    public boolean admin;

    public String retornaEmail(){
        return email;
    }

    public void promoverAdmin() {
        admin = !admin;
    }

    public boolean isAdmin(){
        return admin;
    }
}

public class Exemplo1{
    public static void main(String[] args) {

        try{
        int [] numeros = {1,2,3};
        System.out.println(numeros[3]);
        } catch (ArrayIndexOutOfBoundsException e){ //exibe a mensagem de erro e continua o programa
            System.out.println("Erro: Indice fora do array \n" +e.getMessage());
        } catch (Exception e) {  
            System.out.println("Exceção: "+e.toString());
        }

        try{
        int a = 10;
        int b = 0; 
        System.out.println(a/b);
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }

        try{
        String numero = "abc";
        int valor = Integer.parseInt(numero);
        } catch (NumberFormatException e){
            System.out.println("Erro: "+e.getMessage());
        } 

        System.out.println("Programa continua...");
    }
}
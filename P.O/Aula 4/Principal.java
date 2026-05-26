import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        Carro c = new Carro("VW", "Gol");      
        System.out.println("Marca do carro: "+c.marca);
        System.out.println("Modelo do carro: "+c.modelo);

        //passo 1
        String marca, modelo; 

        System.out.println("Digite a marca do carro: ");
        marca = teclado.nextLine();
        System.out.println("Digite o modelo do carro: ");
        modelo = teclado.nextLine(); 
        Carro c2 = new Carro(marca,modelo);

        System.out.println("Marca do carro 2: "+c2.marca);
        System.out.println("Modelo do carro 2: "+c2.modelo);

        //passo 2
        //ambos passos tem a mesma lógica e função 
        System.out.println("Digite a marca e modelo do carro: ");
        Carro c3 = new Carro(teclado.nextLine(), teclado.nextLine()); 

        System.out.println("Marca do carro 3: "+c3.marca);
        System.out.println("Modelo do carro 3: "+c3.modelo);

        Carro c4 = new Carro("Ford");
        System.out.println("Marca do carro é "+c4.marca);
       
       
       teclado.close();
       
       
       
       
        /*String marca;
        String modelo;

        System.out.println("MARCA DO CARRO: ");
        marca = teclado.nextLine();
        System.out.println("MODELO DO CARRO: ");
        modelo= teclado.nextLine(); 

        c.alugar(marca, modelo);
        c.devolver(marca, modelo);
        c.exibirCarros(marca, modelo);*/





        /*Moto m1 = new Moto();
        Moto m2 = new Moto(); 

        String marcaMoto1, marcaMoto2;
        String modeloMoto1, modeloMoto2;
        int cilindradasMoto1, cilindradasMoto2;

        System.out.println("Marca da MOTO 1: ");
        marcaMoto1 = teclado.nextLine();
        System.out.println("Modelo da MOTO 1: ");
        modeloMoto1 = teclado.nextLine(); 
        System.out.println("Cilindrasas da MOTO 1: ");
        cilindradasMoto1 = teclado.nextInt(); 
        teclado.nextLine();

        System.out.println("Marca da MOTO 2: ");
        marcaMoto2 = teclado.nextLine();
        System.out.println("Modelo da MOTO 2: ");
        modeloMoto2 = teclado.nextLine(); 
        System.out.println("Cilindrasas da MOTO 2: ");
        cilindradasMoto2 = teclado.nextInt();
        teclado.nextLine();

        m1.retornarMarca(marcaMoto1); 
        m1.retornarModelo(modeloMoto1); 
        m1.retornarCilindradas(cilindradasMoto1); 

        m2.retornarMarca(marcaMoto2); 
        m2.retornarModelo(modeloMoto2); 
        m2.retornarCilindradas(cilindradasMoto2);

        System.out.println("\tDADOS MOTO 1: ");
        System.out.println("MARCA: "+m1.retornarMarca(marcaMoto1));
        System.out.println("MODELO: "+m1.retornarModelo(modeloMoto1));
        System.out.println("CILINDRADAS: "+m1.retornarCilindradas(cilindradasMoto1));

        System.out.println("\tDADOS MOTO 2: ");
        System.out.println("MARCA: "+m1.retornarMarca(marcaMoto2));
        System.out.println("MODELO: "+m1.retornarModelo(modeloMoto2));
        System.out.println("CILINDRADAS: "+m1.retornarCilindradas(cilindradasMoto2));

        teclado.close(); 

        /*Calculadora c = new Calculadora();

        double resultado = c.somar(4.89, 4.11);
        System.out.println("O resultado eh: "+resultado);*/
    }
}

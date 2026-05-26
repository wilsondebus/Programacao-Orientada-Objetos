public class Principal {
    public static void main(String[] args) {
     
        Calculadora calculadora = new Calculadora(); 

        int resultado = calculadora.somar(4,3);
        System.out.println("Resultado 1 = "+resultado);

        resultado = calculadora.somar(4, 7, 9); 
        System.out.println("Resultado 2 = "+resultado);

        double resultado2 = calculadora.somar(3.5, 7);
        System.out.println("Resultado 3 = "+resultado2); 

        resultado = calculadora.multiplica(3, 3);
        System.out.println("Resultado 4 = "+resultado);

        resultado2 = calculadora.multiplica(3.5, 5);
        System.out.println("Resultado 5 = "+resultado2);

    }
}

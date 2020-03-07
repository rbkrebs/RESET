public class App {

    public static void main(String[] args) {


        System.out.println("Hello mundo!");
        System.out.println("Uma modificação");

        int valor1 = 12;
        int valor2 = 13;

        Calculadora calc = new Calculadora();
        System.out.println("Somar "+valor1+" e "+valor2+" = "+calc.somar(valor1,valor2));
        System.out.println("Subtrair "+valor1+" e "+valor2+" = "+calc.subtrair(valor1,valor2));
        System.out.println("Multiplicar "+valor1+" e "+valor2+" = "+calc.multiplicar(valor1,valor2));
        System.out.println("Dividir "+valor1+" e "+valor2+" = "+calc.dividir(valor1,valor2));
    }
}

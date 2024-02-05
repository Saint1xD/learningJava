package conversao;

public class Conversoes {
  public static void main(String[] args) {
    // System.out.println("Hello, World!");
    double salario = 1500.5;
    System.out.println(salario + " > double");

    int valor = (int) salario;
    System.out.println(valor + " > int");

    long numeroGrande = 32432412L;
    System.out.println(numeroGrande + " > long");

    short numeroPequeno = 210;
    System.out.println(numeroPequeno + " > short");

    byte numeroMuitoPequeno = 127; // -128 até 127
    System.out.println(numeroMuitoPequeno + " > byte");

    float pontoFlutuante = 3.14f; // 32 bits
    System.out.println(pontoFlutuante + " > float");
  }
}

package aprendendoloops;

public class TesteWhile {
  public static void main(String[] args) {
    int contador = 0;
    while (contador < 10) {
      contador++;  // colocar o contador depois do print para que ele seja incrementado antes de ser impresso
      System.out.println(contador);
    }
    System.out.println("O numero final foi " + contador);
}
}

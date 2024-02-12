package escopos;

public class TesteEscopo {
  public static void main(String[] args) {
    int idade1Player = 16;
    int quantidadeDeJogadores = 1;
    // boolean acompanhado = quantidadeDeJogadores > 1;
    boolean acompanhado;

    if (quantidadeDeJogadores > 1) {
      acompanhado = true; // nao pode declarar dentro do if e usar fora
    } else {
      acompanhado = false;
    }

    System.out.println(acompanhado);
    if (idade1Player >= 18 && acompanhado) {
      System.out.println("Player 1 é maior de idade e pode comprar bebida alcoólica.");
    } else if (quantidadeDeJogadores >= 2) {
      System.out.println("Vocês podem comprar");
    } else {
      System.out.println("Vocês não podem comprar");
    }
  }
}

package ifselses;

public class AprendendoIf {
  public static void main(String[] args) {
    int idade1Player = 16;
    int idade2Player = 0;
    int quantidadeDeJogadores = 1;
    System.out.println(idade2Player);
    if (idade1Player >= 18) {
      System.out.println("Player 1 é maior de idade e pode comprar bebida alcoólica.");
    } else if (quantidadeDeJogadores >= 2) {
      idade2Player = 17;
      System.out.println("Vocês podem comprar");
    } else {
      System.out.println("Vocês não podem comprar");
    }
  }
}

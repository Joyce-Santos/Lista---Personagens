import classes.Arqueiro;
import classes.Guerreiro;
import classes.Mago;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("Boneco1");
        Guerreiro guerreiro = new Guerreiro("Boneco2");
        Arqueiro arqueiro = new Arqueiro("Boneco3");

        System.out.println("\n");
        mago.ataque();
        mago.ataque();
        mago.ataque();
        mago.ataque();
        mago.ataque();
        mago.sofrerAtaque(15f);
        mago.restaurarVida(500f);
        mago.sofrerAtaque(150f);
       // mago.restaurarVida(250f);
        System.out.println(mago);

        guerreiro.ataque();
        guerreiro.sofrerAtaque(50f);
        guerreiro.ataque();
        guerreiro.ataque();
        guerreiro.ataque();
        guerreiro.ataque();
        guerreiro.ataque();
        guerreiro.ataque();
        System.out.println(guerreiro);
        guerreiro.restaurarVida(5f);

        System.out.println(arqueiro);
    }
}
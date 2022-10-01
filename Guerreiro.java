package classes;

public class Guerreiro extends Personagem{
    private int forcaFisica;

    public Guerreiro(String nome) {
        super(nome);
        this.forcaFisica = 5;
        System.out.println("O guerreiro "+ nome + " juntou-se ao campo de batalha!");
    }

    @Override
    public void ataque() {
        if(this.isVivo()) {
            System.out.println("O guerreiro "+ this.getNome() + " atacou o inimigo com sua espada.");
            this.setNivelDeExperiencia(this.getNivelDeExperiencia() + 1);
        } else {
            this.morrer();
        }
    }

    @Override
    public String toString() {
        return "O guerreiro " + this.getNome() + " possui os atributos: \n" +
                "Vida: "+ this.getVida() + "\n" +
                "Nível de experiência: " + this.getNivelDeExperiencia() + "\n" +
                "Força física: " + this.forcaFisica;
    }
}

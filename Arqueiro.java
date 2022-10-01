package classes;

public class Arqueiro extends Personagem{
    private int velocidade;

    public Arqueiro(String nome) {
        super(nome);
        this.velocidade = 5;
        System.out.println("O arqueiro " + nome + " juntou-se ao campo de batalha!");
    }

    @Override
    public void ataque() {
        if(isVivo()) {
            System.out.println("O arqueiro " + this.getNome() + " atacou o inimigo com seu arco.");
            this.setNivelDeExperiencia(this.getNivelDeExperiencia() + 1);
        } else {
            this.morrer();
        }

    }

    @Override
    public String toString() {
        return "O arqueiro " + this.getNome() + " possui os atributos: \n" +
                "Vida: "+ this.getVida() + "\n" +
                "Nível de experiência: " + this.getNivelDeExperiencia() + "\n" +
                "Velocidade: " + this.velocidade;
    }
}

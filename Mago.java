package classes;

public class Mago extends Personagem{
    private Integer poderDeMagia;
    private Integer poderDeCura;

    public Mago(String nome) {
        super(nome);
        this.poderDeMagia = 0;
        this.poderDeCura = 0;
        System.out.println("O mago "+ nome + " juntou-se ao campo de batalha!");
    }

    @Override
    public void ataque() {
        if(this.isVivo()) {
            System.out.println("O mago "+ this.getNome() + " atacou o inimigo com sua magia.");
            this.setNivelDeExperiencia(this.getNivelDeExperiencia() + 1);
        } else {
            this.morrer();
        }
    }

    @Override
    public String toString() {
        return "O mago " + this.getNome() + " possui os atributos: \n" +
                "Vida: "+ this.getVida() + "\n" +
                "Nível de experiência: " + this.getNivelDeExperiencia() + "\n" +
                "Poder de magia: " + this.poderDeMagia + "\n" +
                "Poder de cura: " + this.poderDeCura;
    }
}

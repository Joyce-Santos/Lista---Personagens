package classes;

public abstract class Personagem {
    private String nome;
    private float vida;
    private int nivelDeExperiencia;
    private boolean isVivo;
    private float vidaMaxima = 100f;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = vidaMaxima;
        this.nivelDeExperiencia = 0;
        this.isVivo = true;
    }

    public abstract void ataque();

    public void sofrerAtaque(float dano) {
        if(!isVivo) {
            this.morrer();
            return;
        }

        if(vida > dano) {
            vida -= dano;
            System.out.println("O "+ this.getClass().getSimpleName().toLowerCase() + " " + nome + " recebeu um dano de " + dano +
                    " e agora sua vida total é de: " + vida);
            return;
        }

        this.morrer();
    };
    public void restaurarVida(float ganho) {
        if(!isVivo) {
            this.morrer();
            return;
        }

        float vidaRestaurada;

        if((vida + ganho) > vidaMaxima) {
            vida = vidaMaxima;
            vidaRestaurada = vidaMaxima - vida;
        } else {
            vida += ganho;
            vidaRestaurada = ganho;
        }
        if(vidaRestaurada == 10) {
            System.out.println("O "+ this.getClass().getSimpleName().toLowerCase() + " " + nome + " já estava com a vida máxima e continua com " + vida + " de vida");
        } else {
            System.out.println("O "+ this.getClass().getSimpleName().toLowerCase() + " " + nome + " resturou sua vida em "+ vidaRestaurada +" e agora sua vida total é de: " + vida);
        }

    };
    public void morrer() {
        this.isVivo = false;
        this.vida = 0;
        System.out.println("O " + this.getClass().getSimpleName().toLowerCase() + " " + this.nome + " está morto.");
    };

    public String getNome() {
        return nome;
    }

    protected boolean isVivo() {
        return isVivo;
    }

    public float getVida() {
        return vida;
    }

    public int getNivelDeExperiencia() {
        return nivelDeExperiencia;
    }

    protected void setNivelDeExperiencia(int nivelDeExperiencia) {
        this.nivelDeExperiencia = nivelDeExperiencia;
    }
}

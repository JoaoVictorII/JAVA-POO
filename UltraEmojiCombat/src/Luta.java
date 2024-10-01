import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){

        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){

            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2 ;

        }else{

            this.aprovada = false;
            this.desafiado = null;
            this.desafiado = null;  
            System.out.println("A luta não pode acontecer!");

        }

    }

    public void lutar(){


    
        if(this.aprovada){

        System.out.println("A luta vai começar!!");
        
            System.out.println("DESAFIADO: ");
            this.desafiado.apresentar();

            System.out.println("DESAFIANTE: ");
            this.desafiante.apresentar();

            Random aleatorio = new Random();

            int vencedor = aleatorio.nextInt(3);
            
            switch (vencedor) {
                case 0:

                System.out.println("Houve um empate!!");
                this.desafiante.empatarLuta();
                this.desafiado.empatarLuta();
                    
                    break;

                case 1:

                System.out.println("O " + this.desafiado.getNome() +" Venceu a luta");
                this.desafiante.perderLuta();
                this.desafiado.ganharLuta();

                    break;

                case 2:
            
                System.out.println("O " + this.desafiante.getNome() +" Venceu a luta");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();

                    break;
            
                default:
                    break;
            }

        }

    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getRounds() {
        return rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public boolean getAprovada(){
        return aprovada;
    }
    
    
}

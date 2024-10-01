package ProjetoFinal;

public class Visualizacao{
    
    private viewer espectador;
    private Video filme;

    
    public void avaliar(){

        this.filme.setAvaliacao(5);

    }

    public void avaliar(int nota){

        this.filme.setAvaliacao(nota);
        
    }



    public Visualizacao(viewer espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() +1);
        this.filme.setView(this.filme.getView() +1);
    }


    public viewer getEspectador() {
        return espectador;
    }
    public void setEspectador(viewer espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }


    @Override
    public String toString() {
        return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
    }


    

}

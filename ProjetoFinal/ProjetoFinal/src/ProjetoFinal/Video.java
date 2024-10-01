package ProjetoFinal;

public class Video implements AcoesVideo{
    
    private String titulo;
    private int avaliacao;
    private int view;
    private int curtidas;
    private boolean reproduzindo;


    public Video(String titulo){

        this.titulo=titulo;
        this.avaliacao = 1;
        this.view = 0;
        this.curtidas = 0;
        this.reproduzindo = false;

    }

    
    @Override
    public void play(){

        this.reproduzindo = true;

    }

    @Override
    public void pause(){

        this.reproduzindo = false;

    }

    @Override
    public void like(){

        this.curtidas++;

    }


    public String getNome() {
        return titulo;
    }

    public void setNome(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.view);
        this.avaliacao = nova;

    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public float getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean  getReproduzindo() {
        return reproduzindo;
    }

    public void setRepodruzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }


    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", view=" + view + ", curtidas=" + curtidas
                + ", reproduzindo=" + reproduzindo + "]";
    }






    
    
    

}

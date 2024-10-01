package ProjetoFinal;

public class viewer extends Pessoa{

    private String login;
    private int totAssistindo;

    


    public viewer(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistindo = 0;     
    }




    public void viuMaisUm(){

        this.totAssistindo++;

    }




    @Override
    public String toString() {
        return "viewer "+ super.toString() +"[login=" + login + ", totAssistindo=" + totAssistindo + "]";
    }




    public String getLogin() {
        return login;
    }




    public void setLogin(String login) {
        this.login = login;
    }




    public int getTotAssistindo() {
        return totAssistindo;
    }




    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    
    
}

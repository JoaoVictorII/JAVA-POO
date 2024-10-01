package projetoEscola2;

public class Bolsista extends Aluno{

    private boolean bolsa;

    public void renovBolsa(){

        System.out.println("Renovando bolsa");

    }

    @Override
    public void pagarMensal(){

        System.out.println("pagando mensalidade (pagamento facilitado)");

    }
    
}

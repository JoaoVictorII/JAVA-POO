package projetolivro;


public class ProjetoLivro {

    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Joao", 19, "M");

        p[1] = new Pessoa("Cesar", 20, "F");

        l[0] = new Livro("Senhor dos anéis", "Tolkien", 1200,p[0]);

        l[1] = new Livro("Harry Potter ","nao lembro porra",2,p[1]);

        l[2] = new Livro("Como ser ricasssofodase","Primo Rico", 300,p[0]);

        System.out.println(l[1].detalhes());



    }
    
}
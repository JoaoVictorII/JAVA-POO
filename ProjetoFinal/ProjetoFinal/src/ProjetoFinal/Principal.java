package ProjetoFinal;

public class Principal {

    public static void main(String[] args) {

    viewer vi[] = new viewer[2];

    vi[0] = new viewer ("joao",22,"m","jub");
    vi[1] = new viewer ("jean",21,"f","jairo3");
 

    Video v[] = new Video[3];

    v[0] = new Video ("Cabelo de plastico");  
    v[1] = new Video("Dente de vidro");
    v[2] = new Video("Olho de borracha");

    Visualizacao vis1 = new Visualizacao(vi[0], v[1]);
    System.out.println(vis1.toString());

    Visualizacao vis2 = new Visualizacao(vi[0], v[2]);
    System.out.println(vis2.toString());

    vis1.avaliar(8);
    System.out.println(vis1.toString());



    }

    
}

public class UltraEmojiCombat {


    public static void main(String[] args) {

        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Cabelo de prego" ,"russo" ,32 , 1.93f ,87.2f ,4 ,2 ,1 );

        l[1] = new Lutador("Orelha de porco" , "italiano" , 22 , 1.88f , 75.2f ,6 ,2 , 3  );

        l[2] = new Lutador("Olho de boi" , "brasileiro" , 18 , 1.97f , 90.2f ,7 ,1 , 0  );

        l[3] = new Lutador("Cabeça de tijolo" , "paraguaio" , 28 , 1.85f , 85.2f ,8 ,4 , 2  );

        l[4] = new Lutador("Boca de funil" , "Estadunidense" , 19 , 1.79f , 75.2f ,2 ,6 , 3  );

        l[5] = new Lutador("Nariz de pano" , "alemanha" , 24 , 1.68f , 71.2f ,8 ,2 , 1  );



        Luta uec1 = new Luta();

        uec1.marcarLuta(l[5], l[2]);

        uec1.lutar();



        
    }
    
}
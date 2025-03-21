public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmarTV smarTV = new SmarTV();
        
        System.out.println("A TV esta ligada? " + smarTV.ligada);
        System.out.println("Qual o Canal? " + smarTV.canal);
        System.out.println("Qual o Volume? " + smarTV.volume);
    
        smarTV.ligar ();
        // if(smarTV.ligada == true){
        //     String ligou = "Ligada";    
        //     System.err.println("Ligar TV: " + ligou);
        // }
        System.out.println("Ligar TV: " + smarTV.ligada);

        smarTV.desligar ();
        System.out.println("Desligar TV: " + smarTV.ligada);
        
        smarTV.aumentarVolume();
        System.out.println("Aumentando Volume: " +smarTV.volume);
        
        smarTV.diminuirVolume();
        System.out.println("Dimiuindo Volume: " + smarTV.volume);
                
        smarTV.mudarCanal(13);
        System.out.println("Novo Canal: " + smarTV.canal);

    }
}

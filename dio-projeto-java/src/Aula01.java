

public class Aula01 {
    
    public static void main(String[] args) {
        int ano = 2024;
        //ano = 2025; // Nesse caso, pode ser alterado, mas quando é string, double.., nao pode
        
        String nome = " Daniel";
        // nome = "josé"  -> Nesse caso nao pode, por isso pode ate usar o "final String = " para ja deixar a string daquele jeito
        
        var y = " kawai ";

        double pi = 3.14;

        System.out.print(ano + nome + y + pi + " ");

        String primeiroNome = "Daniel";
        String segundoNome = "Rannyeri";

        String name = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(name);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
        // return primeiroNome + " " + segundoNome; // podia ser assim também
    }
}

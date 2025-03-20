public class TiposVariaveis {
    
    public static void main(String[] args) {
        
        byte idade = 25;  // É uma var. usada mais para numeros menores

        short ano = 2025; // n° menores, mas nem tanto

        int cep = 59173210; // tipo inteiro
        
        long cpf = 38729834694L; // Usado mais para n° maiores e sempre tem q colocar o L no final (se começar com zero pode conflitar)

        float pi = 3.14F; // Sempre usa o F no final

        double salario = 5600.89; // Geralmente a var. mais usada em projetos 

        String meuNome = "Daniboy";

        char sexo = 'M'; // recebi um unico caracter e em aspas simples

        boolean numero = true;

        final int ANO_NASCIMENTO = 2000; // esse valor n poderá ser alterado e por convenção é usado em CAPSLOCK
                
        System.out.println("Sua idade eh: " + idade);
        System.out.println("Nasceu no ano de: " + ano);
        System.out.println("Seu CEP: " + cep);
        System.out.println("Seu CPF: " + cpf);
        System.out.println("Valor de pi: " + pi);
        System.out.println("Seu Salario: " + salario);
        System.out.println(meuNome);
        System.out.println(sexo);
        System.out.println(numero);
        System.out.println(ANO_NASCIMENTO);
        
    }
}

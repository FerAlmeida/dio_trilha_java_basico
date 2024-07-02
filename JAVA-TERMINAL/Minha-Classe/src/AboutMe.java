// ARGUMENTOS
public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + 50 + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}


/** 
   A execução desta didática é mostrar o funcionamento do JAVA diretamente no terminal e a forma que se é possível
fazer as configurações e a sua execução diretamente no terminal.
   Foi localizado arquivo em que se encontava o nosso programa, selecionamos a pasta "bin", e abrir pelo terminal
   Após abrir o terminal na sequência: 
PS F:\1. ESTUDOS\4. J A V A  por DIO\dio_trilha_java_basico\JAVA-TERMINAL\Minha-Classe\bin>  digitamos:
      java AboutMe                  -> e a sequência de dados que desejamos acrescentar somente com espaço-> 
      Fernando Almeida 50 1.73
      Ola, me chamo Fernando Almeida
      Tenho 50 anos
      Minha altura é 1.73cm

*/


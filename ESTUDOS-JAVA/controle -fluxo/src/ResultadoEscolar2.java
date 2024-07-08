// Condicional else if

public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota = 10;
       
        if(nota >= 7)
         System.out.println("Aprovado");

         else if (nota >= 5 && nota <= 7)                  // essa condição deve retornar sempre true ou false
         System.out.println("Prova de recuperação");
 
        else
         System.out.println("Reprovado");
 
    }
    
}


// Ainda podemos fazer o uso de uma CONDIÇÃO TENÁRIA, a qual nos traz a um código mais limpo, mas com os mesmos resultados

/** 
 * 
public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota = 5;

        String resulatdo = nota >= 7 ? "Aprovado" : "Reprovado"

         System.out.println("resultado");
 
    }
    
}
/* */

// O uso da CONDIÇÃO TENÁRIA para a condição de recuperação da nota, ou seja, acrescentamos mais uma condição na CONDIÇÃO TENÁRIA 

/** 
 * 
public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota = 5;

        String resulatdo = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado"
        
         System.out.println("resultado");
 
    }
    
}
/* */
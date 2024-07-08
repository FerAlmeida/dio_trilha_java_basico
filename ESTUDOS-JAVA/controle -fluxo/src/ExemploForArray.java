/*
public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    
    }
    }
*/
    // UTILIZAÇÃO DO LAÇO FOR PORÉM ESCRITO DE UMA FORMA MAIS SIMPLIFICADA    -   FOR EACH   -


// Exemplo FOR EACH
public class ExemploForArray {
public static void main(String[] args) {
	String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
	
	for(String aluno : alunos) {
	  System.out.println("Nome do aluno é " + aluno);
	}

}
}

 
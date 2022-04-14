package EntidadeEstudante;

import java.util.Locale;
import java.util.Scanner;

public class Estudante {
 public static void main (String arg[]) {

 Locale.setDefault(Locale.US);
 
 Scanner leitor = new Scanner (System.in);
 
 ClasseEstudante estudante = new ClasseEstudante();
 
  System.out.println("Informe o seu nome: ");
 estudante.nome = leitor.nextLine();
 System.out.println("Informe a primeira nota: ");
 estudante.nota1 = leitor.nextDouble();
 System.out.println("Informe a segunda nota: ");
 estudante.nota2 = leitor.nextDouble();
 System.out.println("Informe a terceira nota: ");
 estudante.nota3 = leitor.nextDouble();
  System.out.println();
 System.out.printf("Sua nota final é: %.2f%n", estudante.notaFinal());
 
 if (estudante.notaFinal() < 60.0) {
	 
	 System.out.println("REPROVADOOOOO!");
	 System.out.printf("Falta %2f%n pontos", estudante.notasAusentes() );
 } 
 else {
	 System.out.println("APROVADOOOO!");
 leitor.close();
 }
 
 
 
 
 
 
 }
}
import java.time.LocalDate;

import br.com.dio.domain.Curso;
import br.com.dio.domain.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descriçoa do curso de java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descriçoa do curso de js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
	}
}

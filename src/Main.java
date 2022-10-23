import java.time.LocalDate;

import br.com.dio.domain.Bootcamp;
import br.com.dio.domain.Curso;
import br.com.dio.domain.Dev;
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
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java developer");
		bootcamp.setDescricao("Descrição Bootcamp Java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Alan");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos "+ dev1.getNome() + dev1.getConteudosIncritos());
		dev1.progredir();
		dev1.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos "+ dev1.getNome() + dev1.getConteudosIncritos());
		System.out.println("Conteúdos concluídos "+ dev1.getNome() + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		System.out.println("-------------------------");
		
		Dev dev2 = new Dev();
		dev2.setNome("João");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos "+ dev2.getNome() + dev2.getConteudosIncritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos "+ dev2.getNome() + dev2.getConteudosIncritos());
		System.out.println("Conteúdos concluídos "+ dev2.getNome() + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());
	}
}

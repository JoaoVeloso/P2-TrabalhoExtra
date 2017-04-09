import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Professor professor = new Professor(2161174, "João Castelo");
        List<Aluno> alunos = new ArrayList<>();

        Aula aula = new Aula(3, "P2", professor);

        Horario horario = new Horario(DiaDaSemana.SEGUNDA, 5, 3, 3);

        aula.setHorario(horario);

        professor.adicionar(aula);
        System.out.println(professor.getAulaHorario(horario));

        professor.assinarSumario(aula);

        System.out.println(aula.getSumario());
    }
}

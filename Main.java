import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joao on 01/04/2017.
 */
public class Main {
    public static final void main(String[] args){
        Professor professor = new Professor(2161797, "João Veloso");
        List<Aluno> alunos = new ArrayList<>();

        Aula aula = new Aula(3, "Programação II", professor);

        Horario horario = new Horario(DiaDaSemana.SEGUNDA, 14, 30, 45);

        aula.setHorario(horario);

        professor.adicionar(aula);
        System.out.println(professor.getAulaHorario(horario));

        professor.assinarSumario(aula);

        System.out.println(aula.getSumario());
    }
}

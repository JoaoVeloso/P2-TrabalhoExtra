import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Professor professor = new Professor(2161174, "João Castelo");
        List<Aluno> alunos = new ArrayList<>();

        Aula aula = new Aula(3, "P2", professor);

        Horario horario = new Horario(DiaDaSemana.SEGUNDA, -10, 3, 3);

        professor.adicionar(aula);
        professor.assinarSumario(aula);

        System.out.println(aula.getSumario());
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joao on 01/04/2017.
 */
public class Main {
    public static final void main(String[] args){
        Professor professor = new Professor(2161797, "João Veloso");
        List<Aluno> alunos = new ArrayList<>();

        Aula aula = new Aula(1, "P2", professor);
        Horario horario = new Horario(DiaDaSemana.TERÇA,2,30,90);
        horario.validacoes();
        professor.adicionar(aula);

        professor.assinarSumario(aula);

        System.out.println(aula.getSumario());
    }
}

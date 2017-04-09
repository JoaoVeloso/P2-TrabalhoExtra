import java.util.ArrayList;
import java.util.List;

public class Aula extends Identificador {

    private String sumario;
    private Professor professor;
    private List<Aluno> alunos;
    private Horario horario;

    public Aula(int numero, String nome, Professor professor){
        super(numero, nome);
        this.sumario = "Numero: " + numero + "\n" + "Nome: " + nome + "\n";
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }

    public String getSumario(){
        return sumario;
    }

    public void assinarSumario(Pessoa assinante){
        if(assinante instanceof Aluno && alunos.contains((Aluno) assinante))
            sumario += "Aluno: " + assinante.getNome();
        else if (assinante instanceof Professor && ((Professor) assinante).equals(professor))
            sumario += "Professor: " + assinante.getNome();

    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "sumario '" + sumario + '\'' +
                ", professor " + professor +
                ", horario " + horario;
    }
}

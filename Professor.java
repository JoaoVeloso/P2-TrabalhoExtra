import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{

    public Professor(int numero, String nome){
        super(numero, nome);
    }

    @Override
    public boolean assinarSumario(Aula aula){
        //if pode assinar ...( em termos logicos)
        if(! super.assinarSumario(aula))
            return false;

        aula.assinarSumario(this);

        for (Aluno aluno : aula.getAlunos()){
            aluno.assinarSumario(aula);
        }
        return true;
    }


}

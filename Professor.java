import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joao on 01/04/2017.
 */
public class Professor extends Pessoa {


    public Professor(int numero, String nome){
        super(numero, nome);
    }

    @Override
    public boolean assinarSumario(Aula aula) {

        if (!super.assinarSumario(aula))
            return false;

        aula.assinarSumario(this);

        for (Aluno aluno : aula.getAlunos()){
            aluno.assinarSumario(aula);
        }

        return true;
    }


}

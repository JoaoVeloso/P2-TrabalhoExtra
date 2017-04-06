import java.util.List;

/**
 * Created by Joao on 01/04/2017.
 */
public class Aluno extends Pessoa {

    public Aluno(int numero, String nome){
        super(numero, nome);
    }

    @Override
    public boolean assinarSumario(Aula aula) {
        if (!super.assinarSumario(aula))
            return false;
        aula.assinarSumario(this);
        return true;
    }
}

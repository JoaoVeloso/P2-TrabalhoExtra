import java.util.List;

public class Aluno extends Pessoa {

    public Aluno(int numero, String nome){
        super(numero, nome);
    }

    @Override
    public boolean assinarSumario(Aula aula){
        if(! super.assinarSumario(aula))
            return false;
        aula.assinarSumario(this);
        return true;
    }
}

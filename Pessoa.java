import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joao on 01/04/2017.
 */
public abstract class Pessoa extends Identificador{
    protected List<Aula> aulas;

    public Pessoa(int numero, String nome){
        super(numero, nome);
        aulas = new ArrayList<>();
    }

    public List<Aula> getAulas(){
        return aulas;
    }

    public void adicionar(Aula aula){
        aulas.add(aula);
    }

    public boolean assinarSumario(Aula aula){
        if (! aulas.contains(aula))
            return false;
        return true;
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joao on 01/04/2017.
 */
public class Identificador {

    protected int numero;
    protected String nome;
    protected List<Aula> aulas;

    public Identificador(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
        aulas = new ArrayList<>();
    }

    public int getNumero(){
        return numero;
    }

    public String getNome(){
        return nome;
    }

    public List<Aula> getAulas(){
        return aulas;
    }

    @Override
    public String toString() {
        return "\t" + "Nome: " + nome + "\t" +
                "Número: " + numero + '\n';
    }

}

/**
 * Created by Joao on 06/04/2017.
 */
public class Horario {
    DiaDaSemana diaDaSemana;
    int hora;
    int minutos;
    int duracao;

    public void validacoes(){
        validarDuracao(duracao);
        validarHora(hora);
        validarMinutos(minutos);
    }

    private int validarHora(int hora){
        if (hora > 23 || hora < 0)
            System.out.println("A Hora não está compreendida entre as 23 e as 0.");
        return hora;
    }

    private int validarMinutos(int minutos){
        if (minutos > 59 || minutos < 00)
            System.out.println("Os minutos não estão compreendidos entre 00 e 59.");
        return minutos;
    }

    private int validarDuracao(int duracao){
        if (duracao > 180 || duracao < 0)
            System.out.println("A duração não está compreendida entre 0 e 180.");
        return duracao;
    }

    public Horario(DiaDaSemana diaDaSemana, int hora, int minutos, int duracao) {
        this.diaDaSemana = diaDaSemana;
        this.hora = hora;
        this.minutos = minutos;
        this.duracao = duracao;
    }


}

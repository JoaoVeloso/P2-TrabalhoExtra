public class Horario {
    int duracao;
    DiaDaSemana diaDaSemana;
    int hora;
    int minutos;

    private int validarHora(int hora){
        if (hora > 23 || hora < 0) {
            System.out.println("A hora não está compreendida entre 0 e 23");
            hora = 2;
        }
        System.out.println(hora);
        return hora;
    }

    private int validarMinutos(int minutos){
        if (minutos > 59 || minutos < 0)
            System.out.println("Os minutos não estão compreendidos entre 0 e 59");
        return minutos;
    }

    private int validarDuracao(int duracao){
        if(duracao > 180 || duracao < 0)
            System.out.println("A Duracao tem que estar compreendida entre 0 a 180 minutos");
        return duracao;
    }


    public Horario(DiaDaSemana diaDaSemana, int hora, int minutos, int duracao) {
        this.diaDaSemana = diaDaSemana;
        this.hora = validarHora(hora);
        this.minutos = validarMinutos(minutos);
        this.duracao = validarDuracao(duracao);
    }

    @Override
    public String toString() {
        return "Horario:" +
                "duracao " + duracao +
                ", diaDaSemana " + diaDaSemana +
                ", hora " + hora +
                ", minutos " + minutos +
                '}';
    }
}

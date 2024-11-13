public class Marginaal {
    private double protsent;

    private double rakendaMarginaal(double baashind){
        return baashind * (1 + protsent / 100);
    }
}

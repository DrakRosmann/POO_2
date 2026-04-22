package guir;

import java.time.LocalDate;

public class Executiva extends Passagem{
    public Executiva(double custoBase, LocalDate data, int numeroVoo) {
        super((custoBase*0.3)+custoBase, data, numeroVoo, 1, false);
    }

}

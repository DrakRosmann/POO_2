package guir;

import java.time.LocalDate;

public abstract class Passagem {
    private double custoBase;
    private LocalDate data;
    private int numeroVoo;
    private int quantBagagems;
    private Boolean acessoPrioritario;

    public Passagem(double custoBase, LocalDate data, int numeroVoo, int quantBagagems, Boolean acessoPrioritario) {
        this.custoBase = custoBase;
        this.data = data;
        this.numeroVoo = numeroVoo;
        this.quantBagagems = quantBagagems;
        this.acessoPrioritario = acessoPrioritario;
    }

    public double getCustoBase() {
        return custoBase;
    }

    public void setCustoBase(double custoBase) {
        this.custoBase = custoBase;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public int getQuantBagagems() {
        return quantBagagems;
    }

    public void setQuantBagagems(int quantBagagems) {
        this.quantBagagems = quantBagagems;
    }

    public Boolean getAcessoPrioritario() {
        return acessoPrioritario;
    }

    public void setAcessoPrioritario(Boolean acessoPrioritario) {
        this.acessoPrioritario = acessoPrioritario;
    }

    public static int calcBagagens(Passagem[] lista){
        int sum = 0;
        for (Passagem i : lista){
            sum += i.getQuantBagagems();
        }
        return sum;
    }

    public static int calcVips(Passagem[] lista){
        int sum = 0;
        for (Passagem i : lista){
            if (i.acessoPrioritario){
                sum++;
            }
        }
        return sum;
    }
}

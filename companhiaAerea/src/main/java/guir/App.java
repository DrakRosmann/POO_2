package guir;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Passagem[] list = new Passagem[3];
        list[0] = new Executiva(10, LocalDate.now(), 1);
        list[1] = new PrimeiraClasse(30, LocalDate.now(), 2);
        list[2] = new Executiva(10, LocalDate.now(), 3);
        System.out.println("Quant pagagens: " + Passagem.calcBagagens(list));
    }
}
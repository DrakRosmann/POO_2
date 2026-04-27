package java.guir;

public class VagaoRefrigerado extends Vagao{
    private double alturaPorta;
    private int temperatura;

    public VagaoRefrigerado(double pesoMaximo, double alturaPorta, int temperatura) {
        super(pesoMaximo);
        this.alturaPorta = alturaPorta;
        this.temperatura = temperatura;
    }
}

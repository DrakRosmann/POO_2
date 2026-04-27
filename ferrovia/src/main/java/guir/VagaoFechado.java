package java.guir;

public class VagaoFechado extends Vagao{
    private double alturaPorta;

    public VagaoFechado(double pesoMaximo, double alturaPorta) {
        super(pesoMaximo);
        this.alturaPorta = alturaPorta;
    }
}

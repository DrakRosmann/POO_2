package java.guir;

import java.util.ArrayList;
import java.util.List;

public class TremComposicao {
    private int id;
    private List<Vagao> vagaos;
    private List<Locomotiva> locomotivas;

    public TremComposicao(int id) {
        this.id = id;
        vagaos = new ArrayList<>();
        locomotivas = new ArrayList<>();
    }
}

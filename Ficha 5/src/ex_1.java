import java.util.ArrayList;

public class ex_1 {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("22-33-CC", 1000, "verde");
        System.out.println(carro1);

        Veiculo carro2 = new Veiculo("44-55-DD", 2500, Cores.AZUL);
        System.out.println(carro2);

        Veiculo carro3 = new Veiculo("11-22-BB", 1400, Veiculo.VERMELHO);
        System.out.println(carro3);

        Moradia casa1 = new Moradia("Rua do Dr. Plácido da Costa Bocage", 90, Cores.CINZENTO);
        System.out.println(casa1);

        Cores casasEMoradias = carro1;
        System.out.println(casasEMoradias);
        casasEMoradias = casa1;
        System.out.println(casasEMoradias);

        ArrayList<Imposto> tributaveis =  new ArrayList<>();
        tributaveis.add(carro1);
        tributaveis.add(carro2);
        tributaveis.add(carro3);
        tributaveis.add(casa1);

        float impostoFinal = 0f;
        for(Imposto i : tributaveis){
            impostoFinal += i.calculoImposto();
        }
        System.out.println(impostoFinal);

        Imposto.imprimirImposto(carro1);
    }
}

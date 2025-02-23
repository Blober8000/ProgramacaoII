import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args){
        ex_1 ex_1 = new ex_1();
        ex_1.Automovel auto1 = ex_1.new Automovel("11-11-A1","Toyota", 1400);

        System.out.println(auto1);
        System.out.println(auto1.getMatricula());
        System.out.println(auto1.getTotalAutomoveis());

        ex_1.Automovel auto2 = ex_1.new Automovel("22-22-BB","Fiat");

        System.out.println(auto2);
        auto2.setCilindrada(1800);
        System.out.println(auto2);
        System.out.println(auto2.getTotalAutomoveis());
        System.out.println(Math.abs(auto1.calcularDiferencaCilindrada(auto2)));
        if (auto1.isCilindradaMaior(auto2)){
            System.out.println(auto1.getMatricula());
        } else{
            System.out.println(auto2.getMatricula());
        }
        System.out.println(auto1.getCilindrada() > 2000);

        int howMany=0;
        System.out.println("Qual é a marca que estás à procura?");
        Scanner sc = new Scanner(System.in);
        String marcaProcura = sc.nextLine();
        for (int i = 0; i < auto1.getTotalAutomoveis(); i++){
            if (auto2.getTodosAutomoveis()[i].getMarca().equals(marcaProcura)){
                howMany++;
            }
        }
        System.out.println(howMany);
    }
}

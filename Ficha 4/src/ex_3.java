import java.util.ArrayList;

public class ex_3 {
    public static void main(String[] args) {
        LivroInfantil livro1 = new LivroInfantil("Lego", "Jeff", 1300, 49.99f, 50, 18, 3);
        LivroInfantil livro2 = new LivroInfantil();
        LivroRomance livro3 = new LivroRomance("Banana", "Batata", 2000, 29.99f, 30, "Maçã");
        LivroRomance livro4 = new LivroRomance();
        LivroFiccaoCientifica livro5 = new LivroFiccaoCientifica("DA H BOMB", "J. Robbert Oppenheimer", 1950, 99.99f, 1, "Thermonuclear Fusion");
        LivroFiccaoCientifica livro6 = new LivroFiccaoCientifica();

//        System.out.println(livro1);
//        System.out.println(livro2);
//        System.out.println(livro3);
//        System.out.println(livro4);
//        System.out.println(livro5);
//        System.out.println(livro6);

        Livro[] arrray = new Livro[10];
        arrray[0] = livro1;
        arrray[1] = livro2;
        arrray[2] = livro3;
        arrray[3] = livro4;
        arrray[4] = livro5;
        arrray[5] = livro6;

        ArrayList<String> textuais = new ArrayList<>();
        for (Livro i : arrray) {
            if (i != null) {
                textuais.add(i.toString());
            }
        }

        ArrayList<String> textuaisInf = new ArrayList<>();
        for (Livro i : arrray) {
            if (i != null) {
                if (i.getClass().equals(LivroInfantil.class)) {
                    textuaisInf.add(i.toString());
                }
            }
        }

        ArrayList<String> textuaisComp = new ArrayList<>();
        for (Livro i : arrray) {
            if (i != null) {
                textuaisComp.add(String.format("%s, %d, %.2f", i.getTitulo(), i.calcularIdade(), i.calcularValorTotalStock()));
            }
        }

        System.out.println(textuais);
        System.out.println(textuaisInf);
        System.out.println(textuaisComp);
    }
}

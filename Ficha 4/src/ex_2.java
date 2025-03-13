public class ex_2 {
    public static void main(String[] args) {
        Circulo c = new Circulo(5f);
        Retangulo r = new Retangulo(5,10);

        Forma[] formas = new Forma[2];
        formas[0] = c;
        formas[1] = r;
        System.out.println(formas[0].getArea());
        System.out.println(formas[1].getArea());
    }
}

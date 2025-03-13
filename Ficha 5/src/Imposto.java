public interface Imposto {
    public abstract float calculoImposto();

    static void imprimirImposto(Imposto object){
        System.out.println(object.calculoImposto());
    }
}

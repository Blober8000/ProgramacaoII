import java.util.Arrays;

public class ex_1 {
    public class Automovel {
        private String matricula;
        private String marca;
        private int cilindrada;
        private static Automovel[] todosAutomoveis;
        private int posicaoArray;

        private static final String MATRICULA_POR_OMISSAO = "sem matrícula";
        private static final String MARCA_POR_OMISSAO = "sem marca";
        private static final int CILINDRADA_POR_OMISSAO = 0;

        private static int totalAutomoveis = 0;

        public Automovel() {
            matricula = MATRICULA_POR_OMISSAO;
            marca = MARCA_POR_OMISSAO;
            cilindrada = CILINDRADA_POR_OMISSAO;
            posicaoArray = totalAutomoveis;
            totalAutomoveis++;
            if (todosAutomoveis==null){
                todosAutomoveis = new Automovel[1];
            } else{
                todosAutomoveis = Arrays.copyOf(todosAutomoveis,todosAutomoveis.length+1);
            }
            todosAutomoveis[todosAutomoveis.length-1] = new Automovel(matricula, marca, cilindrada, posicaoArray, true);
        }

        public Automovel(String matricula, String marca, int cilindrada) {
            this.matricula = matricula;
            this.marca = marca;
            this.cilindrada = cilindrada;
            posicaoArray = totalAutomoveis;
            totalAutomoveis++;
            if (todosAutomoveis==null){
                todosAutomoveis = new Automovel[1];
            } else{
                todosAutomoveis = Arrays.copyOf(todosAutomoveis,todosAutomoveis.length+1);
            }
            todosAutomoveis[todosAutomoveis.length-1] = new Automovel(matricula, marca, cilindrada, posicaoArray, true);
        }

        private Automovel(String matricula, String marca, int cilindrada, int posicaoArray, boolean temporario) {
            this.matricula = matricula;
            this.marca = marca;
            this.cilindrada = cilindrada;
            this.posicaoArray = posicaoArray;
        }

        public Automovel(String matricula, String marca) {
            this.matricula = matricula;
            this.marca = marca;
            cilindrada = CILINDRADA_POR_OMISSAO;
            posicaoArray = totalAutomoveis;
            totalAutomoveis++;
            if (todosAutomoveis==null){
                todosAutomoveis = new Automovel[1];
            } else{
                todosAutomoveis = Arrays.copyOf(todosAutomoveis,todosAutomoveis.length+1);
            }
            todosAutomoveis[todosAutomoveis.length-1] = new Automovel(matricula, marca, cilindrada, posicaoArray, true);
        }

        public Automovel(String marca, int cilindrada) {
            matricula = MATRICULA_POR_OMISSAO;
            this.marca = marca;
            this.cilindrada = cilindrada;
            posicaoArray = totalAutomoveis;
            totalAutomoveis++;
            if (todosAutomoveis==null){
                todosAutomoveis = new Automovel[1];
            } else{
                todosAutomoveis = Arrays.copyOf(todosAutomoveis,todosAutomoveis.length+1);
            }
            todosAutomoveis[todosAutomoveis.length-1] = new Automovel(matricula, marca, cilindrada, posicaoArray, true);
        }

        public Automovel(int cilindrada, String matricula) {
            this.matricula = matricula;
            marca = MARCA_POR_OMISSAO;
            this.cilindrada = cilindrada;
            posicaoArray = totalAutomoveis;
            totalAutomoveis++;
            if (todosAutomoveis==null){
                todosAutomoveis = new Automovel[1];
            } else{
                todosAutomoveis = Arrays.copyOf(todosAutomoveis,todosAutomoveis.length+1);
            }
            todosAutomoveis[todosAutomoveis.length-1] = new Automovel(matricula, marca, cilindrada, posicaoArray, true);
        }

        public String getMatricula() {
            return matricula;
        }

        public String getMarca() {
            return marca;
        }

        public int getCilindrada() {
            return cilindrada;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
            todosAutomoveis[this.posicaoArray]=new Automovel(matricula, this.marca, this.cilindrada, this.posicaoArray, true);
        }

        public void setMarca(String marca) {
            this.marca = marca;
            todosAutomoveis[this.posicaoArray]=new Automovel(this.matricula, marca, this.cilindrada, this.posicaoArray, true);
        }

        public void setCilindrada(int cilindrada) {
            this.cilindrada = cilindrada;
            todosAutomoveis[this.posicaoArray]=new Automovel(this.matricula, this.marca, cilindrada, this.posicaoArray, true);
        }

        public String toString() {
            return String.format("O automóvel com matrícula %s é um %s com %d cc", matricula, marca, cilindrada);
        }

        public int calcularDiferencaCilindrada(Automovel outroAutomovel) {
            int diferenca = 0;

            diferenca = this.cilindrada - outroAutomovel.getCilindrada();
            return diferenca;
        }

        public boolean isCilindradaMaior(Automovel outroAutomovel) {
            boolean maior;

            if (this.cilindrada < outroAutomovel.getCilindrada()) {
                maior = false;
            } else{
                maior = true;
            }

            return maior;
        }

        public int getTotalAutomoveis() {
            return totalAutomoveis;
        }

        public Automovel[] getTodosAutomoveis(){
            return todosAutomoveis;
        }

    }
}

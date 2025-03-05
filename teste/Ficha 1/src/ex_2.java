public class ex_2 {
    public static void main(String[] args) {
        Pessoa pessoa1 =new Pessoa("Jeff", 40, 200f,90f);
        System.out.println(pessoa1.toString());
    }

    public static class Pessoa {
        private String nome;
        private int idade;
        private float altura;
        private float peso;

        private static final String NOME_OMISSO = "sem nome";
        private static final int IDADE_OMISSA = 0;
        private static final float ALTURA_OMISSA = 0f;
        private static final float PESO_OMISSO = 0f;

        public Pessoa() {
            this.nome = NOME_OMISSO;
            this.idade = IDADE_OMISSA;
            this.altura = ALTURA_OMISSA;
            this.peso = PESO_OMISSO;
        }

        public Pessoa(String nome, int idade, float altura, float peso) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
            this.peso = peso;
        }

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
            this.altura = ALTURA_OMISSA;
            this.peso = PESO_OMISSO;
        }

        public Pessoa(String nome) {
            this.nome = nome;
            this.idade = IDADE_OMISSA;
            this.altura = ALTURA_OMISSA;
            this.peso = PESO_OMISSO;
        }

        public String getNome() {
            return this.nome;
        }

        public int getIdade() {
            return this.idade;
        }

        public float getPeso() {
            return this.peso;
        }

        public float getAltura() {
            return this.altura;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void setPeso(float peso) {
            this.peso = peso;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

        public float getIMC() {
            return (float) (this.peso / Math.pow((this.altura/100), 2));
        }

        public String toString() {
            return String.format("Nome: %s, Idade: %d anos, Peso: %.2f kg, Altura: %.2f m, IMC: %.2f kg/m^2", this.nome, this.idade, this.peso, this.altura/100, getIMC());
        }
    }
}

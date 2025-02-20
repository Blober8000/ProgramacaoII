public class ex_1 {
    public static void main(String[] args) {
        Cilindro cilindro1 = new Cilindro(4f,10f);

        System.out.println(cilindro1.getVolume());
    }

    public static class Cilindro {
        private float raio;
        private float altura;

        private static float RAIO_OMISSO = 0;
        private static float ALTURA_OMISSA = 0;

        public Cilindro() {
            this.raio = RAIO_OMISSO;
            this.altura = ALTURA_OMISSA;
        }

        public Cilindro(float raio, float altura) {
            this.raio = raio;
            this.altura = altura;
        }

        public float getRaio() {
            return this.raio;
        }

        public float getAltura() {
            return this.altura;
        }

        public void setRaio(float raio) {
            this.raio = raio;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

        public float getVolume(){
            float volume=0;
            volume = (float) Math.pow(this.raio,2);
            volume = volume * this.altura;
            volume = (float) Math.PI * volume;
            return  volume;
        }
    }
}

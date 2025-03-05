public class ex_1 {
    public static void main(String[] args) {
        ConsultaOnline testeO = new ConsultaOnline();
        ConsultaPresencial testeP = new ConsultaPresencial();

        System.out.println(testeO);
        System.out.println(testeP);

        ConsultaOnline online = new ConsultaOnline("27/02/2025", "09:35", "Jeff Silva", "Dr. Mickey Mouse", "Discord", "https://discord.gg/consultas");
        ConsultaPresencial presencial = new ConsultaPresencial("15/03/2025", "16:48", "Anfosno Henriques", "Dra. Dora Exploradora", 69, "Øster Uttrup Vej 5, 9000 Aalborg, Dinamarca");

        System.out.println(online);
        System.out.println(presencial);

        System.out.println(online.calcularCustoConsulta());
        System.out.println(presencial.calcularCustoConsulta());

        Consulta[] vetorConsultas = new Consulta[4];
        vetorConsultas[0] = testeO;
        vetorConsultas[1] = testeP;
        vetorConsultas[2] = online;
        vetorConsultas[3] = presencial;

        for (int i = 0; i < vetorConsultas.length; i++) {
            System.out.println(vetorConsultas[i]);
        }

        mostrarConsultasOnline(vetorConsultas);
    }

    public static void mostrarConsultasOnline(Consulta[] array){
        for (Consulta i : array) {
            if (i instanceof ConsultaOnline) {
                System.out.println(i);
            }
        }
    }
}

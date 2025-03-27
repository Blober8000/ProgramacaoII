import java.util.ArrayList;

public class ex_2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(123456, "José",
                new Data(01, 5, 2006),
                new CartaoEstudante(654321,
                        new Data(27, 3, 2025),
                        new Data(1,1,2030)));
        Estudante student = new Estudante(789012, "Viviana",
                new Data(01, 5, 2005),
                new CartaoEstudante(987654,
                        new Data(15, 3, 2025),
                        new Data(1,1,2030)));
        System.out.println(estudante);
        System.out.println(estudante.validadeDias());
        System.out.println(estudante.maisNovo(student));

        Curso curso = new Curso(23456, "SauDInoB");
        curso.addEstudante(student);
        curso.addEstudante(estudante);
        System.out.println(curso.nomeEstudantePos(0));
        Estudantes(curso.getEstudantes());
        System.out.println(curso.removeEstudante(estudante));
        Estudantes(curso.getEstudantes());
    }

    public static void Estudantes(ArrayList<Estudante> estudantes) {
        for (Estudante estudante : estudantes) {
            System.out.println(estudante);
        }
    }
}

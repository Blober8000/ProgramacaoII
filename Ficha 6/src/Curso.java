import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String designacao;
    private ArrayList<Estudante> estudantes;

    public Curso(int codigo, String designacao) {
        this.codigo = codigo;
        this.designacao = designacao;
        this.estudantes = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    @Override
    public String toString() {
        return String.format("\n### Dados do Curso ###\nCódigo: %d\nDesignação: %s", codigo, designacao);
    }

    public boolean equals(Curso outroCurso) {
        boolean one, two;
        one = outroCurso.codigo == this.codigo;
        two = outroCurso.designacao.equals(this.designacao);
        return one && two;
    }

    public void addEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }

    public String nomeEstudantePos(int pos) {
        try {
            this.estudantes.get(pos);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
        return this.estudantes.get(pos).getNome();
    }

    public boolean removeEstudante(Estudante estudante) {
        return this.estudantes.remove(estudante);
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }
}

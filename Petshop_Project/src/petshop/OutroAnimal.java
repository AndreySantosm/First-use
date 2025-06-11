package petshop;

public class OutroAnimal extends Animal {
    private String tipoEspecifico;

    public OutroAnimal(String nome, String tipo, int idade, String dono, String tipoEspecifico) {
        super(nome, tipo, idade, dono);
        this.tipoEspecifico = tipoEspecifico;
    }

    @Override
    public String getTipo() {
        return "Outro";
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo Específico: " + tipoEspecifico;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof OutroAnimal && ((OutroAnimal) obj).tipoEspecifico.equals(this.tipoEspecifico);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + tipoEspecifico.hashCode();
    }
}
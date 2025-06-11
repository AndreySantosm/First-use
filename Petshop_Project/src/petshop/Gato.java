package petshop;

public class Gato extends Animal {
    private String corOlhos;

    public Gato(String nome, String raca, int idade, String dono, String corOlhos) {
        super(nome, raca, idade, dono);
        this.corOlhos = corOlhos;
    }

    @Override
    public String getTipo() {
        return "Gato";
    }

    @Override
    public String toString() {
        return super.toString() + ", Cor dos Olhos: " + corOlhos;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof Gato && ((Gato) obj).corOlhos.equals(this.corOlhos);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + corOlhos.hashCode();
    }
}
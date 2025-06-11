package petshop;

public abstract class Servico {
    protected String nome;
    protected double precoBase;

    public Servico(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract double calcularPreco(Animal animal);

    @Override
    public String toString() {
        return nome + " (Preço base: R$ " + precoBase + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Servico)) return false;
        Servico other = (Servico) obj;
        return nome.equals(other.nome) && precoBase == other.precoBase;
    }

    @Override
    public int hashCode() {
        return nome.hashCode() + (int) precoBase;
    }
}
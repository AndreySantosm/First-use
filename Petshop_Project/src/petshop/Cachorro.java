package petshop;

public class Cachorro extends Animal {
    private String porte;

    public Cachorro(String nome, String raca, int idade, String dono, String porte) {
        super(nome, raca, idade, dono);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    @Override
    public String getTipo() {
        return "Cachorro";
    }

    @Override
    public String toString() {
        return super.toString() + ", Porte: " + porte;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof Cachorro && ((Cachorro) obj).porte.equals(this.porte);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + porte.hashCode();
    }
}
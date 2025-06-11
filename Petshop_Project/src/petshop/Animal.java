package petshop;

public abstract class Animal {
    protected String nome;
    protected String racaTipo;
    protected int idade;
    protected String proprietario;

    public Animal(String nome, String racaTipo, int idade, String proprietario) {
        this.nome = nome;
        this.racaTipo = racaTipo;
        this.idade = idade;
        this.proprietario = proprietario;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return String.format("%s - Nome: %s, Raça/Tipo: %s, Idade: %d, Dono: %s",
                getTipo(), nome, racaTipo, idade, proprietario);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        Animal other = (Animal) obj;
        return nome.equals(other.nome) &&
               racaTipo.equals(other.racaTipo) &&
               idade == other.idade &&
               proprietario.equals(other.proprietario);
    }

    @Override
    public int hashCode() {
        return nome.hashCode() + racaTipo.hashCode() + idade + proprietario.hashCode();
    }
}
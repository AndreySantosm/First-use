package petshop;

public class Tosa extends Servico {

    public Tosa(double precoBase) {
        super("Tosa", precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal.racaTipo.equalsIgnoreCase("Persa") || animal.racaTipo.equalsIgnoreCase("Poodle")) {
            return precoBase * 1.3;
        }
        return precoBase;
    }
}
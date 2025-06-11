package petshop;

public class Banho extends Servico {

    public Banho(double precoBase) {
        super("Banho", precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal instanceof Cachorro) {
            String porte = ((Cachorro) animal).getPorte().toLowerCase();
            if (porte.equals("grande")) return precoBase * 1.5;
            if (porte.equals("médio")) return precoBase * 1.2;
        }
        return precoBase;
    }
}
package petshop;

public class ConsultaVeterinaria extends Servico {

    public ConsultaVeterinaria(double precoBase) {
        super("Consulta Veterinária", precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal.idade > 10) return precoBase * 1.2;
        return precoBase;
    }
}
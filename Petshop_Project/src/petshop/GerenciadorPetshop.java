package petshop;

public class GerenciadorPetshop {
    public static void main(String[] args) {
        Cachorro rex = new Cachorro("Rex", "Labrador", 5, "Carlos", "Grande");
        Gato mimi = new Gato("Mimi", "Persa", 3, "Ana", "Azul");
        OutroAnimal coelho = new OutroAnimal("Pompom", "Coelho", 2, "Bruno", "Mini Lion");

        Banho banho = new Banho(50);
        Tosa tosa = new Tosa(40);
        ConsultaVeterinaria consulta = new ConsultaVeterinaria(100);

        System.out.println(rex);
        System.out.println(banho + " - Preço: R$ " + banho.calcularPreco(rex));
        System.out.println(tosa + " - Preço: R$ " + tosa.calcularPreco(rex));
        System.out.println(consulta + " - Preço: R$ " + consulta.calcularPreco(rex));
        System.out.println();

        System.out.println(mimi);
        System.out.println(banho + " - Preço: R$ " + banho.calcularPreco(mimi));
        System.out.println(tosa + " - Preço: R$ " + tosa.calcularPreco(mimi));
        System.out.println(consulta + " - Preço: R$ " + consulta.calcularPreco(mimi));
        System.out.println();

        System.out.println(coelho);
        System.out.println(banho + " - Preço: R$ " + banho.calcularPreco(coelho));
        System.out.println(tosa + " - Preço: R$ " + tosa.calcularPreco(coelho));
        System.out.println(consulta + " - Preço: R$ " + consulta.calcularPreco(coelho));
        System.out.println();

        Cachorro rexClone = new Cachorro("Rex", "Labrador", 5, "Carlos", "Grande");
        System.out.println("Rex igual ao clone? " + rex.equals(rexClone));
        System.out.println("HashCodes: Rex=" + rex.hashCode() + ", Clone=" + rexClone.hashCode());
    }
}
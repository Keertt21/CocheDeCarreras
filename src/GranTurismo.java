public class GranTurismo extends CocheDeCarreras {
    private int pesoExtraLastre;

    public GranTurismo(String marca, String modelo, int velocidadMaxima, int pesoExtraLastre) {
        super(marca, modelo, velocidadMaxima);
        this.pesoExtraLastre = pesoExtraLastre;
    }

    @Override
    public void competir() {
        System.out.println("- Peso extra: " + pesoExtraLastre + "KG");
    }
}

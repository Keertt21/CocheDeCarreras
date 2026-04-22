public class PrototipoLM extends CocheDeCarreras {
    private boolean sistemaHibrido;

    public PrototipoLM(String marca, String modelo, int velocidadMaxima, boolean sistemaHibrido) {
        super(marca, modelo, velocidadMaxima);
        this.sistemaHibrido = sistemaHibrido;
    }

    @Override
    public void competir() {
        if (sistemaHibrido) {
            System.out.println("- Motor: Híbrido");
        } else {
            System.out.println("- Motor: Combustión");
        }
    }
}

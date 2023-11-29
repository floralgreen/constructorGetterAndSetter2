public class Auto {

    private final String marca;
    private final String modello;
    private final String targa;
    private int cilindrata;

    public Auto(String marca, String modello, String targa, int cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String getTarga() {
        return targa;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca = " + marca +
                ", modello = " + modello +
                ", targa = " + targa +
                ", cilindrata = " + cilindrata +
                '}';
    }
}

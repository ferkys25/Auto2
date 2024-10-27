public class Automovil {
    //Atributos - Propiedades - Estado
    private String marca;
    private String modelo;
    private String color = "Verde";
    private int cilindraje;


    //Constructores

    public Automovil() { //En los constructores existe pero no se pone el void
    }

    public Automovil(String marca) {
        this.marca = marca;
    }

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Metodos del set y get

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }


    //Metodos propios y de calculo


    public String verDetalle(){
        String dv= "La marca es: " + this.marca + "\nEl modelo es: " + getModelo() + "\nEl color es: " + getColor() +
                "\nEl cilindraje es: " + getCilindraje();
        return dv;
    }

    //Modificacion de metodos nativos
}
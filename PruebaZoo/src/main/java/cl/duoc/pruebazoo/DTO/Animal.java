package cl.duoc.pruebazoo.DTO;

public abstract class Animal {
    
    private static int uid;
    
    private int ID;
    private String Nombre;
    private String Raza;
    private String patronColor;
    private int Edad;
    private boolean Vegetariono;

    public Animal(int ID, String Nombre, String Raza, String patronColor, int Edad, boolean Vegetariono) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.patronColor = patronColor;
        this.Edad = Edad;
        this.Vegetariono = Vegetariono;
    }
    
    public Animal() {
        this.ID = uid;
        this.Nombre = "";
        this.Raza = "";
        this.patronColor = "";
        this.Edad = 0;
        this.Vegetariono = false;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getPatronColor() {
        return patronColor;
    }

    public void setPatronColor(String patronColor) {
        this.patronColor = patronColor;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public boolean isVegetariono() {
        return Vegetariono;
    }

    public void setVegetariono(boolean Vegetariono) {
        this.Vegetariono = Vegetariono;
    }
    
    @Override
    public String toString(){
        return "";
    }
}

package cl.duoc.pruebazoo.DTO;

public class Jirafa extends Animal{
    
    private int cuellolargo;

    public Jirafa(int cuellolargo, int ID, String Nombre, String Raza, String patronColor, int Edad, boolean Vegetariono) {
        super(ID, Nombre, Raza, patronColor, Edad, Vegetariono);
        this.cuellolargo = cuellolargo;
    }

    public Jirafa(int cuellolargo) {
        this.cuellolargo = 0;
    }

    public int getCuellolargo() {
        return cuellolargo;
    }

    public void setCuellolargo(int cuellolargo) {
        this.cuellolargo = cuellolargo;
    }

    @Override
    public String toString(){
        return"";
    };
}

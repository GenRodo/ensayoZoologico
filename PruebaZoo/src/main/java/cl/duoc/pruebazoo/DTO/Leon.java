package cl.duoc.pruebazoo.DTO;

public class Leon extends Animal{
    
    private int largoMelena;

    public Leon(int largoMelena, int ID, String Nombre, String Raza, String patronColor, int Edad, boolean Vegetariono) {
        super(ID, Nombre, Raza, patronColor, Edad, Vegetariono);
        this.largoMelena = largoMelena;
    }

    public Leon(int largoMelena) {
        this.largoMelena = 0;
    }

    public int getLargoMelena() {
        return largoMelena;
    }

    public void setLargoMelena(int largoMelena) {
        this.largoMelena = largoMelena;
    }
    
    @Override
    public String toString(){
        return"";
    };
}

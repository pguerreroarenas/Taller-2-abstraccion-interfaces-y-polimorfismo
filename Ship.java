/**
 * Clase que representa un tipo de nave y alguna de sus caracteristicas elementales.
 * 
 * @author Paola Andrea Guerreo
 */
public abstract class Ship {

    // Atributos
    /**
     * Representa algunas de las caracteristicas (Atributos) de la nave no tripulada.
     */
    private int speed; // velocidad
    private float power; //potencia
    private String name; //nombre
    private String fuel_type; //tipo de combustible 

    /**
     * Getter. Método que devuelve  la potencia de la nave.
     * @return power: float.
     */
    public float getPower() {
        return power;
    }
    /**
     * Setter. Método que modifica la potencia de la nave.
     * @param power
     */
    public void setPower(float power) {
        this.power = power;
    }
    /**
     * Getter. Método que devuelve  el tipo de combustible de la nave.
     * @return fuel_type.
     */
    public String getFuel_type() {
        return fuel_type;
    }
    /**
     * Setter. Método que modifica el tipo de combustible de la maquina.
     * @param fuel_type
     */
    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }
    /**
     * Getter. Método que devuelve  el nombre de la nave.
     * @return name.
     */
    public String getName() {
        return name;
    }
    /**
     * Setter. Método que modifica el nombre de la nave.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Getter. Método que devuelve  la velocidad de la nave.
     * @return speed.
     */
    public int getSpeed() {
        return speed;
    }
    /**
     * Setter. Método que modifica la velocidad de la nave.
     * @param speed 
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    /**
     * Constructor por defecto
     */
    public Ship(){
        this.speed=0; //velocidad
        this.power=0; //Potncia
        this.fuel_type=""; // tipo de combustible
        this.name=""; //nombre
    }
    /**
     * Constructor con 4 parametros
     * @param name nombre de la nave
     * @param fuel_type Tipo de combustible
     * @param speed Velocidad de la nave
     * @param power potecia de la nave
     */
    public Ship(String name, String fuel_type, int speed, float power){
        this.name=name;
        this.fuel_type=fuel_type;
        this.speed=speed;
        this.power=power;
    }

     // Metodos Astractos
    /**
     * Metodo Abstracto no implementado sin retorno del proceso abandonar admosfera
     */
    public abstract void leave_atmosphere (); //Abandonar admosfera
    /**
     * Metodo Abstracto no implementado sin retorno del proceso arrancar motor.
     */
    public abstract void start_engine (); // Arrancar motor

    
}

/**
 * Clase que Respresenta un tipo de nave y algunos de sus caracteristica elementales.
 * 
 * @author Paola Andrea Guerreo
 */
public class MannedShipShylab extends Ship implements Iship {
     /**
     * Representa algunas de las caracteristicas (Atributos) de la nave no tripulada.
     */
    public float weight_tons; //peso
    private int orbiter_KM; // orbitador
    public int capacity; // Capacidad
    public String country; //Pais
    /**
     * Getter. Método que devuelve  la orbita de la nave.
     * @return orbiter_KM 
     */
    public int getOrbiter_KM() {
        return orbiter_KM;
    }
    /**
     * Setter. Método que modifica la orbita de la nave.
     * @param country
     */
    public void setOrbiter_KM(int orbiter_KM) {
        this.orbiter_KM = orbiter_KM;
    }

    /**
     * Constructor por defecto
     */ 
    public MannedShipShylab(){
        
        this.weight_tons=77;
        this.country="EEUU";
        this.capacity=3;
        this.orbiter_KM=435;
        

    }

    /**
     * Constructor con 4 parametros
     * @param orbiter_KM orbita de la nave
     * @param weight_tons peso de la nave
     * @param country pais dueño de la nave
     * @param capacity capacidad de la nave
     */
    public  MannedShipShylab(float weight_tons, int orbiter_KM, int capacity, String country){
        this.weight_tons=weight_tons;
        this.orbiter_KM=orbiter_KM;
        this.country=country;
        this.capacity=capacity;
    }
    /**
     * Metodo sin retorno del proceso mantenimiento
     */
    public void periodic_maintenance(){
        System.out.println("Realizando mantenimientos");
        
    }
    /**
     * Metodo sin retorno del proceso Reparacion
     */
    public void repair_tasks(){
        System.out.println("Tares de reparación realizada");
        
    }
    /**
     * Metodo sin retorno en el se implementa un metodo de una clase abstracta,  se aplica polimorfismo.
     */
    @Override
    public void leave_atmosphere() {
        System.out.println("La nave tripuladaShylab abandono la admosfera");
        
    }
    /**
     * Metodo sin retorno en el se implementa un metodo de una clase abstracta,  se aplica polimorfismo.
     */
    @Override
    public void start_engine() {
        System.out.println(" Preparando el arranque del motor de la nave Shylab");
        
    }
    /**
     * Metodo sin retorno en el se implementa un metodo de una interfaz.
     */
    @Override
    public void fill_fuel() {
        System.out.println(" Nave cargada con liquido");
        
    }

    public void country(String showInputDialog) {
    }

}
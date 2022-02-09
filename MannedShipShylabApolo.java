/**
 * Clase que Respresenta un tipo de nave y algunos de sus caracteristica elementales.
 * 
 * @author Paola Andrea Guerreo
 */
public class MannedShipShylabApolo extends Ship implements Iship{

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
     * @param orbiter_KM 
     */
    public void setOrbiter_KM(int orbiter_KM) {
        this.orbiter_KM = orbiter_KM;
    }

    /**
     * Constructor por defecto
     */
     public MannedShipShylabApolo(){
        this.weight_tons=420;
        this.country="EEUU";
        this.capacity=7;
        this.orbiter_KM=386;
    }

     /**
     * Constructor con 4 parametros
     * @param weight_tonsn peso de la nave
     * @param orbiter_KM orbita de la nave
     * @param country pais dueño de la nave
     * @param capacity capacida de tripulantes de la nave
     */
    public  MannedShipShylabApolo(float weight_tons, int orbiter_KM, int capacity, String country){
        this.weight_tons=weight_tons;
        this.orbiter_KM=orbiter_KM;
        this.country=country;
        this.capacity=capacity;
    }
    //Metodos
    /**
     * Metodo sin retorno del proceso enviar seres humados a la admosfera
     */
    public void send_humans(){
        System.out.println("Enviando seres humanos fuera de la atmosfera");  
    }
    /**
     * Metodo sin retorno del proceso acoplamiento de la nave
     */
    public void coupling(){
        System.out.println("Acoplamiento realizado");   
    }
    /**
     * Metodo sin retorno del proceso de investigacion
     */
    public void conducting_research(){
        System.out.println("Tares de investigacion en proceso");
        
    }
     /**
     * Metodo sin retorno en el se implementa un metodo de una clase abstracta,  se aplica polimorfismo.
     */
    @Override
    public void leave_atmosphere() {
        System.out.println("La nave tripulada Apolo abandono la admosfera");    
    }
     /**
     * Metodo sin retorno en el se implementa un metodo de una clase abstracta,  se aplica polimorfismo.
     */
    @Override
    public void start_engine() {
        System.out.println(" Preparando el arranque del motor de la nave Apolo");   
    }
      /**
     * Metodo sin retorno en el se implementa un metodo de una interfaz.
     */
    @Override
    public void fill_fuel() {
        System.out.println(" Nave cargada con solido");
        
    }

    public void country(String showInputDialog) {
    }
    
}

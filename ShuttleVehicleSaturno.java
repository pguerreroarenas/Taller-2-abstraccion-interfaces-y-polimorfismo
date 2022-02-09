/**
 * Clase que representa un tipo de nave y alguna de sus caracteristicas elementales.
 * 
 * @author Paola Andrea Guerreo
 */
public class ShuttleVehicleSaturno extends Ship implements Iship {
    /**
     * Representa algunas de las caracteristicas (Atributos) de la nave vehiculo lanzadera.
     */
    public float loadweight_tons; //peso de la carga 
    public float weight_tons; //peso
    private String country; //Pais
    public String type_load; //Tipo de carga
    public int push_tons; //empuje
    public float height_meters; //Altura

    /**
     * Getter. Método que devuelve  el nombre del pais dueño de la nave.
     * @return country: Rusia, EEUU, China...
     */
    public String getCountry() {
        return country;
    }
    /**
     * Setter. Método que modifica el nombre del pais dueño de la nave.
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Constructor por defecto
     */
    public ShuttleVehicleSaturno(){
        this.loadweight_tons=118;
        this.weight_tons=2900;
        this.country="EEUU";
        this.type_load="Apolo";
        this.push_tons=3500;
        this.height_meters=100;
    }

     /**
     * Constructor con 6 parametros
     * @param loadweight_tons Peso de la carga 
     * @param weight_tons peso de la nave
     * @param country pais dueño de la nave
     * @param type_load Tipo de carga
     * @param push_tons Empuje
     * @param height_meters altura de la nave
     */
    public ShuttleVehicleSaturno(float loadweight_tons, float weight_tons, String country, String type_load, int push_tons, float height_meters){
        this.loadweight_tons=loadweight_tons;
        this.weight_tons=weight_tons;
        this.country=country;
        this.type_load=type_load;
        this.push_tons=push_tons;
        this.height_meters=height_meters;
    }
    //Metodos
     /**
     * Metodo sin retorno del proceso Acomodar carga util 
     */
    public void lift_payload(){
        System.out.println("Carga util acomodada en la nave");
        
    }
    /**
     * Metodo sin retorno del proceso dejar carga util.
     */
    public void drop_payload(){
        System.out.println("Carga util dejada en orbita");
        
    }
    /**
     * Metodo sin retorno en el se implementa un metodo de una clase abstracta,  se aplica polimorfismo.
     */
    @Override
    public void leave_atmosphere() {
        System.out.println("La nave Shuttle Vehicle Saturno abandono la admosfera");   
    }
    /**
     * Metodo sin retorno en el se implementa un metodo de una clase abstracta,  se aplica polimorfismo.
     */
    @Override
    public void start_engine() {
        System.out.println(" Preparando el arranque del motor de la nave Shuttle Vehicle Saturno");
        
    }
     /**
     * Metodo sin retorno en el se implementa un metodo de una interfaz.
     */
    @Override
    public void fill_fuel() {
        System.out.println(" Nave cargada con petróleo refinado y oxígeno líquido");
        
    }

    
    
}

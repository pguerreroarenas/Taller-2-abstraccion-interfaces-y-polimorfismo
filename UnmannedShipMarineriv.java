/**
 * Clase que Respresenta un tipo de nave y algunos de sus caracteristica elementales.
 * 
 * @author Paola Andrea Guerreo
 */
public class UnmannedShipMarineriv extends Ship implements Iship {

    /**
     * Representa algunas de las caracteristicas (Atributos) de la nave no tripulada.
     */
    private String country; //Pais
    public float weight_tons; //peso
    public float height_meters; //Altura
    public float push_kg; //empuje
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
    public UnmannedShipMarineriv(){
        
        this.weight_tons=2900;
        this.country="EEUU";
        this.height_meters=100;
        this.push_kg=(float) 22.44;
        

    }

    /**
     * Constructor con 4 parametros
     * @param push_kg Empuje de la nave
     * @param weight_tons peso de la nave
     * @param country pais dueño de la nave
     * @param height_meter altura de la nave
     */
    public UnmannedShipMarineriv(float weight_tons, float height_meters, String country, float push_kg){
        this.push_kg=push_kg;
        this.weight_tons=weight_tons;
        this.country=country;
        this.height_meters=height_meters;
    }

    //Metodos
    /**
     * Metodo sin retorno del proceso enviar imagen 
     */
    public void send_images(){
        System.out.println("Se enviaron satisfactoriamente las imagenes a la superficie");
        
    }
    /**
     * Metodo sin retorno del proceso estudio de cuerpos celestes
     */
    public void study_celestial_bodies(){
        System.out.println("Estudio de cuerpos selestes satisfecho");
        
    }
    /**
     * Metodo sin retorno en el se implementa un metodo de una clase abstracta,  se aplica polimorfismo.
     */
    @Override
    public void leave_atmosphere() {
        System.out.println("La nave no tripulada Mariner iv  abandono la admosfera");
        
    }
    /**
     * Metodo sin retorno en el se implementa un metodo de una clase abstracta,  se aplica polimorfismo.
     */
    @Override
    public void start_engine() {
        System.out.println(" Preparando el arranque del motor de la nave SMariner iv");
        
    }
    /**
     * Metodo sin retorno en el se implementa un metodo de una interfaz.
     */
    @Override
    public void fill_fuel() {
        System.out.println(" Nave cargada con Hidracina");
        
    }


    
}

/**
 *Libreria imporada
    */
import javax.swing.JOptionPane;
/**
 * Clase principal tipo main, en la que se crean todos los objetos del cada tipo de nave y se interactua con el usuario. 
 * 
 * @author Paola Andrea Guerreo
 */
public class App {
      /**
     * Representa los atributos utilizdos en el main.
     */
    public Boolean flang;
    public String option;
    public int update_option;
    public String attribute;
    public Boolean flang2;
      /**
     * MEtodo principal para implementar el programa.
     */
    public static void main(String[] args) throws Exception {
        
        /**
         * Dandole valor a algunos atributos. 
         */
        App App1 = new App();

        App1.flang=true;
        App1.flang2 = true;
        
        /**
         * Ciclo While para repeticion del programa hasta que la vaiable flang sea falsa.
         */
        while(App1.flang){
            /**
             * Despliega ventana emergente con las opciones iniciales del programa.
             */
            App1.option = JOptionPane.showInputDialog("Digite el numero dependiendo la opcion de la nave que desea crear. \n 1: crear objeto tipo ShuttleVehicleSaturno. \n 2: crear objeto tipo  UnmannedShipMarineriv. \n 3: Crear objeto tipo MannedShipShylab. \n 4: Crear objeto tipo MannedShipShylabApolo. \n 5: En caso dado que desee salir. ");
            /**
             * Switch. Valida las entradas digitadas por el usuario, para asociarla a un proceso determinad.
            * @param option.
             */
            switch (App1.option) {
                /**
                 *Diferentes casos para Crear tipos de objetos naves.
                 */
                case "1":{
                    /**
                     * Se crea el objeto de nomnre ship_Saturno tipo ShuttleVehicleSaturno
                     */
                    ShuttleVehicleSaturno ship_Saturno = new ShuttleVehicleSaturno();
                    /**
                     * Se modifican los atributos heredados por la extencion, implementacion y los propios del objeto
                     */
                    ship_Saturno.setName("Saturno");
                    ship_Saturno.setFuel_type("petróleo refinado y oxígeno líquido");
                    ship_Saturno.setPower(3200);
                    /**
                     * Se despliega ventana emergente con las diferentes caracteristicas del objeto creado.
                     */
                    JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_Saturno.getName() + "\n Tipo de combustible: " + ship_Saturno.getFuel_type() + "\n potencia en caballos de: " + ship_Saturno.getPower() + "\n Peso de carga: "+ ship_Saturno.loadweight_tons + "\n Pais perteneciente: " + ship_Saturno.getCountry() + "\n Empuje en toneladas de: " + ship_Saturno.push_tons);
                    /**
                     * While. Ciclo para actualizar atributos del objeto.
                     */
                    while (App1.flang2){
                        /**
                         * Despliega ventana emergente con las opciones de actualizacion de atributos.
                         */
                        App1.update_option = Integer.parseInt( JOptionPane.showInputDialog(" Desea Actualizar alguna caracteristica de la nave \n 1:para actualizar \n 0: Para crear otro objeto"));
                        /**
                         * Valida que el usuario quiera hacer una actualizacion de atributos.
                         */
                        if (App1.update_option == 1){
                            /**
                             * Despliega ventana emergente con las opciones de actualizacion de atributos.
                             */
                            App1.attribute = JOptionPane.showInputDialog("Digite la opción de la caracteristica que desea actualizar. \n 1: Actualizar Pais. \n 2: Actualizar Nombre. \n 3: tipo de combustible \n 4: Salir");
                            /**
                             * Switch. Valida las entradas digitadas por el usuario, para asociarla a un proceso determinad.
                             * @param attribute.
                             */
                            switch (App1.attribute){
                                /**
                                 *Diferentes casos para modificar atributos..
                                 */
                                case "1":{
                                    ship_Saturno.setCountry(JOptionPane.showInputDialog("Digite el nombre del pais"));
                                    break;
                                }
                                case "2":{
                                    ship_Saturno.setName(JOptionPane.showInputDialog("Digite el nombre de la nave"));
                                    break;
                                }
                                case "3":{
                                    ship_Saturno.setFuel_type(JOptionPane.showInputDialog("Digite el nombre del combustible"));
                                    break;
                                }
                                /**
                                 * Caso que finaliza sgundo ciclo while, e imprime los atributos del objeto modificado.
                                 */
                                case "4":{
                                    JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_Saturno.getName() + "\n Tipo de combustible: " + ship_Saturno.getFuel_type() + "\n potencia en caballos de: " + ship_Saturno.getPower() + "\n Peso de carga: "+ ship_Saturno.loadweight_tons + "\n Pais perteneciente: " + ship_Saturno.getCountry() + "\n Empuje en toneladas de: " + ship_Saturno.push_tons);
                                    App1.flang2 = false;
                                    App1.update_option = 0;
                                    break;
                                }
                                default: {
                                    JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_Saturno.getName() + "\n Tipo de combustible: " + ship_Saturno.getFuel_type() + "\n potencia en caballos de: " + ship_Saturno.getPower() + "\n Peso de carga: "+  ship_Saturno.loadweight_tons + "\n Pais perteneciente: " + ship_Saturno.getCountry() + "\n Empuje en toneladas de: " + ship_Saturno.push_tons);
                                    App1.flang2 = false;
                                    App1.update_option = 0;
                                    break;
                                }
                            }
                        }
                        /**
                         * No se realiza actualizacion de atributos.
                         */
                        else {
                            JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_Saturno.getName() + "\n Tipo de combustible: " + ship_Saturno.getFuel_type() + "\n potencia en caballos de: " + ship_Saturno.getPower() + "\n Peso de carga: "+ ship_Saturno.loadweight_tons + "\n Pais perteneciente: " + ship_Saturno.getCountry() + "\n Empuje en toneladas de: " + ship_Saturno.push_tons);
                            App1.flang2 = false;
                        }
                    }
                    /**
                     * Variable  que activa segundo ciclo while.
                     */
                    App1.flang2 = true;
                    break;
                }
                /**
                 *Diferentes casos para Crear tipos de objetos naves.
                 */
                case "2":{
                    /**
                     * Se crea el objeto de nomnre ship_Saturno tipo ShuttleVehicleSaturno
                     */
                    UnmannedShipMarineriv ship_Marineriv = new UnmannedShipMarineriv();
                    /**
                     * Se modifican los atributos heredados por la extencion, implementacion y los propios del objeto
                     */
                    ship_Marineriv.setName("MarineIV");
                    ship_Marineriv.setFuel_type("hidracina");
                    ship_Marineriv.setPower(272);
                    /**
                     * Se despliega ventana emergente con las diferentes caracteristicas del objeto creado.
                     */
                    JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_Marineriv.getName() + "\n Tipo de combustible: " + ship_Marineriv.getFuel_type() + "\n potencia en caballos de: " + ship_Marineriv.getPower() + "\n Altura: "+ ship_Marineriv.height_meters + "\n Pais perteneciente: " + ship_Marineriv.getCountry() + "\n Empuje en kg de: " + ship_Marineriv.push_kg);
                    /**
                     * While. Ciclo para actualizar atributos del objeto.
                     */
                    while (App1.flang2){
                        /**
                         * Despliega ventana emergente con las opciones de actualizacion de atributos.
                         */
                        App1.update_option = Integer.parseInt( JOptionPane.showInputDialog(" Desea Actualizar alguna caracteristica de la nave \n 1:para actualizar \n 0: Para crear otro objeto"));
                         /**
                         * Valida que el usuario quiera hacer una actualizacion de atributos.
                         */
                        if (App1.update_option == 1){
                            /**
                             * Despliega ventana emergente con las opciones de actualizacion de atributos.
                             */
                            App1.attribute = JOptionPane.showInputDialog("Digite la opción de la caracteristica que desea actualizar. \n 1: Actualizar Pais. \n 2: Actualizar Nombre. \n 3: tipo de combustible \n 4: Salir");
                            /**
                             * Switch. Valida las entradas digitadas por el usuario, para asociarla a un proceso determinad.
                             * @param attribute.
                             */
                            switch (App1.attribute){
                                /**
                                 *Diferentes casos para modificar atributos..
                                 */
                                case "1":{
                                    ship_Marineriv.setCountry(JOptionPane.showInputDialog("Digite el nombre del pais"));
                                    break;
                                }
                                case "2":{
                                    ship_Marineriv.setName(JOptionPane.showInputDialog("Digite el nombre de la nave"));
                                    break;
                                }
                                case "3":{
                                    ship_Marineriv.setFuel_type(JOptionPane.showInputDialog("Digite el combustible utilizado por la nave"));
                                    break;
                                }
                                /**
                                 * Caso que finaliza segundo ciclo while (Actualizaciones de atribuos), e imprime los atributos del objeto modificado.
                                 */
                                case "4":{
                                    JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_Marineriv.getName() + "\n Tipo de combustible: " + ship_Marineriv.getFuel_type() + "\n potencia en caballos de: " + ship_Marineriv.getPower() + "\n Altura: "+ ship_Marineriv.height_meters + "\n Pais perteneciente: " + ship_Marineriv.getCountry() + "\n Empuje en kg de: " + ship_Marineriv.push_kg);
                                    App1.flang2 = false;
                                    App1.update_option = 0;
                                    break;
                                }
                                default: {
                                    JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_Marineriv.getName() + "\n Tipo de combustible: " + ship_Marineriv.getFuel_type() + "\n potencia en caballos de: " + ship_Marineriv.getPower() + "\n Peso en toneladas: "+ ship_Marineriv.weight_tons + "\n Pais perteneciente: " + ship_Marineriv.getCountry() + "\n Empuje en kg de: " + ship_Marineriv.push_kg);
                                    App1.flang2 = false;
                                    App1.update_option = 0;
                                    break;
                                }
                            }
                        }
                        /**
                         * No se realiza actualizacion de atributos.
                         */
                        else {
                            JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_Marineriv.getName() + "\n Tipo de combustible: " + ship_Marineriv.getFuel_type() + "\n potencia en caballos de: " + ship_Marineriv.getPower() + "\n Altura: "+ ship_Marineriv.height_meters + "\n Pais perteneciente: " + ship_Marineriv.getCountry() + "\n Empuje en kg de: " + ship_Marineriv.push_kg);
                            App1.flang2 = false;
                        }
                    }
                    /**
                     * Variable  que activa segundo ciclo while.
                     */
                    App1.flang2 = true;
                    break;
                }
                /**
                 *Diferentes casos para Crear tipos de objetos naves.
                 */
                case "3":{
                    /**
                     * Se crea el objeto de nomnre ship_ShipShylab tipo MannedShipShylab.
                     */
                    MannedShipShylab ship_ShipShylab = new MannedShipShylab();
                    /**
                     * Se modifican los atributos heredados por la extencion, implementacion y los propios del objeto
                     */
                    ship_ShipShylab.setName("Shylab");
                    ship_ShipShylab.setFuel_type("hidracina");
                    ship_ShipShylab.setPower(435);
                    /**
                     * Se despliega ventana emergente con las diferentes caracteristicas del objeto creado.
                     */
                    JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_ShipShylab.getName() + "\n Tipo de combustible: " + ship_ShipShylab.getFuel_type() + "\n potencia en caballos de: " + ship_ShipShylab.getPower() + "\n Peso en toneladas: "+ ship_ShipShylab.weight_tons + "\n Pais perteneciente: " + ship_ShipShylab.country+ "\n Capacidad: " + ship_ShipShylab.capacity);
                    /**
                     * While. Ciclo para actualizar atributos del objeto.
                     */
                    while (App1.flang2){
                        /**
                         * Despliega ventana emergente con las opciones de actualizacion de atributos.
                         */
                        App1.update_option = Integer.parseInt( JOptionPane.showInputDialog(" Desea Actualizar alguna caracteristica de la nave \n 1:para actualizar \n 0: Para crear otro objeto"));
                        /**
                         * Valida que el usuario quiera hacer una actualizacion de atributos.
                         */
                        if (App1.update_option == 1){
                            /**
                             * Despliega ventana emergente con las opciones de actualizacion de atributos.
                             */
                            App1.attribute = JOptionPane.showInputDialog("Digite la opción de la caracteristica que desea actualizar. \n 1: Actualizar Pais. \n 2: Actualizar Nombre. \n 3: tipo de combustible \n 4: Salir");
                            /**
                             * Switch. Valida las entradas digitadas por el usuario, para asociarla a un proceso determinad.
                             * @param attribute.
                             */
                            switch (App1.attribute){
                                /**
                                 *Diferentes casos para modificar atributos..
                                 */
                                case "1":{
                                    ship_ShipShylab.country(JOptionPane.showInputDialog("Digite el nombre del pais"));
                                    break;
                                }
                                case "2":{
                                    ship_ShipShylab.setName(JOptionPane.showInputDialog("Digite el nombre de la nave"));
                                    break;
                                }
                                case "3":{
                                    ship_ShipShylab.setFuel_type(JOptionPane.showInputDialog("Digite el combustible utilizado por la nave"));
                                    break;
                                }
                                /**
                                 * Caso que finaliza segundo ciclo while (Actualizaciones de atribuos), e imprime los atributos del objeto modificado.
                                 */
                                case "4":{
                                    JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_ShipShylab.getName() + "\n Tipo de combustible: " + ship_ShipShylab.getFuel_type() + "\n potencia en caballos de: " + ship_ShipShylab.getPower() + "\n Peso en toneladas: "+ ship_ShipShylab.weight_tons + "\n Pais perteneciente: " + ship_ShipShylab.country+ "\n Capacidad: " + ship_ShipShylab.capacity);
                                    App1.flang2 = false;
                                    App1.update_option = 0;
                                    break;
                                }
                                default: {
                                    JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_ShipShylab.getName() + "\n Tipo de combustible: " + ship_ShipShylab.getFuel_type() + "\n potencia en caballos de: " + ship_ShipShylab.getPower() + "\n Peso en toneladas: "+ ship_ShipShylab.weight_tons + "\n Pais perteneciente: " + ship_ShipShylab.country+ "\n Capacidad: " + ship_ShipShylab.capacity);
                                    App1.flang2 = false;
                                    App1.update_option = 0;
                                    break;
                                }
                            }
                        }
                        /**
                         * No se realiza actualizacion de atributos.
                         */
                        else {
                            JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_ShipShylab.getName() + "\n Tipo de combustible: " + ship_ShipShylab.getFuel_type() + "\n potencia en caballos de: " + ship_ShipShylab.getPower() + "\n Peso en toneladas: "+ ship_ShipShylab.weight_tons + "\n Pais perteneciente: " + ship_ShipShylab.country+ "\n Capacidad: " + ship_ShipShylab.capacity);
                            App1.flang2 = false;
                        }
                    }
                    /**
                     * Variable  que activa segundo ciclo while.
                     */
                    App1.flang2 = true;
                    break;
                }
                /**
                 *Diferentes casos para Crear tipos de objetos naves.
                 */
                case "4":{
                    /**
                     * Se crea el objeto de nomnre ship_Apolo tipo MannedShipShylabApolo.
                     */
                    MannedShipShylabApolo ship_Apolo = new MannedShipShylabApolo();
                    /**
                     * Se modifican los atributos heredados por la extencion, implementacion y los propios del objeto
                     */
                    ship_Apolo.setName("Shylab");
                    ship_Apolo.setFuel_type("hidracina");
                    ship_Apolo.setPower(435);
                    /**
                     * Se despliega ventana emergente con las diferentes caracteristicas del objeto creado.
                     */
                    JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_Apolo.getName() + "\n Tipo de combustible: " + ship_Apolo.getFuel_type() + "\n potencia en caballos de: " + ship_Apolo.getPower() + "\n Peso en toneladas: "+ ship_Apolo.weight_tons + "\n Pais perteneciente: " + ship_Apolo.country+ "\n Capacidad: " + ship_Apolo.capacity);
                    /**
                     * While. Ciclo para actualizar atributos del objeto.
                     */
                    while (App1.flang2){
                        /**
                         * Despliega ventana emergente con las opciones de actualizacion de atributos.
                         */
                        App1.update_option = Integer.parseInt( JOptionPane.showInputDialog(" Desea Actualizar alguna caracteristica de la nave \n 1:para actualizar \n 0: Para crear otro objeto"));
                        /**
                         * Valida que el usuario quiera hacer una actualizacion de atributos.
                         */
                        if (App1.update_option == 1){
                            /**
                             * Despliega ventana emergente con las opciones de actualizacion de atributos.
                             */
                            App1.attribute = JOptionPane.showInputDialog("Digite la opción de la caracteristica que desea actualizar. \n 1: Actualizar Pais. \n 2: Actualizar Nombre. \n 3: tipo de combustible \n 4: Salir");
                            /**
                             * Switch. Valida las entradas digitadas por el usuario, para asociarla a un proceso determinad.
                             * @param attribute.
                             */
                            switch (App1.attribute){
                                /**
                                 *Diferentes casos para modificar atributos..
                                 */
                                case "1":{
                                    ship_Apolo.country(JOptionPane.showInputDialog("Digite el nombre del pais"));
                                    break;
                                }
                                case "2":{
                                    ship_Apolo.setName(JOptionPane.showInputDialog("Digite el nombre de la nave"));
                                    break;
                                }
                                case "3":{
                                    ship_Apolo.setFuel_type(JOptionPane.showInputDialog("Digite el combustible utilizado por la nave"));
                                    break;
                                }
                                /**
                                 * Caso que finaliza segundo ciclo while (Actualizaciones de atribuos), e imprime los atributos del objeto modificado.
                                 */
                                case "4":{
                                    JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_Apolo.getName() + "\n Tipo de combustible: " + ship_Apolo.getFuel_type() + "\n potencia en caballos de: " + ship_Apolo.getPower() + "\n Peso en toneladas: "+ ship_Apolo.weight_tons + "\n Pais perteneciente: " + ship_Apolo.country+ "\n Capacidad: " + ship_Apolo.capacity);
                                    App1.flang2 = false;
                                    App1.update_option = 0;
                                    break;
                                }
                                default: {
                                    JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_Apolo.getName() + "\n Tipo de combustible: " + ship_Apolo.getFuel_type() + "\n potencia en caballos de: " + ship_Apolo.getPower() + "\n Peso en toneladas: "+ ship_Apolo.weight_tons + "\n Pais perteneciente: " + ship_Apolo.country+ "\n Capacidad: " + ship_Apolo.capacity);
                                    App1.flang2 = false;
                                    App1.update_option = 0;
                                    break;
                                }
                            }
                        }
                        /**
                         * No se realiza actualizacion de atributos.
                         */
                        else {
                            JOptionPane.showMessageDialog(null, "Se creo correctamente la nave \n Nombre: " + ship_Apolo.getName() + "\n Tipo de combustible: " + ship_Apolo.getFuel_type() + "\n potencia en caballos de: " + ship_Apolo.getPower() + "\n Peso en toneladas: "+ ship_Apolo.weight_tons + "\n Pais perteneciente: " + ship_Apolo.country+ "\n Capacidad: " + ship_Apolo.capacity);
                            App1.flang2 = false;
                        }
                    }
                     /**
                     * Variable  que activa segundo ciclo while.
                     */
                    App1.flang2 = true;
                    break;
                }
                 /**
                 * Caso que finaliza ciclo while principal, e imprime un saludo de despedida.
                 */
                case "5":{
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro progama.");
                    App1.flang=false;
                    break;
                }
            } 
        }
    }
}

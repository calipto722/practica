/* Guía 1 Parte 1 Problema 1:
En un nuevo proyecto crear una clase de nombre Producto con los atributos código de tipo
entero, descripción un String, precio de tipo double y stock de tipo entero; un constructor
que permita inicializar todos sus atributos y los métodos get y set. Desde el método main
de clase principal del proyecto instanciar un Producto y luego mostrar por consola el estado
de todos sus atributos.
 */
package guía_01_parte_01_problema_01_producto;

public class Guía_01_Parte_01_Problema_01_Producto {

    public static void main(String[] args) {
        Producto zapatilla = new Producto(2456,"Nike",23000,3);
        System.out.println("Código "+zapatilla.getCodigo());
        System.out.println("Descripción "+zapatilla.getDescripcion());
        System.out.println("Precio "+zapatilla.getPrecio());
        System.out.println("Stock "+zapatilla.getStock());

    }
    
}

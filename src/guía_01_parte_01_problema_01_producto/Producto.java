/* Guía 1 Parte 1 Problema 1:
En un nuevo proyecto crear una clase de nombre Producto con los atributos código de tipo
entero, descripción un String, precio de tipo double y stock de tipo entero; un constructor
que permita inicializar todos sus atributos y los métodos get y set. Desde el método main
de clase principal del proyecto instanciar un Producto y luego mostrar por consola el estado
de todos sus atributos.
 */
package guía_01_parte_01_problema_01_producto;

public class Producto {
 //Atributos
private int codigo;
private String descripcion;
private double precio;
private int stock; // En PSeint sería Definir stock como entero.
 //Constructor
    public Producto(int codigo, String descripcion, double precio, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
 //Métodos get y set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}

package main.java.org.example.mercadaw;

import java.util.Map;
import java.util.Objects;

public class Cliente {

    //Definimos una direccion predeterminada
    private static final String DIRECCION_DEFF = "calle falsa, 123";

    private String usuario;
    private String contrasena;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    public Cliente (String usuario, String contrasena){

        this.usuario = usuario;
        this.contrasena = contrasena;
        this.direccion = DIRECCION_DEFF;
        this.pedido = null;
        this.promociones = false;

    }

    //Creamos el pedido del usuario
    public void crearPedido(){

        setPedidoC(new Pedido(0.0));

    }

    //Actualizamos el total del carrito
    public void importePedido(double carrito){

        this.getPedido().setImporte_total(carrito);

    }

    //Guardamos el producto en la lista de productos
    public void insertarProducto(String producto){

        //Le pasamos a la clase Producto nuestro producto para guardarlo en su mapa.
        pedido.setPedidoP(producto);

    }

    //Hemos llegado al metodo loco.
    public void eliminarProducto(String producto) {

        try {

            //Con esto Recorremos la lista de prroductos
            for (Map.Entry<Producto, Integer> mapita : pedido.getPedido().entrySet()) {

                //En caso de encontrar el producto indicado
                if (mapita.getKey().equals(Producto.valueOf(producto))) {

                    //Quiero comprobar si la cantidad en la lista es 0 para eliminar el producto de la lista, si no lo es, le resto 1 y lo borro.
                    pedido.getPedido().put(Producto.valueOf(producto), pedido.getPedido().getOrDefault(Producto.valueOf(producto), 0) - 1);

                    //Guardamos el total en una variable para recalcularlo
                    double total = pedido.getImporte_total();

                    //Guardamos el precio del producto que vamos a elminar para restarlo a la cesta
                    double productoEliminado = mapita.getKey().getPrecio();
                    total -= productoEliminado;
                    pedido.setImporte_total(total);

                    //Si la cantidad es 0 eliminamos el producto de la lista.
                    if (mapita.getValue() == 0) {
                        pedido.getPedido().remove(Producto.valueOf(producto));
                    }

                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ese producto no esta en tu carrito :c. Vuelve a intentarlo...");
        }

        //En caso de que se vacie la lista por completo cancelamos la compra
        if (pedido.getPedido().isEmpty()) {

            terminarpedido();
            System.out.println();

        }

        //Comprobamos si el pedido ha tenido promociones o no.
        if(isPromociones()){

            //Si no ha tenido entramos a este metodo
            comprobarPromo(producto);

        }

    }

    public void comprobarPromo(String producto){

        //Recalculamos el precio sin promociones
        double carrito = 0;
        pedido.setImporte_total(0);

        for (Map.Entry<Producto, Integer> mapita : pedido.getPedido().entrySet()){
            if(Producto.valueOf(producto).equals(mapita.getKey())) {
                carrito += mapita.getKey().getPrecio() * mapita.getValue();
            }
        }

        //Volvemos a aplicarlas sobre las nuevas cantidades.
        importePedido(carrito);
        pedido.aplicarPromo3x2();
        pedido.aplicarPromo10();

    }

    //Despedimos el programa con este metodo.
    public void terminarpedido(){


        if (!pedido.getPedido().isEmpty()) {
            System.out.println("GRACIAS POR SU PEDIDO! Se lo mandaremos a la dirección " + direccion);
        } else {
            System.out.println("Has vaciado tu carro de la compra! Cerrand la sesión ... :C");
            System.exit(0);
        }

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isPromociones() {
        return promociones;
    }

    public void setPromociones(boolean promociones) {
        this.promociones = promociones;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedidoC(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(usuario, cliente.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario);
    }

    @Override
    public String toString() {
        return "Cliente[" +
                "Usuario = '" + usuario + '\'' +
                ", Contrasena = '" + contrasena + '\'' +
                ", Direccion = '" + direccion + '\'' +
                ", Promociones = " + promociones +
                ", Pedido = " + pedido +
                ']';
    }
}

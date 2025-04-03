package main.java.org.example.mercadaw;

import java.util.Map;
import java.util.Objects;

public class Cliente {

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

    public void crearPedido(){

        setPedidoC(new Pedido(0.0));

    }

    public void importePedido(double carrito){

        this.getPedido().setImporte_total(carrito);

    }

    public void insertarProducto(String producto){

        pedido.setPedidoP(producto);

    }

    public void eliminarProducto(String producto) {

        try {

            pedido.getPedido().put(Producto.valueOf(producto), pedido.getPedido().getOrDefault(Producto.valueOf(producto), 0) - 1);
            //Quiero comprobar si la cantidad en la lista es 0 para eliminar el producto de la lista.
            for (Map.Entry<Producto, Integer> mapita : pedido.getPedido().entrySet()) {

                double total = pedido.getImporte_total();
                double productoEliminado = mapita.getKey().getPrecio();
                total -= productoEliminado;
                pedido.setImporte_total(total);


                if (mapita.getValue() == 0) {
                    pedido.getPedido().remove(Producto.valueOf(producto));
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ese producto no esta en tu carrito :c. Vuelve a intentarlo...");
        }

        if (pedido.getPedido().isEmpty()) {

            terminarpedido();
            System.out.println();

        }

        if(isPromociones()){

            comprobarPromo(producto);

        }

    }

    public void comprobarPromo(String producto){

        double carrito = 0;
        pedido.setImporte_total(0);

        for (Map.Entry<Producto, Integer> mapita : pedido.getPedido().entrySet()){
            if(Producto.valueOf(producto).equals(mapita.getKey())) {
                carrito += mapita.getKey().getPrecio()* mapita.getValue();
            }
        }

        importePedido(carrito);
        pedido.aplicarPromo3x2();
        pedido.aplicarPromo10();

    }

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

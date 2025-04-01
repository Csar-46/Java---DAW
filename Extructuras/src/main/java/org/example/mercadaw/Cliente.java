package main.java.org.example.mercadaw;

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

    public void importePedido(){



    }

    public void crearPedido(){

        setPedidoC(new Pedido(0.0));

    }

    public void insertarProducto(String producto){

        pedido.setPedidoP(producto);

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

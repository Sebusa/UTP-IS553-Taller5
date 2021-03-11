package ejercicio05.clases;

public class Factura extends Precio{
    private String emisor;
    private String cliente;
    
    public String getEmisor() {
        return emisor;
    }
    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Factura(String emisor, String cliente, Double pesos){
        this.setEmisor(emisor);
        this.setCliente(cliente);
        super.setPesos(pesos);
    }
    
    public void imprimirFactura(){
        System.out.println("--FACTURA GENERADA--");
        System.out.println("Nombre del emisor: " + this.getEmisor());
        System.out.println("Nombre del cliente: " + this.getCliente());
        System.out.println("Precio de la factura: " + super.getPesos());
    }
}

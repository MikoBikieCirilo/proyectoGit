public class ProductoReducido {

    double precio=3;
    public ProductoReducido(double precio){
        this.precio=precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ProductoReducido {"+this.precio+"}";
    }
}

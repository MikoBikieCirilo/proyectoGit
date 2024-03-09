public class ProductoNormal {

    double precio=5;
    public ProductoNormal(double precio){
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
        return "ProductoNormal {"+this.precio+"}";
    }
}

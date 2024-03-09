public class ProductoSuperReducido {
    double precio=12;
  public ProductoSuperReducido(double precio){
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
        return "ProductoSuperReducido {"+this.precio+"}";
    }
}

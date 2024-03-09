public class CalculoIVA {
    ProductoNormal pn;
    ProductoReducido pr;
    ProductoSuperReducido prs;

    //metodo productonormal
    public static double PrecioVenta(ProductoNormal pn) {
        pn.getPrecio(); //le cogemos el precio del producto normal
       double suma=0.21+pn.getPrecio(); //hacemos la suma con el precio y 21%
        return suma; //devolvemos el resultado de la suma

    }

    //metodo productoReducido

    public static double PrecioVenta(ProductoReducido pr) {
        pr.getPrecio(); //le cogemos el precio del productoR
        double suma=0.10+pr.getPrecio(); //hacemos la suma con el precio y 10%
        return suma; //devolvemos el resultado de la suma

    }

    //metodo productosuperreducido

    public static double PrecioVenta(ProductoSuperReducido psr) {
        psr.getPrecio(); //le cogemos el precio del productoSr
        double suma=0.04+psr.getPrecio(); //hacemos la suma con el precio y 4%
        return suma; //devolvemos el resultado de la suma

    }

}

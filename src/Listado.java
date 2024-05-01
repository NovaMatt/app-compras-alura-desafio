

public class Listado implements Comparable<Listado>{
    String nombreProducto;
    float precioProducto;

    Listado(String nombreProducto,float precioProducto){
        this.nombreProducto=nombreProducto;
        this.precioProducto=precioProducto;
    }


    @Override
    public int compareTo(Listado otroListado) {

        return  Float.compare(this.precioProducto,otroListado.precioProducto);
//        return Double.valueOf(this.precioProducto).compareTo(Double.valueOf(otroListado.precioProducto));
    }



    public String toString(){
        return nombreProducto + " - " + precioProducto;
    }
}

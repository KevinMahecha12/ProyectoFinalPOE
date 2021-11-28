package proyectofinalsupermercado;


public class Inventario {
        int ID_Producto;
        String Nombre_producto;
        int Cant_prod;
        String Desc_prod;
        Double Precio_Producto;

    public Inventario(int ID_Producto, String Nombre_producto, int Cant_prod, String Desc_prod, Double Precio_Producto) {
        this.ID_Producto = ID_Producto;
        this.Nombre_producto = Nombre_producto;
        this.Cant_prod = Cant_prod;
        this.Desc_prod = Desc_prod;
        this.Precio_Producto = Precio_Producto;
    }

    public Inventario() {
    }

    public int getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(int ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public String getNombre_producto() {
        return Nombre_producto;
    }

    public void setNombre_producto(String Nombre_producto) {
        this.Nombre_producto = Nombre_producto;
    }

    public int getCant_prod() {
        return Cant_prod;
    }

    public void setCant_prod(int Cant_prod) {
        this.Cant_prod = Cant_prod;
    }

    public String getDesc_prod() {
        return Desc_prod;
    }

    public void setDesc_prod(String Desc_prod) {
        this.Desc_prod = Desc_prod;
    }

    public Double getPrecio_Producto() {
        return Precio_Producto;
    }

    public void setPrecio_Producto(Double Precio_Producto) {
        this.Precio_Producto = Precio_Producto;
    }
        
        
}

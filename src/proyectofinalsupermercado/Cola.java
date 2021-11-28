package proyectofinalsupermercado;

public class Cola {
    public Producto inicio;
    int tamaño=0;
    
    Cola(){
        inicio=null;
    }
    
    public Producto esVacio(){ //Para ver si esta vacia
        return inicio;
    }
    
    public void desencolar(){
        inicio = inicio.siguienteProducto;
        tamaño--;
    } //desencolar
    
    public void push(Producto obj){
        Producto nuevo = new Producto();
        nuevo = obj;
        if(inicio == null){
            inicio = nuevo;
            tamaño++;
        }else{
            Producto aux = inicio;
            while(true){
                if(aux.siguienteProducto!=null){
                    aux = aux.siguienteProducto;
                }else{
                    aux.siguienteProducto=nuevo;
                     tamaño++;
                    break;
                }
                
            }//while
        }//if
        
    }//Push
    
    public void pop(){
        inicio = inicio.siguienteProducto;
        tamaño--;
    } //Pop
    
    public Producto[] recorrer(){
        Producto aux = inicio;
        Producto[] array = new Producto[tamaño];
        int i=0;
        
        while(aux!=null){
            array[i] = aux;
            aux = aux.siguienteProducto;
            i++;
        }
        
        return array;
    }
    
    public void modificar(String name, Producto obj){
        Producto aux = inicio;
        int i=0;
        
        while(aux!=null){
            if(aux.Nombre_producto.equals(name)){
                aux.Nombre_producto = obj.Nombre_producto;
                aux.Cant_prod = obj.Cant_prod;
                aux.ID_Producto = obj.ID_Producto;
                aux.Precio_Producto = obj.Precio_Producto;
                aux.Desc_prod = obj.Desc_prod;
            }
            aux = aux.siguienteProducto;
            i++;
        }
    }


}

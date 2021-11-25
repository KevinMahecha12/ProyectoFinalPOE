
package proyectofinalsupermercado;


public class Cola {
    public Producto inicio;
    int tamaño=0;
    
    Cola(){
        inicio=null;
    }
    
    public Producto getPilaProducto(){ //Para ver si esta vacia
        return inicio;
    }
    
    public void push(Producto obj){
        Producto nuevo = new Producto();
        nuevo = obj;
        if(inicio == null){
            inicio = nuevo;
        }else{
            Producto aux = inicio;
            while(true){
                if(aux.siguienteProducto!=null){
                    aux = aux.siguienteProducto;
                     tamaño++;
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
    

}

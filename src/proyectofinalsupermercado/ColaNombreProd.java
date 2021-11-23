package proyectofinalsupermercado;

public class ColaNombreProd
{
 //Declaración de atributos
 private NodoColasString inicio;
 private NodoColasString termino;

 //Constructor sin parametros
 public ColaNombreProd()
 {
 inicio=null;
 termino=null;
 }
 
 //Metodo insertar
 public void insertar(String dato)
 {
 NodoColasString i=new NodoColasString(dato);
 i.setNextString(null);
 if(inicio==null & termino==null)
 {
 inicio=i;
 termino=i;
 }
 termino.setNextString(i);
 termino=termino.getNext();
 }
 
 //Metodo extraer dato
 public String extraer()
 {
 String dato=inicio.getDato();
 inicio=inicio.getNext();
 return dato;
 }
 
 //Metodo para comprobar que la cola no esta vacia
 public boolean estaVacia()
 {
 boolean cola=false;
 if(inicio==null & termino==null)
 {
 cola=true;
 System.out.println("La cola esta vacia");
 }
 else
 {
 System.out.println("La cola no esta vacia");
 cola=false;
 }
 return cola;
 }
 
 //Metodo para contar los elementos de la cola
 public int contar()
 {
 int contador=0;
 NodoColasString c=this.inicio;
 while(c!=null)
 {
 contador++;
 c=c.getNext();
 }
 System.out.println("Numero de datos en la cola: "+contador);
 return contador;
 }
 
 //Metodo toString
 public String toString()
 {
 NodoColasString c=this.inicio;
 String s="";
 while(c!=null)
 {
 s=s+c.toString();
 c=c.getNext();
 }
 return s;
 } 
}

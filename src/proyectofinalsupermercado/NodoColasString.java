package proyectofinalsupermercado;

public class NodoColasString 
{
 //Declaracion de atributos
 private String dato;
 private NodoColasString next;
 
 //Constructor
 public NodoColasString(String dato){
 this.dato=dato;
 }
 
 //Metodos getter and setters
 public String getDato() 
 {
 return dato;
 }
 public void setDato(String dato) 
 {
 this.dato = dato;
 }
 public NodoColasString getNext() 
 {
 return next;
 }
 public void setNextString(NodoColasString next) 
 {
 this.next = next;
 }
 
 //Metodo toString
 public String toString()
 {
 String s=" "+dato+" ";
 return s;
 }
}

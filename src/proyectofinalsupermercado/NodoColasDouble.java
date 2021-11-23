package proyectofinalsupermercado;

public class NodoColasDouble
{
 //Declaracion de atributos
 private Double dato;
 private NodoColasDouble next;
 
 //Constructor
 public NodoColasDouble(Double dato){
 this.dato=dato;
 }
 
 //Metodos getter and setters
 public Double getDato() 
 {
 return dato;
 }
 public void setDato(Double dato) 
 {
 this.dato = dato;
 }
 public NodoColasDouble getNext() 
 {
 return next;
 }
 public void setNextDouble(NodoColasDouble next) 
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

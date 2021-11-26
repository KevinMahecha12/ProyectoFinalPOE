package proyectofinalsupermercado;


public class NodoColas 
{
 //Declaracion de atributos
 private int dato;
 private NodoColas next;
 
 //Constructor
 public NodoColas(int dato){
 this.dato=dato;
 }
 
 //Metodos getter and setters
 public int getDato() 
 {
 return dato;
 }
 public void setDato(int dato) 
 {
 this.dato = dato;
 }
 public NodoColas getNext() 
 {
 return next;
 }
 public void setNext(NodoColas next) 
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

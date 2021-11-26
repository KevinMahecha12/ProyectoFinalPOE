package proyectofinalsupermercado;


public class EmpleadosInicioSesion {
  
    String Nombre_Empleado;
    String Area_Trabajador;
    int Turno;
    
    EmpleadosInicioSesion  empleados[]=new EmpleadosInicioSesion[5];

    @Override
    public String toString() {
        
        this.setNombre_Empleado(Nombre_Empleado);
        this.setArea_Trabajador(Area_Trabajador);
        this.setTurno(Turno);
        
        return Nombre_Empleado + Area_Trabajador + Turno;
        
        
        
    }

    
    public EmpleadosInicioSesion( String Nombre_Empleado, String Area_Trabajador, int Turno) {
       
        this.Nombre_Empleado = Nombre_Empleado;
        this.Area_Trabajador = Area_Trabajador;
        this.Turno = Turno;
        
    }

    public EmpleadosInicioSesion() {
        }

   

    public String getNombre_Empleado() {
        return Nombre_Empleado;
    }

    public void setNombre_Empleado(String Nombre_Empleado) {
        this.Nombre_Empleado = Nombre_Empleado;
    }

    public String getArea_Trabajador() {
        return Area_Trabajador;
    }

    public void setArea_Trabajador(String Area_Trabajador) {
        this.Area_Trabajador = Area_Trabajador;
    }

    public int getTurno() {
        return Turno;
    }

    public void setTurno(int Turno) {
        this.Turno = Turno;
    }
    
}
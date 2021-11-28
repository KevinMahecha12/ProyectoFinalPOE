package proyectofinalsupermercado;



public class Empleados {
    int ID_EMPLEADO;
    String Nombre_Empleado;
    String Area_Trabajador;
    int Turno;

    public Empleados(int ID_EMPLEADO, String Nombre_Empleado, String Area_Trabajador, int Turno) {
        this.ID_EMPLEADO = ID_EMPLEADO;
        this.Nombre_Empleado = Nombre_Empleado;
        this.Area_Trabajador = Area_Trabajador;
        this.Turno = Turno;
    }

    public Empleados() {
    }

    public int getID_EMPLEADO() {
        return ID_EMPLEADO;
    }

    public void setID_EMPLEADO(int ID_EMPLEADO) {
        this.ID_EMPLEADO = ID_EMPLEADO;
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
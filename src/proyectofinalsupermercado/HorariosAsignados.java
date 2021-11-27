package proyectofinalsupermercado;

public class HorariosAsignados {
    int ID_Trabajador;
    String Nombre_Trabajador;
    String Dias_Horario;
    int  Turno;
    String Hora_Entrada;
    String Hora_Salida;

    HorariosAsignados(){
    }

    public HorariosAsignados(int ID_Trabajador, String Nombre_Trabajador, String Dias_Horario, int Turno, String Hora_Entrada, String Hora_Salida) {
        this.ID_Trabajador = ID_Trabajador;
        this.Nombre_Trabajador = Nombre_Trabajador;
        this.Dias_Horario = Dias_Horario;
        this.Turno = Turno;
        this.Hora_Entrada = Hora_Entrada;
        this.Hora_Salida = Hora_Salida;
    }

    public int getID_Trabajador() {
        return ID_Trabajador;
    }

    public void setID_Trabajador(int ID_Trabajador) {
        this.ID_Trabajador = ID_Trabajador;
    }

    public String getNombre_Trabajador() {
        return Nombre_Trabajador;
    }

    public void setNombre_Trabajador(String Nombre_Trabajador) {
        this.Nombre_Trabajador = Nombre_Trabajador;
    }

    public String getDias_Horario() {
        return Dias_Horario;
    }

    public void setDias_Horario(String Dias_Horario) {
        this.Dias_Horario = Dias_Horario;
    }

    public int getTurno() {
        return Turno;
    }

    public void setTurno(int Turno) {
        this.Turno = Turno;
    }

    public String getHora_Entrada() {
        return Hora_Entrada;
    }

    public void setHora_Entrada(String Hora_Entrada) {
        this.Hora_Entrada = Hora_Entrada;
    }

    public String getHora_Salida() {
        return Hora_Salida;
    }

    public void setHora_Salida(String Hora_Salida) {
        this.Hora_Salida = Hora_Salida;
    }

}

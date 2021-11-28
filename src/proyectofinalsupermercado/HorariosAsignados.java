package proyectofinalsupermercado;

public class HorariosAsignados {
    int ID_Trabajador;
    String Nombre_Trabajador;
    String nom_hor;
    String Dias_Horario;
    String Hora_Entrada;
    String Hora_Salida;

    HorariosAsignados(){
    }

    public HorariosAsignados(int ID_Trabajador, String Nombre_Trabajador,String Nombre_Horario,String Dias_Horario, String Hora_Entrada, String Hora_Salida) {
        this.ID_Trabajador = ID_Trabajador;
        this.Nombre_Trabajador = Nombre_Trabajador;
        this.Dias_Horario = Dias_Horario;
        this.nom_hor = Nombre_Horario;
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

    public String getNom_hor() {
        return nom_hor;
    }

    public void setNom_hor(String nom_hor) {
        this.nom_hor = nom_hor;
    }

}

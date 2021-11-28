package proyectofinalsupermercado;


public class Horario {
    String Nombre_Horario;
    String Dia;
    String Hora_Entrada;
    String Hora_Salida;

    public Horario(String Nombre_Horario, String Dia, String Hora_Entrada, String Hora_Salida) {
        this.Nombre_Horario = Nombre_Horario;
        this.Dia = Dia;
        this.Hora_Entrada = Hora_Entrada;
        this.Hora_Salida = Hora_Salida;
    }

    public Horario(String Dia, String Hora_Entrada, String Hora_Salida) {
        this.Dia = Dia;
        this.Hora_Entrada = Hora_Entrada;
        this.Hora_Salida = Hora_Salida;
    }

    public Horario() {
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
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

    public String getNombre_Horario() {
        return Nombre_Horario;
    }

    public void setNombre_Horario(String Nombre_Horario) {
        this.Nombre_Horario = Nombre_Horario;
    }
    
}

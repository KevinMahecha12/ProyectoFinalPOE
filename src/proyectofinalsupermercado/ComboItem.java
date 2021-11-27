package proyectofinalsupermercado;

public class ComboItem {
    String string;
    String value;

    public ComboItem(String key, String value)
    {
        this.string = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return string;
    }

    public String getKey()
    {
        return string;
    }

    public String getValue()
    {
        return value;
    }
}

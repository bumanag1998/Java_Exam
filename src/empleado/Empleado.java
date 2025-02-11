package empleado;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelllido() {
        return apellido;
    }

    public void setApelllido(String apelllido) {
        this.apellido = apelllido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean plus (double sueldoPlus){
        boolean aumento = false;
        if(edad > 40 && compruebaNombre()){
            salario += sueldoPlus;
            aumento= true;
        }
        return aumento;
    }

    private boolean compruebaNombre() {
        if (nombre.equals("")){
            return false;
        }
        return true;
    }

    public Empleado() {
        this.nombre ="";
        this.apellido="";
        this.edad=0;
        this.salario=0;
    }

    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
}

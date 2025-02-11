package empleado;

public class EmpleadoApp {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado ("Fernando","Ureña",23,800);
        Empleado empleado2 = new Empleado("","Lopez",50,1800);
        System.out.println("El salario del empleado1 es: " + empleado1.getSalario());
        empleado1.setEdad(43);
        empleado1.plus(100);
        System.out.println("El salario actual del emeplado 1 es: "+ empleado1.getSalario()  + "\n");
        empleado2.setNombre("Antonio");
        empleado2.plus(100);
        System.out.println("El salario del empleado2 es: " + empleado2.getSalario());
    }
}


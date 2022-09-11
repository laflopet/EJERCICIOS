public class ajercicio {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Fernando");
        cliente.setEdad(56);
        cliente.setTelefono(313124255);
        cliente.setCredito(true);
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

    }
}
class Persona {
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona {
    private boolean credito;

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono (){
        return this.telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public boolean getCredito (){
        return this.credito;
    }
    public void setCredito (boolean credito){
        this.credito = credito;
    }
}
class Trabajador extends Persona {
    private float salario;

}

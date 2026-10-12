public class Paciente {
    private String nombre;
    private int edad;
    private double peso;
    private String especie;
    private int consulta = 35000;

    Paciente(String nombre, String especie, double peso, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getEspecie() { return especie; }
    public double getPeso() { return peso; }

    void setEdad(int Nuevaedad){
        if (Nuevaedad < 0) {
            System.out.println("No es posible que su mascota tenga esa edad");
            return;
        }
        this.edad = Nuevaedad;
    }

    void setPeso(double Nuevopeso) {
        if (Nuevopeso <= 0) {
            System.out.println("Su mascota está en otro universo?, eso no es posible");
            return;
        }
        this.peso = Nuevopeso;
    }

    public int consulta() {
        if (this.peso > 25){
            consulta = 55000;
        }else if (this.peso > 10) {
            consulta = 45000;
        }
        if (this.edad >= 8) {
            consulta += 12000;
        }
        return consulta;
    }

    public String descripcion() {
        return this.nombre + " (" + this.especie + ", " + this.peso + "kg, " + this.edad + " anios)";
    }
}

class Veterinaria {
    public static void main(String[] args) {
        Paciente[] cliente = new Paciente[4];
        cliente[0] = new Paciente("Luna ", "Perro ", 28.5, 9);

        cliente[1] = new Paciente("Michi ", "Gato ", 4.2, 3);

        cliente[2] = new Paciente("Rocky", "Perro ", 12.0, 5);

        cliente[3] = new Paciente("Pepa", "Conejo ", 2.1, 1);

        int totalrecaudado = 0;
        for (int i = 0; i < cliente.length; i++) {
            Paciente c = cliente[i];
            int consulta = c.consulta();
            totalrecaudado += consulta;
            System.out.println(c.descripcion() + " -Precio de la consulta: $" + consulta);
            System.out.println("\n-------------------------------------------");

            cliente[1].setPeso(-3);
            System.out.println(cliente[1].descripcion());

        }
    }
}

public class Estudiante
{
    private String codigo, documento, nombre, email; 
    private Fecha fechaNacimiento;
    private Integer estrato;
    
     public Estudiante() {
    }

    public Estudiante(String codigo, String nombre, String email, String documento, Fecha fechaNacimiento, Integer estrato) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.estrato = estrato;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

}

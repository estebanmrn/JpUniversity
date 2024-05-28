
public class Ayuda {
    private Fecha fechaAsignacion;
    private Fecha fechaEntrega;
    private TipoAyuda tipo; 
    private Estado estado; 
    private Estudiante estudiante;

    public Ayuda() {
    }

    public Ayuda(TipoAyuda tipo, Estudiante estudiante, Fecha fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
        this.tipo = tipo;
        this.estado = Estado.Asignado;
        this.estudiante = estudiante;
    }

    public Fecha getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Fecha fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Fecha getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Fecha fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public TipoAyuda getTipo() {
        return tipo;
    }

    public void setTipo(TipoAyuda tipo) {
        this.tipo = tipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    
    
    public void entregar (Fecha fechaEntrega){
        this.estado = Estado.Entregado;
        this.fechaEntrega = fechaEntrega;
    }
    
    public void rechazar (Fecha fechaEntrega){
        this.estado = Estado.Rechazado;
        this.fechaEntrega = fechaEntrega;
        
    }
}

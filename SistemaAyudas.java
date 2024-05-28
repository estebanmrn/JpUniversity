import java.util.List;
import java.util.ArrayList;
public class SistemaAyudas
{
    private List<Ayuda> ayudas;
    
    
    public SistemaAyudas (){
        this.ayudas = new ArrayList<>();
    }
    
    public void asignarAyudas(TipoAyuda tipo, Estudiante estudiante, Fecha fechaAsignacion){
        Ayuda ayuda = new Ayuda (tipo, estudiante, fechaAsignacion);
        ayudas.add(ayuda);
    }
    
    public void entregarAyuda(Ayuda ayuda, Fecha fechaEntrega){
        ayuda.entregar(fechaEntrega);
    }
    
    public void rechazarAyuda(Ayuda ayuda, Fecha fechaEntrega){
        ayuda.rechazar(fechaEntrega);
    }
    
    
    public void imprimirResumen (){
        int cantidadEntregadas = 0;
        
        List<Estudiante> estudiantesBeneficiados = new ArrayList <>();
        
        for (Ayuda ayuda : ayudas){
            if(ayuda.getEstado().equals(Estado.Entregado)){
                cantidadEntregadas++;
                if (!estudiantesBeneficiados.contains(ayuda.getEstudiante())){
                    estudiantesBeneficiados.add(ayuda.getEstudiante());
                }
            }
        }
        
        System.out.println ("Total de ayudas entregadas: " + cantidadEntregadas);
        System.out.println ("Número de estudiantes beneficiados: " + estudiantesBeneficiados.size());
        
    }
    
    
}

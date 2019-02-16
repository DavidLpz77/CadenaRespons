package cadenaresponsabilidad;
public class Aprobado extends Manejador
{
    public Aprobado() {
    }
    @Override
     public void comprobar(String estado)
    {
       if( (estado != null) && (estado.equalsIgnoreCase("APROBADO") == true) )
       {
           System.out.println("Solicitud Aprobada");
       }
       else
       {
             if( this.getSiguiente() != null )
            {
                 this.getSiguiente().comprobar( estado );
            }
       }
    }
}

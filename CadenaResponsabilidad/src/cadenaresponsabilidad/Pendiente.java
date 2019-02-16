package cadenaresponsabilidad;
public class Pendiente extends Manejador
{
    public Pendiente() {
    }
    @Override
     public void comprobar(String estado)
    {
       if( estado == null )
       {
           System.out.println("Solicitud Pendiente");
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
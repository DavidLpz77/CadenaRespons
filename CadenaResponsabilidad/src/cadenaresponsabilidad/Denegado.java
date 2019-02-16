package cadenaresponsabilidad;
public class Denegado extends Manejador
{
    public Denegado() {
    }
    @Override
     public void comprobar(String estado)
    {
       if( (estado != null) && (estado.equalsIgnoreCase("DENEGADO") == true) )
       {
           System.out.println("Solicitud Denegada");
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
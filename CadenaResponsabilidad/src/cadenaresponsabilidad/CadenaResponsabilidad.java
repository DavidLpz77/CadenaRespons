package cadenaresponsabilidad;
public class CadenaResponsabilidad
{
    public static void main(String[] args)
    {
        Manejador aprob = new Aprobado();
        Manejador deneg = new Denegado();
        Manejador pend = new Pendiente();
         aprob.setSiguiente( deneg );
         deneg.setSiguiente( pend );
         aprob.comprobar("APROBADO");
        aprob.comprobar("APROBADO");
        aprob.comprobar("DENEGADO");
        aprob.comprobar(null);
        aprob.comprobar("DENEGADO");
    }
}
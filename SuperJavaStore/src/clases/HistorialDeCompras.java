package clases;
public class HistorialDeCompras {
    int NumerodeOrden;
    String NombreCliente;
    int MembresiaCliente;

    public HistorialDeCompras(int NumerodeOrden, String NombreCliente, int MembresiaCliente ) {
        this.NumerodeOrden = NumerodeOrden;
        this.NombreCliente = NombreCliente;
        this.MembresiaCliente = MembresiaCliente;
    }
    
    
      public void correrHistorial (){
System.out.println( "El numero de orden " + NumerodeOrden + " fue adquirido por  " + NombreCliente + " con numero de membresía  " + MembresiaCliente );
}
}

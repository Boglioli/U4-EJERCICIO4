public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();
        ProcesadorPago tarjeta = new PagoTarjetaCredito();
        ProcesadorPago cripto = new PagoTarjetaCredito();
        ProcesadorPago billetera = new PagoTarjetaCredito();
        System.out.println("--- pago con tarjeta--- ");
        carrito.finalizarCompra(tarjeta, 15000);
        System.out.println("---------------------");
        System.out.println("--- pago con criptomonedas ---");
        carrito.finalizarCompra(cripto, 35000);
        System.out.println("---------------------");
        System.out.println("--- pago con billetera virtual ---");
        carrito.finalizarCompra(billetera, 10000);
    }
}

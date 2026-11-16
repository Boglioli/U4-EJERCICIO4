public class PagoTarjetaCredito implements ProcesadorPago {
    private double saldo = 50000;
    public boolean efectuarCobro(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("pago con tarjeta de credito realizado con exito");
            return true;
        } else {
            System.out.println("pago con tarjeta de credito fallido");
            return false;
        }
    }
}


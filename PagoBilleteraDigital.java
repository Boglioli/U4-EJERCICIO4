public class PagoBilleteraDigital implements ProcesadorPago {
    private double saldo = 20000;
    public boolean efectuarCobro(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("pago con billetera digital realizado con exito");
            return true;
        } else {
            System.out.println("pago con billetera digital fallido");
            return false;
        }
    }
}

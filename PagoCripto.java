public class PagoCripto implements ProcesadorPago {
    private double saldo = 30000;
    public boolean efectuarCobro(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("pago con criptomoneda realizado con exito");
            return true;
        } else {
            System.out.println("pago con criptomoneda fallido");
            return false;
        }
    }
}

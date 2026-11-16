public class CarritoCompras {
        public void finalizarCompra (ProcesadorPago pasarela,double total) {
            boolean resultado = pasarela.efectuarCobro(total);
            if (resultado) {
                System.out.println("compra finalizada con exito");
            } else {
                System.out.println("compra fallida");
            }
        }
    }
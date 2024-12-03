package cajafuerte;

public class Cajafuerte {

    public static void main(String[] args) {
        caja_fuerte caja= new caja_fuerte(800);
        caja.setretiro(500);
        System.out.println("MI SALDO ACTUAL ES: " + caja.getSaldoActual());
    }
    
}

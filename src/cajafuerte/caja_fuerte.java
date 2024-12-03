
package cajafuerte;

public class caja_fuerte {
    private double saldoActual= 0;
    
    public caja_fuerte(double saldoINICIO){
        
        if (saldoINICIO >  0){
            saldoActual = saldoINICIO;
            System.out.println("SALDO: " + saldoActual);
        }else{
            System.out.println("el saldo inicila no puede ser negativo" );
        }
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoINICIO){
        
        if (saldoINICIO >  0){
            saldoActual = saldoINICIO;
            System.out.println("SALDO: " + saldoActual);
        }else{
            System.out.println("el saldo inicila no puede ser negativo" );
        }
    }
    public void setretiro (double saldoINICIO){
        if (saldoINICIO > 0 ){
            saldoActual -= saldoINICIO;
            System.out.println("SALDO: " + saldoActual);
        }else{
            System.out.println("el saldo actual no puede ser negativo ");
        }
    }
    
}

package CuentaBancaria;

public class Cuenta {

    String titular;
    Float cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, Float cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public double ingresar(double cantidad){

        if(cantidad>0){
            cantidad=getCantidad()+cantidad;
            return cantidad;
        }
        System.out.println("No es posible ingresar en la cuenta una cantidad negativa o igual a 0");
        return cantidad;
    }

    public double retirar(double cantidad){

        if(cantidad<getCantidad()){

            cantidad=getCantidad()-cantidad;
            return cantidad;
        }

        System.out.println("Es imposible retirar esa cantidad de dinero porque es superior al sueldo que tiene en cuenta. Gracias!!");
        return cantidad;
    }

}

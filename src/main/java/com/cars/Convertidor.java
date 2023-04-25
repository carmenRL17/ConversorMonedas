package com.cars;

import java.util.HashMap;
import java.util.Map;

public class Convertidor {
   private double resultado,cantidad;
   private String divisaOrigen,divisaDestino;
 
    public double getResultado() {
    return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getDivisaOrigen() {
        return divisaOrigen;
    }

    public void setDivisaOrigen(String divisaOrigen) {
        this.divisaOrigen = divisaOrigen;
    }

    public String getDivisaDestino() {
        return divisaDestino;
    }

    public void setDivisaDestino(String divisaDestino) {
        this.divisaDestino = divisaDestino;
    }

    private final Map<String, Map<String,Double>> divisas;
    public Convertidor(){
        divisas=new HashMap<>();
        Map<String,Double> pesos= new HashMap<>();
        pesos.put("Pesos Mx",1.00);
        pesos.put("Dolar",0.055);
        pesos.put("Euros",0.050);
        pesos.put("Libras Esterlinas",.044);
        pesos.put("Yen Japones",7.45);
        pesos.put("Won sul-coreano",73.42);

        Map<String,Double> dolar = new HashMap<>();
        dolar.put("Pesos Mx",18.05);
        dolar.put("Dolar",1.00);
        dolar.put("Euros",0.91);
        dolar.put("Libras Esterlinas",0.80);
        dolar.put("Yen Japones",134.75);
        dolar.put("Won sul-coreano",1327.88);

        Map<String,Double> euros=new HashMap<>();
        euros.put("Pesos Mx",19.78);
        euros.put("Dolar",1.09);
        euros.put("Euros",1.00);
        euros.put("Libras Esterlinas",0.88);
        euros.put("Yen Japones",147.62);
        euros.put("Won sul-coreano",1454.27);

        Map<String,Double> libras = new HashMap<>();
        libras.put("Pesos Mx",22.44);
        libras.put("Dolar",1.24);
        libras.put("Euros",1.13);
        libras.put("Libras Esterlinas",1.00);
        libras.put("Yen Japones",167.62);
        libras.put("Won sul-coreano",1651.90);

        Map<String, Double> yen = new HashMap<>();
        yen.put("Pesos Mx",0.13);
        yen.put("Dolar",0.0074);
        yen.put("Euros",0.0067);
        yen.put("Libras Esterlinas",0.0059);
        yen.put("Yen Japones",1.00);
        yen.put("Won sul-coreano",9.87);

        Map<String, Double> won = new HashMap<>();
        won.put("Pesos Mx",0.013);
        won.put("Dolar",0.0007);
        won.put("Euros",0.00068);
        won.put("Libras Esterlinas",0.00060);
        won.put("Yen Japones",0.10);
        won.put("Won sul-coreano",1.00);
        
        //agregando los mapas con valores a Divisas
        divisas.put("Pesos Mx", pesos);
        divisas.put("Dolar", dolar);
        divisas.put("Euros", euros);
        divisas.put("Libras Esterlinas", libras);
        divisas.put("Yen Japones", yen);
        divisas.put("Won sul-coreano",won);


    }

    public Double convertir(){
         
        //obtener divisa de origen.
        //extraer el valor de la divisaDestino.
        double valorMonedaFinal = divisas.get(divisaOrigen).get(divisaDestino);
     
        //realizar operacion para convertir una cantidad 
        this.resultado = this.cantidad * valorMonedaFinal;
        return resultado;

        
    }
    public Double convertir(double cantidad, String divisaOrigen,String divisaDestino){
        double valorMonedaFinal = divisas.get(divisaOrigen).get(divisaDestino);
     
        //realizar operacion para convertir una cantidad 
        return  cantidad * valorMonedaFinal;
    }


}

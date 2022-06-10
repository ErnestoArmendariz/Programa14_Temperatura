/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa14_temperatura;

/**
 *
 * @author ernes
 */
public class Temperatura {
    
    private java.text.DecimalFormat formato = new java.text.DecimalFormat("0.00");
    private double gradosinicial;
    private String CelsiusToFarenheit;
    private String FarenheitToCelsius;

    public Temperatura() {
    }

    public Temperatura(double gradosinicial) {
        this.gradosinicial = gradosinicial;
    }

    public String getCelsiusToFarenheit() {
        Double r = (1.8)*gradosinicial+32;
        String valorR= formato.format(r);
        CelsiusToFarenheit = valorR;
        return CelsiusToFarenheit;
    }

    public void setCelsiusToFarenheit(String CelsiusToFarenheit) {
        this.CelsiusToFarenheit = CelsiusToFarenheit;
    }

    public String getFarenheitToCelsius() {
        Double r2 = (gradosinicial-32)/1.8;
        String mr2 = formato.format(r2);
        FarenheitToCelsius = mr2;
        return FarenheitToCelsius;
    }

    public void setFarenheitToCelsius(String FarenheitToCelsius) {
        this.FarenheitToCelsius = FarenheitToCelsius;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesportada.converterqtjambi;

import java.util.HashMap;

/**
 *
 * @author rnarvaiza
 */
public class Utils {

    /**
     * @return the toCurrency
     */
    public String getToCurrency() {
        return toCurrency;
    }

    /**
     * @param toCurrency the toCurrency to set
     */
    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }
    

    /**
     * @return the fromCurrency
     */
    public String getFromCurrency() {
        return fromCurrency;
    }

    /**
     * @param currency the fromCurrency to set
     */
    public void setFromCurrency(String currency) {
        this.fromCurrency = currency;
    }
    
        /**
     * @return the incommingQuantity
     */
    public String getIncommingQuantity() {
        return incommingQuantity;
    }

    /**
     * @param incommingQuantity the incommingQuantity to set
     */
    public void setIncommingQuantity(String incommingQuantity) {
        this.incommingQuantity = incommingQuantity;
    }
    
    private String fromCurrency;
    private String toCurrency;
    private String incommingQuantity;
    

    /**
     * Method designed to work with a pair of key / value which will be matched
     * with the selected currencies on MainWindow.
     * All the parsings are treated inside to avoid unintelligible chains of callings and parsings.
     * @return the conversion of the desired amount and currency on a String.
     */

    public String convertedQuantity(){
   
        HashMap<String, Double> map = new HashMap<>();
        map.put("Euro", Constants.EURO);
        map.put("Libra", Constants.LIBRA);
        map.put("Franco", Constants.FRANCO);
        map.put("Dolar", Constants.DOLAR);
        Double amount = (map.get(getToCurrency())/map.get(getFromCurrency()))*Double.parseDouble(getIncommingQuantity());
        
        return  Double.toString(amount);
    }

    
}

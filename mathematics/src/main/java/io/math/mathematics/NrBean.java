package io.math.mathematics;

import java.util.ArrayList;


public class NrBean {
   
   private ArrayList<Double> dblArr;
    public ArrayList<Double> getDblArr() {
        return dblArr;
    }

    public NrBean(ArrayList<Double> dblArr) {
        this.dblArr = dblArr;
    }

    
   public Double sum(){
    Double sum = 0.0;

    try {
        for (Double d: dblArr){
            sum+=d;}
    } catch (Exception e) {
       sum = -9999999.99;
    }
  

    
    return sum;

   } 

   public Double diff(){
       Double diff;
       try {
        diff= dblArr.get(0) - dblArr.get(1);
       } catch (Exception e) {
           diff = -9999999.99;
           
       }
   return diff;

   } 


   public Double mult(){
       Double mul = 1.0;

       for (Double d: dblArr){
           mul = mul*d;
       }
    return mul;
   }
}

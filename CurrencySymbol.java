import java.io.*;
import java.util.*;
import java.text.NumberFormat;
import java.util.Currency;
public class CurrencySymbol {

    public static void main(String[] args) {
        Console cn = System.console();
        Double payment = Double.parseDouble(cn.readLine());
        if (payment < 0 ){
            System.out.println("Value should be Greater then 0");
            System.exit(0);
        }
         NumberFormat france = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        System.out.println("US: "+us.format(payment));
        System.out.println("India: "+india.format(payment));
        System.out.println("China: "+china.format(payment));
        System.out.println("France: "+france.format(payment));  
		  
   
    }
}






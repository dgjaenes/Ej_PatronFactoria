package es.cordiweb.testapp;

/**
 * Created by DAVID on 07/11/2017.
 */

public class BreadFactory {

    public static Bread getBread(String breadtype){
     if (breadtype == "BAG"){
         return  new Baguette();
     }   else if (breadtype == "ROL") {
         return new Roll();
     }else if (breadtype == "SLI"){
         return new Slice();
     }
     return null;
    }

}


package LatihanOverridingMethod;

public class kucing extends hewan {
    @Override
    void setName(){
        String kucing = "Cerberus";
        System.out.println("Nama Kucing: "+kucing);
        
    }
    @Override
    void setSuara(){
        String suara = "Miaw Meow Meong";
        System.out.println("Suara kucing: "+suara);
    }
    @Override
    void setBerat(){
        double berat = 2.0;
        System.out.println("Berat kucing: "+berat+" kg");
    }
    
}

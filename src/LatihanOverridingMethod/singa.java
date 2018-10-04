
package LatihanOverridingMethod;

class singa extends hewan {

   void setNama() {
       String singa = "Diablo";
       System.out.println("Nama singa: "+singa);
   }
   @Override
   void setSuara() {
       String suara = "Rooarr";
       System.out.println("Suara singa: "+suara);
   }
   @Override
   void setBerat() {
       double berat = 10.0;
       System.out.println("berat singa: "+berat+" Kg");
   
    }
    
}
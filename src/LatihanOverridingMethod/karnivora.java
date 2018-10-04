
package LatihanOverridingMethod;

public class karnivora {
    public static void main(String[] args) {
        // Cara penulisan Objek: (superclass) variabel = new(subclass)
        System.out.println("====Hewan Default====");
        hewan h = new hewan();
        h.setName();
        h.setSuara();
        h.setBerat();
        
        System.out.println("====Hewan Kucing====");
        hewan k = new kucing();
        k.setName();
        k.setSuara();
        k.setBerat();
        
        System.out.println("====Hewan Singa====");
        hewan s = new singa();
        s.setName();
        s.setSuara();
        s.setBerat();
    }
    
}

package manusia;

public class LakiLaki extends manusia {
    public LakiLaki (double TB)
    {
        super (TB);
    }
    //method HtgBBI () merupakan method overidding dari superclass nya
    public double HtgBBI()
    {
        return (super.getTB()-100)*0.9;
  
    }
    
}

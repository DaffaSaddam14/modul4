
package manusia;

public class perempuan extends manusia {

    public perempuan(double TB) {
        super(TB);
    }
    //Method HtgBBI merupakan method overidding dari superclass nya
    public final double HtgBBI()
    {
        return (super.getTB()-100)*0.8;
  
    }
    
}


package manusia;

public abstract class manusia {
    private double TinggiBadan;
    //constructor
    public manusia (double TB)
    {
        TinggiBadan=TB;
    }
    //getter
    public double getTB()
    {
        return TinggiBadan;
    }
    //method HtgBBI
    public abstract double HtgBBI();
    
    }
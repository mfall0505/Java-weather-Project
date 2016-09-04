/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;

/**
 *
 * @author mamadou
 */
public class weatherdata {
    private String condition;
    private int temperature;
    private String date;
    public weatherdata( String Cond, int Temp, String D)
    {  condition=Cond;
       temperature=Temp;
       date=D;
    }
    public String toString()
    { return condition+"\t"+temperature+"\t"+date;
    }
    public void setCond(String T)
    {
    condition=T;}
    public String getCondition()
    { return condition;
    }
    public int getTemp()
    {return temperature;}
    public String getDate()
    {return date;}
}

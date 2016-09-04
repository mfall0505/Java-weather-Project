/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;

/**
 *
 * @author mamadou
 */
public class weatherList {
    private int tempCount,ave;
    private int capacity;
    private weatherdata[]dataList;
    
    public weatherList()
    {tempCount=0;
     capacity=12;
     dataList=new weatherdata[capacity];
         }
    public void addWeather(String C, int t, String d)
    {
        weatherdata weather= new weatherdata(C,t,d);
        dataList[tempCount]=weather;
                tempCount++;
    }
    public String toString()
    {
        String elements="\nDisplay\n";
        elements=elements+ "\nConditions\t\tTemperature\tDate\n";
        for (int i = 0; i < tempCount; i++)
    {
      elements = elements + dataList[i].toString() + "\n";
    }
        elements= elements+"\n";
        return elements;
    
    }
    public void selectionSort( )
      {
        
     
      int j = 0;
      for (int i = 0; i < tempCount-1 - 1; i++)
      { 
         int Pos=i;
         String minPos = dataList[i].getCondition();
         for (j = i ; j < tempCount; j++)
         {//int Pos=i;
            String Temp1=dataList[j].getCondition();
            if (dataList[j].getCondition().compareTo(dataList[i].getCondition())<0)
            {
               //minPos = B[j].getCondition();
               Pos=j;}
         }
         if (i != Pos && Pos < dataList.length)
         {
            weatherdata s =dataList[Pos];                    
               dataList[Pos]=dataList[i];
               dataList[i]=s;   
         }
      
      }   
      
      }
    public void insertSort()
    {int in; int out;
    for(out=1; out<tempCount; out++)
    { weatherdata temp=dataList[out];
        in=out;
      while(in>0 &&        // until smaller one found,
        dataList[in-1].getCondition().compareTo(temp.getCondition())>0)
      {dataList[in] = dataList[in-1];     // shift item to the right
         --in;          // go left one position
      }
      dataList[in]=temp;
    }
    
    }
    
      
   /* public double aveTemp()
    {   weatherdata []B=dataList;
        int Average=0; int count=0;
        
    for (int i=0; i<B.length-1-1;i++){
        System.out.println(B[i].getTemp());
        count+=i;
                   }
  //  System.out.print(ave);
            
    
    return ave/2;
    }*/
}

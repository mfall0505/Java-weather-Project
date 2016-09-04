/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author mamadou
 */
public class Weather {
   /*  public static void selectionSorted(weatherdata[]B)
      {
         
         String c=""; String D="";int t=0;
         //weatherdata s=; 
         //new weatherdata(c,t,D);
         
         for (int i = 0; i < B.length - 1; i++)
         { int Pos=i;
            String minPos = B[i].getCondition();
            for (int j = i + 1; j < B.length; j++)
            {//int Pos=i;
                String Temp1=B[j].getCondition();
               if (Temp1.compareTo(minPos)<0)
               { minPos = B[j].getCondition();
               Pos=j;}
            }
            if (i != Pos && Pos < B.length)
            {
              weatherdata s = B[Pos];                    
               B[Pos]=B[i];
               B[i]=s;  
            }
    
             }     
      
      } */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException {
        
        // TODO code application logic here
        Scanner Scan= new Scanner(System.in);
        //Weather List Object
        //weatherList[]w1=new weatherList[20];
        //weatherdata[]w2=new weatherdata[20];
        //weatherList[]w3=new weatherList[20];
        weatherList elemWeather=new weatherList();
        weatherList mWeather=new weatherList();

        int tabQuantity=0;
        FileReader fileRead = new FileReader("filename.txt");
         Scanner fileInput=new Scanner(fileRead);
         while (fileInput.hasNextLine())
         {String c=fileInput.next();
         int t= fileInput.nextInt();
         String d=fileInput.next();
         mWeather.addWeather(c, t, d);
         }
        System.out.print(mWeather);
        mWeather.insertSort();
        System.out.print(mWeather);
        mWeather.selectionSort();
        System.out.print(mWeather);
     /*   String keepEnteringObject = "y";
    do
    {
      System.out.print("Enter Condition ");
      String CondWeather = Scan.next();

      System.out.print("Enter the Temperature ");
      int temp = Scan.nextInt();

      System.out.print("Enter the date: ");
      String dateWeather = Scan.next();
      elemWeather.addWeather(CondWeather, temp, dateWeather);
     // weatherdata adding=new weatherdata(CondWeather,temp,dateWeather);
      //w1[tabQuantity]=elemWeather;
     // w2[tabQuantity]=adding;
      //tabQuantity++;
      System.out.print("Continue shopping (y/n)? ");

      keepEnteringObject = Scan.next();
    
      
    }while (keepEnteringObject.equals("y"));*/
    
    //System.out.print(elemWeather);
   //for(int i=0; i<tabQuantity;i++){
        //double result= w1[tabQuantity].aveTemp(w2);
        // System.out.println(result);
        
    // elemWeather.selectionSort();
    // elemWeather.insertSort();
      
        //   for(int i=0; i<tabQuantity;i++)
     // {
         elemWeather.toString();
//         elemWeather.aveTemp();
    //System.out.print(g);
        // w2[i].toString();
     //    }
               
        // w3.toString();
       // w2.toString();
    
   }  
     
}

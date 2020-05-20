package ikinciderecedenklem;

import java.util.Scanner;

public class denklem {

	public static void main(String[] args) {
		
		
		
		Scanner giris = new Scanner(System.in);
        System.out.println("Elinizdeki denklemin [a], [b] ve [c] deðerlerini giriniz.");
        System.out.println("Denklemdeki [a] deðeri:");
        int a= giris.nextInt();
        System.out.println("Denklemdeki [b] deðeri:");
        int b= giris.nextInt();
        System.out.println("Denklemdeki [c] deðeri:");
        int c= giris.nextInt();
        double del= Delta(a,b,c);
        System.out.println("Denkelmin deltasý="+Delta(a,b,c));
        if(Kontrol(Delta(a,b,c))==true){
            System.out.println("Denklemin reel kökü yoktur.");
        }else{
            System.out.println("Denklemin reel kökü vardýr.");
        }
        if(Delta(a,b,c)>0){
            
            double kok1= ((-1 * b) - Math.sqrt(del)) / (2 * a);
            double kok2= ((-1 * b) + Math.sqrt(del)) / (2 * a); 
            System.out.println("Denkleminizin kökleri= ["+kok1+"], ["+kok2+"].");
        }
        if(Delta(a,b,c)==0){
            double kok= (-1 * b) / (2 * a);
            System.out.println("Denkleminizin kökleri= ["+kok+"], ["+kok+"].");
        }

    }
    
    
    /*public static double Kokler(int x, int y){
        
        
        
    }*/
    
    public static boolean Kontrol(double d){
       if(d<0){
           return true;
       }
       
       
       return false;
   } 
    
    
    public static double Delta(int x, int y, int z){
           double delta;
           
           delta= (y*y)-(4*x*z);
          return delta;  
        }

}

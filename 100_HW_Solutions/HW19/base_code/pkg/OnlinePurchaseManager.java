package pkg;
import java.util.ArrayList;
import pkg.*;
public class OnlinePurchaseManager
{
   public OnlinePurchaseManager(ArrayList<Gizmo> OnlinePurchaseManager){
      this.OnlinePurchaseManager = OnlinePurchaseManager
   }
   public static void add(Gizmo gz, OnlinePurchaseManager op){
      op.add(gz);
   }
   private ArrayList<Gizmo> purchases;

   public int countElectronicsByMaker(String mkr){
   	int x = 0;
   	for(Gizmo gz : purchases){
   	   if(gz.getMaker().equals(mkr) && gz.isElectronic()){
   	      x++;
   	   }
   	}
      return x;	
   }
   public String getCheapestGizmoByMaker(){
     //implementation not shown 
   }
   public boolean hasAdjacentEqualPair(){
      Gizmo gz = purchases.get(0);
      for(int i = 0; i < purchases.size(); i++){
         Gizmo et = purchases.get(i);
         if(gz.equals(et)){
            return true;
         }
         gz = et;
      }
   }
   public String toString(){
   	return "" + purchases;
   }
}

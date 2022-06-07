package pkg;

public class Gizmo
{ 
   private String maker;
   private boolean isE;
   private double cost;
   public Gizmo(String maker, boolean isE, int cost){
      this.maker = maker;
      this.isE = isE;
      this.cost = cost;
   }
   
   public String getMaker(){
      return maker;
   }
   public boolean isElectronic(){
      return isE;
   }
   public double getCost(){
      return cost;
   }
   public void setMaker(String maker){
      this.maker=maker;
   }
   public void setIsE(boolean isE){
      this.isE=isE;
   }
   public void setCost(double cost){
      this.cost=cost;
   }
   public String toString()
   {
   	return "" + maker + " " + isE + " " + cost;
   }
}

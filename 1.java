abstract class CShape               
{
   private String name;
   private double rate;
   public void Cake(String name, double rate) {
       this.name = name;
       this.rate = rate;
       
   }
   public abstract double calcPrice();
   public String toString() {
       return name + "\t" + rate;
   }
   public String getName() {
        return name;
   }
   public double getRate() {
       return rate;
   }
}

class CRectangle extends CShape    // 子類別 矩形 CRectangle
{
   double weight;
   protected int width,height;
   public CRectangle(String name, double rate, double weight)     //建構元
   {
      name = this.getName();
      rate = this.getRate();
      weight = weight;
   }
   public double calcPrice() {
         return weight * this.getRate();     
   }
}
class CCircle extends CShape     // 子類別 圓形CCircle
{   
   int quantity;
   double rate;
   String name;
   public CCircle(String name, double rate, int quantity)   //建構元
   {
      name = this.getName();
      rate = this.getRate();
      quantity = quantity; 
   }
   public double calcPrice() {
         return (double)(quantity * this.rate);     
   }
   public int getqu() {
       return quantity;
   }
}
public class abstract_02
{
   public static void main(String args[])
   {
      CShape shape1[] = new CShape[5];
      double max=0;
      double t;
      for(int i = 0; i < 5; i++ ) {
          if(Math.random()>0.5){
              shape1[i]=new CRectangle("Order",Math.random()*i+1,Math.random()*10+1);
              System.out.println("Order cake總價格: " + shape1[i].calcPrice());
          }
          else{
          shape1[i]=new CCircle("Ready",Math.random()*i+1,(int)Math.random()*10+1);
          System.out.println("Ready cake總價格: " + shape1[i].calcPrice());
         // System.out.println("數量: " + shape1[i].quantity);
        }
        max = Math.max(max,shape1[i].calcPrice());
      }
    System.out.println("最高價: " + max );
   }
}
public class Prod {
    private int id;
    private String name;
    private double price;
    private int quantity;
    static int counter=0;
    private Date manufacture;
    Prod(String name,double price,int quantity,Date manufacture){
        this.id=counter++;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.manufacture=manufacture;
 }
 public int getId() {
    return id;
}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public Date getManufacture(){
        return manufacture;
   }

    public void setManufacture( Date manufacture){
        this.manufacture=manufacture;
    }

    public String toString(){
      String formatStr=String.format("%d\t%s\t%f\t%d\t%s",id,name,price,quantity,manufacture) ;
      return formatStr;
    
    
    }

    public prod isLatest(Prod p1,Prod p2){
    Date temp=Manufacture.latest(p1.Manufacture,p2.Manufacture){
        if temp==p1.Manufacture{
          return p1;
        }else{
            return p2;
        }
    }

    }

}


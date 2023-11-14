public class Invoice{
    private int id;
    private Customer obj;
    private double amount;
    public Invoice(int id,Customer obj, double amount){
        this.id=id;
        this.obj=obj;
        this.amount=amount;
    }
    public int getID(){
        return this.id;

    }
    public Customer getCustomer(){
        return obj;
    }
    public void setCustomer(Customer obj){
        this.obj=obj;
    }
    public int getCustomerID(){
        return this.obj.getID();
    }
    public String getCustomerName(){
        return this.obj.getName();
    }
    public int getCustomerDiscount(){
        return this.obj.getDiscount();

}
// public double getAmountAfterDiscount(){
//     reyur
// }
}
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    public Book(String name, Author[] authors, double price){
        this.name=name;
        this.authors=authors;
        this.price=price;

    }
    public Book(String name, Author[] authors, double price, int qty){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }
    public String  getName(){
        return this.name;

    }
    public Author[] getAuthors(){
        return this.authors;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public String toString(){
        return this.name+authors[0].getName()+" "+String.valueOf(qty);
    }
    public String getAuthorNames(){
        String result="";
        for(int i=0;i<this.authors.length;i++){
            result+=this.authors[0].getName()+" ";
        }
        return result;

    }
}

public class Tester{

    public static void main(String[] args){
            Author abe=new Author("apple","r1",'c');
            Author[] apple=new Author[1];
            apple[0]=abe;
            Book bob=new Book("apple" , apple,12.0);
            System.out.println(bob.getAuthorNames());
        }
        
}
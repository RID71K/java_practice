public class Author{
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;

    }
    public Author(){
        this.name="apple";
        this.email="Something";
        this.gender='s';
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public char getGender(){
        return this.gender;
    }
    public String toString(){
        return "Author "+this.name+" "+this.email+" "+this.gender;
    }
}

public class User {
    private String username;
    private String password;
    
    public User(){
        
    }
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public boolean checkCredentials(String username, String password){
        return this.username.equals(username) && this.password.equals(password);
    }
}

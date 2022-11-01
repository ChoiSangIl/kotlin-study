public class UserRepo {
    public User getUser(){
        return new User((int)(Math.random()*100));
    }
}

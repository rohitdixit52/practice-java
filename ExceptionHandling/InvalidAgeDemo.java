package ExceptionHandling;
class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
public class InvalidAgeDemo {
    static void checkage(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Age is not valid for voting");
        }else{
            System.out.println("You can vote");
        }
    }
    public static void main(String[] args) {
        try{
            checkage(10);
        }catch(InvalidAgeException e){
             System.out.println("Error" + "  " + e.getMessage());
        }
    }
}

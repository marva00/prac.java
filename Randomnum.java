import java.util.Random;
public class Randomnum {
    public static void main(String[] args) {
        Random random=new Random();
        int num=random.nextInt(200);
        System.out.println("random num is"+ " "+ num);
    }
    
}

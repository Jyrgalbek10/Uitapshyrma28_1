import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      Integer[] integers = {1,2,3,4,5,6,7,8,9};
       Arrays.stream(integers).filter(integer -> integer % 2==0).forEach(x-> System.out.println(Math.sqrt(x)));
            }
        }







// For the given array = ['a','b','d','e','f','g','h','i','x','z'] 
//		 use binary search to find the target element = 'z'.
package Feb_23;
import java.util.Arrays;

public class CharArray {
  public static void main(String[] args) {
    char charArray[] = {'a','b','d','e','f','g','h','i','x','z' };
    char target = 'c';
    System.out.println(Arrays.binarySearch(charArray, target));
    }
}

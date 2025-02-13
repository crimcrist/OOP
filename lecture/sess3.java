package lecture;
import java.util.*;

class sess3 {
    ArrayList <String> arr = new ArrayList<String>();

    public sess3 (){
        arr.add("hello");

        String word = arr.get(0);
        for (int i = 0; i < word.length();i++){
            System.out.println(word.charAt(i));
        }
    }
    public static void main(String[] args) {
        new sess3();
    }
}

// blallbalb
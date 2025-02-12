import java.util.ArrayList;
import java.util.HashMap;

class Mahasiswa { // Struct Mahasiswa
    String nama;
};

public  class Test {
    Integer a = 999; // type data primitive yang digunakan untu mendeclare dan untung mengubah maka perlu menggunaka primititive data type
    Boolean z;
    Float i;
    Float y = 99f;
    int x;
    // int x = Integer.parseInt(s:"10"); // Gabisa karena ini di public class
    // double = Double.parseDouble(s: "10.5");
    // boolean x = boolean.parseBoolean(s:"False");

    String name = "Budi";
    String nama = "PRO_123494280";
    String hai = "Hello World";

    int number[][] =  new int[10][9]; // untuk mendeclare integer array
    Test [][] m = new Test [4][8]; 

    Integer [][] multiArr2 = {
        {1,2,3} , {3 ,4, 5} ,  {5, 6, 7}
    };

    ArrayList <Integer> arr = new ArrayList <Integer>(); // Mendeclare suatu array yang dapat dimasukkan

    public Test (){
        x = Integer.parseInt("103");
        y.toString(); // mengubah integer ke strinmg
        y.longValue(); // mencari integer terpanjang
        number[0][0] = 9; // declare suatu array index ke 0 0
        number[2][5] = 123;
    
        System.out.println(y.MAX_VALUE);
        System.out.println(x);
        System.out.println(name.equals("budi"));
        System.out.println(name.compareTo("Badi"));// jadi ini akan mencompare mengurangi name pertama dan name kedua
        // B - b = 66 - 98
        System.out.println(name == "Budi");
        System.out.println (nama.substring(4)); // untuk range mau mulai dari mana 
        System.out.println (nama.substring(4, 7)); // untuk mencari sampai mana
        System.out.println (hai.indexOf("World")); // mencari ketemu wolrd di index keberapa

        System.out.println(number[0][0]);

        arr.add(7); // menambahkan array
        arr.add(10); // menambahkan array  
        arr.add(11); // menambahkan array
        arr.add(340); // menambahkan array

        System.out.println(arr.get(3));
        for (int n : arr){
            System.out.println((n) + " size : " + arr.size()); // untuk menmgeprint semuanya sekaligus hingga habis
            // arr.size untuk mengetahui jumlah arr yang terdapat
        }

        HashMap <String, Integer> z = new HashMap <String , Integer>(); // unruk mencari integer ketika diketahui string
        z.put ("sfx", 99);
        z.put ("bgm", 10);
        System.out.println(z.get ("sfx"));

        HashMap <Mahasiswa, Float> kuliah = new HashMap <Mahasiswa, Float>();
        Mahasiswa kuliah1 = new Mahasiswa(); // buat class baru
        Mahasiswa kuliah2 = new Mahasiswa(); // buat class baru

        kuliah.put(kuliah1, 77f);
        kuliah.put(kuliah2, 10f);

        System.out.println(kuliah.get(77f));

        for (int i = 0; i < multiArr2.length; i++){
            for (int j = 0; j < multiArr2.length; j++){
                System.out.println(multiArr2[i][j]);
            }
        }

    }
    public static void main(String[] args) {
        new Test();
    }
}

// public class Main {
//     public static void main (String [] args){
//         System.out.println("Hello World");
//     }
// }
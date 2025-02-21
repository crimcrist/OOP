/* 
## Association 
## Agregasi
## Komposisi


public Name {
    public String firstName;
    public String MiddleName;
    Public String lastName;
    }

public class student
{
    Name name; // Name cuma bisa dibuat ketika studentnya dibuat
    Address address;

    public student (){
        name = new Name();
    }

    public void visit (PublicPlace p){
    }
}

public Main(){
    Name n = new Name ("Louis"); // Association karena nama bisa dibuat tanpa student
    Student s1 = new Student(); // Komposisi karena student tidak bisa dibuat tanpa name
    Address adr = new Address("Bogor"); 
    s1.address = adr; // Agregasi karena address bisa dibuat tanpa student

    PublicPlace p = new PublicPlace ("Kebun Raya Bogor"); // Association karena student bisa mengunjungi public place
    s1.visit(p);
}
    Komposisi adalah objeknya bergantung dengan objek lainnya
    Agregasi adalah objeknya tidak bergantung dengan objek lainnya

## 

 */

 
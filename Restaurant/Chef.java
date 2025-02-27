public class Chef {
    private String nama;
    private String biography;

    // Setter 
    public Chef (String nama, String biography){
        this.nama = nama;
        this.biography = biography;
    }    

    // Getter
    public String getNama(){
        return nama;
    }

    public String getBiography(){
        return biography;
    }
}

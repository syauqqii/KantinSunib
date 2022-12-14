import java.text.DecimalFormat;

class Makanan{
    // DecimalFormat df = new DecimalFormat("#.000");
    
    private String namaMakanan;
    private String kodeMakanan;
    private double hargaMakanan;
    
    public Makanan(String namaMakanan, String kodeMakanan, double hargaMakanan){
        this.namaMakanan  = namaMakanan;
        this.kodeMakanan  = kodeMakanan;
        this.hargaMakanan = hargaMakanan;
    }
    
    public String getNamaMakanan(){
        return namaMakanan;
    }
    
    public String getKodeMakanan(){
        return kodeMakanan;
    }
}

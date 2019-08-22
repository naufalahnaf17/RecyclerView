package app.android.recyclerviewdancardview;

public class Musik {

    String nama;
    String penyanyi;
    String urutan;
    int gambar;

    public Musik(String nama, String penyanyi, String urutan, int gambar) {
        this.nama = nama;
        this.penyanyi = penyanyi;
        this.urutan = urutan;
        this.gambar = gambar;
    }

    public Musik(){}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public String getUrutan() {
        return urutan;
    }

    public void setUrutan(String urutan) {
        this.urutan = urutan;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
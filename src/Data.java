public class Data {
    private String nama;
    private String ttl;
    private String alamat;
    private String jenisKelamin;
    private String agama;
    private String penyakit;
    private String obat;

    public Data(String nama, String ttl, String alamat, String jenisKelamin, String agama, String penyakit, String obat) {
        this.nama = nama;
        this.ttl = ttl;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
        this.penyakit = penyakit;
        this.obat = obat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public String getObat() {
        return obat;
    }

    public void setObat(String obat) {
        this.obat = obat;
    }

    @Override
    public String toString() {
        return "\nData Pasien\n" +
                "Nama \t\t\t\t : " + nama + '\n' +
                "Tempat Tanggal Lahir : " + ttl + '\n' +
                "Alamat \t\t\t\t : " + alamat + '\n' +
                "Jenis Kelamin \t\t : " + jenisKelamin + '\n' +
                "Agama \t\t\t\t : " + agama + '\n' +
                "Penyakit \t\t\t : " + penyakit + '\n' +
                "Obat \t\t\t\t : " + obat + '\n';
    }
}

package tokokomputer;
public class Komponen {
    private  Integer kode;
    private  String nama;
    private  String jenis;
    private  Integer harga;

    public Integer getKode() {
        return this.kode;
    }
    public String getNama() {
        return this.nama;
    }
    public String getJenis() {
        return this.jenis;
    }
    public Integer getHarga() {
        return this.harga;
    }

    public Komponen( Builder builder) {
        kode = builder.kode;
        nama = builder.nama;
        jenis = builder.jenis;
        harga = builder.harga;

    }
    
    public static class Builder {
        private Integer kode;
        private String nama;
        private String jenis;
        private Integer harga;

        

        public Builder setKode( Integer kode) {
            this.kode = kode;
            return this;
        }

        public Builder setNama( String nama) {
            this.nama = nama;
            return this;
        }
    
        public Builder setJenis( String jenis) {
            this.jenis = jenis;
            return this;
        }
    
        public Builder setHarga( Integer harga) {
            this.harga = harga;
            return this;
        }
        
        public Komponen build() {
            return new Komponen(this);
        }
    }
}
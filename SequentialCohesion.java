public class ContohKohesi {

    // 1. Sequential Cohesion (Kohesi Berurutan)
    // Output dari satu langkah digunakan sebagai input langkah berikutnya
    public void prosesNama(String nama) {
        String namaBersih = nama.trim();
        String namaHurufBesar = namaBersih.toUpperCase();
        System.out.println("Nama diproses: " + namaHurufBesar);
    }

    // 2. Logical Cohesion (Kohesi Logis)
    // Melakukan operasi berbeda tergantung kondisi
    public void aksi(String jenis) {
        if (jenis.equals("print")) {
            System.out.println("Mencetak data...");
        } else if (jenis.equals("save")) {
            System.out.println("Menyimpan data...");
        } else if (jenis.equals("hapus")) {
            System.out.println("Menghapus data...");
        }
    }

    // 3. Functional Cohesion (Kohesi Fungsional)
    // Melakukan satu tugas spesifik: menghitung luas persegi
    public int hitungLuas(int sisi) {
        return sisi * sisi;
    }

    // 4. Communicational Cohesion (Kohesi Komunikasi)
    // Semua baris menggunakan data dari objek yang sama
    public void tampilkanInfo(Mahasiswa mhs) {
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIM: " + mhs.getNim());
        System.out.println("Jurusan: " + mhs.getJurusan());
    }

    // 5. Sequential Cohesion (Kohesi Berurutan) lagi
    // Contoh tambahan agar lebih jelas alurnya (berurutan)
    public void prosesAngka(int angka) {
        int hasilKali = angka * 2;
        int hasilTambah = hasilKali + 5;
        System.out.println("Hasil akhir: " + hasilTambah);
    }

    // Kelas bantu untuk Communicational Cohesion (5)
    public static class Mahasiswa {
        private String nama;
        private String nim;
        private String jurusan;

        public Mahasiswa(String nama, String nim, String jurusan) {
            this.nama = nama;
            this.nim = nim;
            this.jurusan = jurusan;
        }

        public String getNama() { return nama; }
        public String getNim() { return nim; }
        public String getJurusan() { return jurusan; }
    }

    // Main method untuk uji coba semua kohesi
    public static void main(String[] args) {
        ContohKohesi ck = new ContohKohesi();

        System.out.println("== Sequential Cohesion ==");
        ck.prosesNama("  Fajar  ");
        ck.prosesAngka(10);

        System.out.println("\n== Logical Cohesion ==");
        ck.aksi("save");

        System.out.println("\n== Functional Cohesion ==");
        int luas = ck.hitungLuas(5);
        System.out.println("Luas: " + luas);

        System.out.println("\n== Communicational Cohesion ==");
        Mahasiswa mhs = new Mahasiswa("Budi", "12345", "Informatika");
        ck.tampilkanInfo(mhs);
    }
}

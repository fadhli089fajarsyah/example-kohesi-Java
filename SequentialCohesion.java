public class ContohKohesi {

    // 1. Functional Cohesion (Kohesi Fungsional)
    // Method hanya melakukan satu tugas utama: menghitung diskon
    public double hitungDiskon(double total) {
        return (total >= 500000) ? total * 0.1 : 0;
    }

    // 2. Logical Cohesion (Kohesi Logis)
    // Melakukan operasi berbeda berdasarkan kondisi input
    public void proses(String aksi, String data) {
        if (aksi.equals("cetak")) {
            System.out.println("Mencetak: " + data);
        } else if (aksi.equals("simpan")) {
            System.out.println("Menyimpan: " + data);
        } else if (aksi.equals("hapus")) {
            System.out.println("Menghapus: " + data);
        }
    }

    // 3. Communicational Cohesion (Kohesi Komunikasi)
    // Semua baris menggunakan data dari objek yang sama (User)
    public void tampilkanProfil(User user) {
        System.out.println("Nama: " + user.getNama());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Alamat: " + user.getAlamat());
    }

    // 4. Sequential Cohesion (Kohesi Berurutan)
    // Output dari satu langkah digunakan sebagai input langkah berikutnya
    public void prosesData(String input) {
        String hasil1 = bersihkanData(input);
        String hasil2 = validasiData(hasil1);
        simpanData(hasil2);
    }

    // 5. Coincidental Cohesion (Kohesi Kebetulan)
    // Baris-baris kode tidak berhubungan langsung
    public void campurAduk() {
        cetakLaporan();
        kirimNotifikasi();
        hitungDiskon(100000); // dari method di atas, tapi konteksnya tidak relevan
    }

    // ---------- Simulasi method pembantu ----------
    private String bersihkanData(String data) {
        return data.trim();
    }

    private String validasiData(String data) {
        return data.matches("[a-zA-Z ]+") ? data : "Data tidak valid";
    }

    private void simpanData(String data) {
        System.out.println("Data disimpan: " + data);
    }

    private void cetakLaporan() {
        System.out.println("Mencetak laporan...");
    }

    private void kirimNotifikasi() {
        System.out.println("Notifikasi dikirim.");
    }

    // ---------- Class bantu untuk Communicational Cohesion ----------
    public static class User {
        private String nama;
        private String email;
        private String alamat;

        public User(String nama, String email, String alamat) {
            this.nama = nama;
            this.email = email;
            this.alamat = alamat;
        }

        public String getNama() { return nama; }
        public String getEmail() { return email; }
        public String getAlamat() { return alamat; }
    }

    // ---------- Main untuk uji coba ----------
    public static void main(String[] args) {
        ContohKohesi ck = new ContohKohesi();

        // Functional Cohesion
        System.out.println("Diskon: " + ck.hitungDiskon(600000));

        // Logical Cohesion
        ck.proses("cetak", "Laporan Mingguan");

        // Communicational Cohesion
        User user = new User("Budi", "budi@mail.com", "Jakarta");
        ck.tampilkanProfil(user);

        // Sequential Cohesion
        ck.prosesData(" Data Baru ");

        // Coincidental Cohesion
        ck.campurAduk();
    }
}

// 1. Sequential Cohesion
const prosesAngka = (angka: number): number => {
  const hasilKali = angka * 2;
  const hasilTambah = hasilKali + 5;
  const hasilAkhir = hasilTambah / 3;
  return hasilAkhir;
};

// 2. Logical Cohesion
const operasiData = (
  data: string,
  jenisOperasi: "uppercase" | "lowercase" | "length"
): string | number => {
  if (jenisOperasi === "uppercase") return data.toUpperCase();
  if (jenisOperasi === "lowercase") return data.toLowerCase();
  if (jenisOperasi === "length") return data.length;
  return "";
};

// 3. Functional Cohesion
const hitungLuasLingkaran = (jariJari: number): number =>
  Math.PI * Math.pow(jariJari, 2);

// 4. Communicational Cohesion
type User = {
  nama: string;
  email: string;
  umur: number;
};

const tampilkanProfil = (user: User): void => {
  console.log("Nama:", user.nama);
  console.log("Email:", user.email);
  console.log("Umur:", user.umur);
};

// consol penggunaan:
console.log("Sequential:", prosesAngka(6));
console.log("Logical:", operasiData("data rahasisa", "uppercase"));
console.log("Functional:", hitungLuasLingkaran(7));
tampilkanProfil({ nama: "fajar", email: "fajar@example.com", umur: 22 });

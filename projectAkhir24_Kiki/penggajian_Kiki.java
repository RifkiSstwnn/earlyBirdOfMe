import java.util.Scanner;

public class penggajian_Kiki {
  static int zakat = 0, izinCuti, lembur, gajiBaru, dendaCuti, bpjs = 30000,
      Tunjangan,
      totalgajiBersih,
      lemburan, gajiSlip, gajibersih[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
      gaji[] = { 2500000, 2500000, 2500000, 2500000, 3500000, 3500000, 3500000, 3500000, 3700000, 5500000,
          7500000 };
  static Scanner sc = new Scanner(System.in);
  static char lanjutkan = 'y', teruskan = 'y', menikah = 'y', cuti = 'y', back = 'y', keMenu = 'y';
  static byte pilihMenu5, menu;
  static String username = "f", password = "ff", inputNama, namaBaru, inputJabatan, masukkanNama, searchName,
      merried = "menikah", namaSlip, jabatan, jabatanMu,
      biodata[][] = { { "Tetuko", "Bejo", "Pramusaji1", "jombang,13 juli 2000", "menikah" },
          { "Zarco", "Johan", "Pramusaji2", "jombang,14 juli 2000", "menikah" },
          { "Ananta", "Jauhari", "CleaningService1", "Mojokerto,15 junu 1999", "Belum menikah" },
          { "Raharjo", "Kasidi", "CleaningService2", "Kediri, 17 Juli 1998", "Belum menikah" },
          { "Mardiani", "Karmin", "Cheff1", "Tulungagung, 10 mei 1999,", "menikah" },
          { "Fajar", "Alifian", "Cheff2", "magetan 9 april 1990", "belum menikah" },
          { "Rifai", "Ahmad", "HeadCheff1", "Surabaya, 11 april 2000", "menikah" },
          { "Khan", "Amir", "HeadCheff2", "Salatiga, 8 Mei 1990", "Belum menikah" },
          { "Seger", "Bibit", "Admin", "Sidoarjo, 9 maret 1997", "menikah" },
          { "Giani", "tejo", "Manajer", "Malang, 7 april 1980", "Menikah" },
          { "Teko", "Sarto", "KepalaCabang", "Jambi, 1 mei 1987", "menikah" } };

  public static void main(String[] args) {
    char kembali = 'y';
    System.out.println("-------SELAMAT DATANG DI PROGGRAM PENGGAJIAN BRESTORAN-------");
    System.out.println("--------------------------------------------------------------");
    do {
      System.out.println("Masukkan Nama Panggilan / Nama lengkap anda : ");
      masukkanNama = sc.next();
      for (int i = 0; i < biodata.length; i++) {
        if (masukkanNama.equalsIgnoreCase(biodata[i][1])
            || masukkanNama.equalsIgnoreCase(biodata[i][1] + biodata[i][0])) {
          System.out.println("Apakah jabatan anda? ");
          System.out.println(
              "(1)Pramusaji(1/2)\n(2)CleaningService(1/2)\n(3)Cheff(1/2)\n(4)HeadCheff(1/2)\n(5)Admin\n(6)Manajer\n(7)KepalaCabang\nJawab : ");
          jabatan = sc.next();
          if (jabatan.equalsIgnoreCase(biodata[i][2])) {
            mainMenu();
          }
        }
      }
      System.out.println("Apakah anda ingin mengulang program kembali ? (Y/T)");
      kembali = sc.next().charAt(0);
    } while (kembali == 'Y' || kembali == 'y');
  }

  static void cetakLaporan() {
    System.out.println("\t\t\t\tLAPORAN RESTORAN");
    System.out.println("------------------------------------------------------------------------------");
    System.out.println("|  Nama Lengkap  | Nama Panggilan |            Jabatan            |    Gaji   |");
    for (int i = 0; i < biodata.length; i++) {
      for (int j = 0; j < biodata[0].length; j++) {
        if (j == 4) {
          if (biodata[i][j].equalsIgnoreCase(merried)) {
            Tunjangan = 190000;
          } else {
            Tunjangan = 0;
          }
        }
      }
      gajibersih[i] = gaji[i] + Tunjangan - bpjs;
      totalgajiBersih += gajibersih[i];
      if (i < 2) {
        System.out
            .println(biodata[i][1] + " " + biodata[i][0] + "\t\t" + biodata[i][1] + "\t\t" + biodata[i][2] + "\t\t\tRp."
                + gajibersih[i]);
      } else if (i == 2) {
        System.out
            .println(biodata[i][1] + " "
                + biodata[i][0] + "\t\t\t" + biodata[i][1] + "\t\t" + biodata[i][2] + "\t\tRp."
                + gajibersih[i]);
      } else if (i == 3) {
        System.out
            .println(biodata[i][1] + " "
                + biodata[i][0] + "\t\t" + biodata[i][1] + "\t\t" + biodata[i][2] + "\t\tRp."
                + gajibersih[i]);
      } else if (i >= 4 && i < 6) {
        System.out
            .println(biodata[i][1] + " "
                + biodata[i][0] + "\t\t" + biodata[i][1] + "\t\t" + biodata[i][2] + "\t\t\t\tRp."
                + gajibersih[i]);
      } else if (i >= 6 && i < 8) {
        System.out
            .println(biodata[i][1] + " "
                + biodata[i][0] + "\t\t" + biodata[i][1] + "\t\t" + biodata[i][2] + "\t\t\tRp."
                + gajibersih[i]);
      } else if (i == 8 && i == 9) {
        System.out
            .println(
                biodata[i][1] + " "
                    + biodata[i][0] + "\t\t" + biodata[i][1] + "\t\t" + biodata[i][2] + "\t\t\t\tRp."
                    + gajibersih[i]);
      } else {
        System.out
            .println(biodata[i][1] + " "
                + biodata[i][0] + "\t\t" + biodata[i][1] + "\t\t" + biodata[i][2] + "\t\t\tRp."
                + gajibersih[i]);
      }
    }
    System.out.println("------------------------------------------------------------------------------");
    System.out.println("total pengeluaran Bank untuk gaji bersih\t\t\t\tRp." + totalgajiBersih);
  }

  static void gajiTiapJabatan() {
    System.out.println("Gaji pokok Tiap Jabatan Restoran per-2022");
    System.out.println("----------------------------------------");
    System.out.println("Jabatan\t\t\t  |\t Gaji");
    System.out.println("----------------------------------------");
    for (int i = 0; i < biodata.length; i++) {
      if (i < 2) {
        System.out.println(biodata[i][2] + "\t\t\t  |\tRp." + gaji[i]);
      } else if (i >= 2 && i < 4) {
        System.out.println(biodata[i][2] + "\t  |\tRp." + gaji[i]);
      } else if (i >= 4 && i < 6) {
        System.out.println(biodata[i][2] + "\t\t  |\tRp." + gaji[i]);
      } else if (i >= 6 && i < 8) {
        System.out.println(biodata[i][2] + "|\tRp." + gaji[i]);
      } else if (i == 8) {
        System.out.println(biodata[i][2] + "\t\t\t  |\tRp." + gaji[i]);
      } else {
        System.out.println(biodata[i][2] + "\t\t  |\tRp." + gaji[i]);

      }
      System.out.println("----------------------------------------");
    }
  }

  static void hitungLemburan() {
    for (int i = 0; i < biodata.length; i++) {
      if (jabatan.equalsIgnoreCase(biodata[i][2])) {
        if (i <= 5) {
          lemburan = lembur * 50000;
        } else {
          lemburan = lembur * 75000;
        }
      }
    }
  }

  static void hitungCuti() {
    int nilaiDenda = 50000;
    if (cuti == 'y' && izinCuti <= 5) {
      dendaCuti = 0;
    } else if (cuti == 'y' && izinCuti > 5) {
      dendaCuti = (izinCuti - 5) * nilaiDenda;
    } else {
      dendaCuti = 0;
    }
  }

  static void jabatanTiapKaryawan() {
    System.out.println("\tJabatan Restoran per-2022");
    System.out.println("------------------------------------------------------");
    System.out.println("Nama Lengkap\t |\tJabatan");
    System.out.println("------------------------------------------------------");
    for (int i = 0; i < biodata.length; i++) {
      for (int j = 0; j < biodata[0].length; j++) {
        if (j == 0) {
          if (i < 2) {
            System.out.println(biodata[i][j] + "\t |\t" + biodata[i][2]);
          } else if (i == 2) {
            System.out.println(biodata[i][j] + "\t\t |\t" + biodata[i][2]);
          } else if (i >= 3 && i < 8) {
            System.out.println(biodata[i][j] + "\t |\t" + biodata[i][2]);
          } else if (i == 8) {
            System.out.println(biodata[i][j] + "\t|\t" + biodata[i][2]);
          } else {
            System.out.println(biodata[i][j] + "\t |\t" + biodata[i][2]);
          }
        }
      }
    }
  }

  static void sistemMenu2() {
    System.out.println("Berapakah Jam Lembur yang anda lakukan selama 1 bulan ini?");
    lembur = sc.nextInt();
    hitungLemburan();
    System.out.println("Apakah anda mengambil cuti pada bulan ini ? (y/t)");
    cuti = sc.next().charAt(0);
    if (cuti == 'y') {
      System.out.println("Berapa lama anda mengambil cuti dalam sebulan ini? ");
      izinCuti = sc.nextInt();
      hitungCuti();
    }
    System.out.println(
        "Apakah Anda ingin membayarkan zakat penghasilan anda selama 1 bulan ini, jika ingin maka gaji total anda akan kami potong untuk pembayaran tersebut (y/t)");
    lanjutkan = sc.next().charAt(0);
    System.out.println("Apakah anda ingin melihat rincian gaji anda? (y/t)");
    teruskan = sc.next().charAt(0);
    System.out.println("Gaji anda telah dihitung");
    cetakSlipGaji();
  }

  static void cetakSlipGaji() {
    for (int i = 0; i < biodata.length; i++) {
      for (int j = 0; j < biodata[0].length; j++) {
        if (biodata[i][4].equalsIgnoreCase(merried)) {
          Tunjangan = 190000;
        } else {
          Tunjangan = 0;
        }
      }
      gajibersih[i] = gaji[i] + Tunjangan - bpjs;
      zakat = gajibersih[i] * 25 / 1000;
      if (masukkanNama.equalsIgnoreCase(biodata[i][1])) {
        gajiSlip = gaji[i];
        namaSlip = biodata[i][0];
        if (cuti == 'y') {
          if (lanjutkan == 'y' && teruskan == 'y') {
            System.out.println("\tSLIP GAJI");
            System.out.println("-----------------------------------");
            System.out.printf(
                "Nama : %s\nGaji Pokok\t  : \tRp.%s\nTunjangan\t  : \t+Rp.%s\nBiaya BPJS\t  : \t-Rp.%s\nDenda Cuti\t  : \t-Rp.%s\nZakat Penghasilan : \t-Rp.%s\nUpah Lembur\t  : \t+Rp.%s\n-----------------------------------\nGaji Bersih :\t\tRp.%s\n",
                namaSlip, gajiSlip, Tunjangan, bpjs, dendaCuti, zakat, lemburan, gajiSlip + Tunjangan - bpjs -
                    dendaCuti - zakat + lemburan);

          } else if (lanjutkan == 't' && teruskan == 'y') {
            System.out.println("  \tSLIP GAJI");
            System.out.println("----------------------------------");
            System.out.printf(
                "Nama : %s\nGaji Pokok\t: \tRp.%s\nTunjangan\t: \t+Rp.%s\nBiaya BPJS\t: \t-Rp.%s\nDenda Cuti\t: \t-Rp.%s\nUpah Lembur\t: \t+Rp.%s\n----------------------------------\nGaji Bersih : \t\tRp.%s\n",
                namaSlip, gajiSlip, Tunjangan, bpjs, dendaCuti, lemburan, gajiSlip + Tunjangan - bpjs -
                    dendaCuti + lemburan);
          }
        } else if (cuti == 't') {
          if (lanjutkan == 'y' && teruskan == 'y') {
            System.out.println("  \tSLIP GAJI");
            System.out.println("----------------------------------");
            System.out.printf(
                "Nama : %s\nGaji Pokok\t  : \tRp.%s\nTunjangan\t  : \t+Rp.%s\nBiaya BPJS\t  : \t-Rp.%s\nZakat Penghasilan : \t-Rp.%s\nUpah Lembur\t  : \tRp.+%s\n-----------------------------------\nGaji Bersih :\t\tRp.%s\n",
                namaSlip, gajiSlip, Tunjangan, bpjs, zakat, lemburan, gajiSlip + Tunjangan - bpjs - zakat + lemburan);

          } else if (lanjutkan == 't' && teruskan == 'y') {
            System.out.println("  \tSLIP GAJI");
            System.out.println("----------------------------------");
            System.out.printf(
                "Nama : %s\nGaji Pokok\t: \tRp.%s\nTunjangan\t: \t+Rp.%s\nBiaya BPJS\t: \t-Rp.%s\nUpah Lembur\t: \t+Rp.%s\n----------------------------------\nGaji Bersih : \t\tRp.%s\n",
                namaSlip, gajiSlip, Tunjangan, bpjs, lemburan, gajiSlip + Tunjangan - bpjs + lemburan);
          }
        }
      }
    }
  }

  static void tampilBiodata() {
    System.out.println("Masukkan Nama Karyawan yang ingin anda cari : ");
    searchName = sc.next();
    System.out.println("\t  BIODATA");
    System.out.println("-----------------------------------");
    for (int i = 0; i < biodata.length; i++) {
      if (searchName.equalsIgnoreCase(biodata[i][1]) || searchName.equalsIgnoreCase(biodata[i][1] + biodata[i][0])) {
        System.out.println("Nama Lengkap\t: " + biodata[i][0]);
        System.out.println("Nama Panggilan\t: " + biodata[i][1]);
        System.out.println("TTL\t\t: " + biodata[i][3]);
        System.out.println("Status\t\t: " + biodata[i][4]);
        System.out.println("Jabatan\t\t: " + biodata[i][2]);
        System.out.println("gaji pokok\t: Rp." + gaji[i]);
      }
    }
  }

  static void ProgramMenu5() {
    if (jabatan.equalsIgnoreCase(biodata[8][2]) && masukkanNama.equalsIgnoreCase(biodata[8][0])
        || masukkanNama.equalsIgnoreCase(biodata[8][1])) {
      System.out.print("Username : ");
      String masukUsername = sc.next();
      System.out.print("Password : ");
      String masukPw = sc.next();
      if (masukUsername.equals(username) && masukPw.equals(password)) {
        do {
          System.out.println(
              "Silahkan pilih menu untuk mengubah : \n1. Nama\n2. Gaji\n3. Ubah Password & usename\n4. Kembali ke menu Utama");
          System.out.println("-------------------------------------------------------");
          pilihMenu5 = sc.nextByte();
          if (pilihMenu5 == 1) {
            System.out.println("Masukkan Nama yang ingin anda ubah");
            inputNama = sc.next();
            for (int i = 0; i < biodata.length; i++) {
              if (inputNama.equalsIgnoreCase(biodata[i][1])
                  || inputNama.equalsIgnoreCase(biodata[i][1] + biodata[i][0])) {
                System.out.println("Masukkan Nama karyawan baru (panggilan)");
                biodata[i][1] = sc.next();
                System.out.println("Masukkan nama lengkap karyawan baru ");
                biodata[i][0] = sc.next();
                sc.nextLine();
                System.out.println("------------------------------------------------------");
                System.out.println("Ubahan sukses");
              }
            }
          } else if (pilihMenu5 == 2) {
            System.out.println("Masukkan Nama Karyawan yang ingin gajinya dirubah : ");
            masukkanNama = sc.next();
            for (int i = 0; i < biodata.length; i++) {
              if (masukkanNama.equalsIgnoreCase(biodata[i][1])
                  || masukkanNama.equalsIgnoreCase(biodata[i][1] + biodata[i][0])) {
                System.out.println("Masukkan Gaji Baru : ");
                gaji[i] = sc.nextInt();
                System.out.println("Ubahan sukses");
                System.out.println("---------------------------------------------------------");
              }
            }
          } else if (pilihMenu5 == 3) {
            System.out.print("Masukkan Username lama : ");
            masukUsername = sc.next();
            System.out.print("Masukkan Password lama : ");
            masukPw = sc.next();
            if (masukUsername.equalsIgnoreCase(username) && masukPw.equalsIgnoreCase(password)) {
              System.out.println("Masukkan username baru :");
              username = sc.next();
              System.out.println("Masukkan Password baru : ");
              password = sc.next();
              System.out.println("Ubahan sukses");
            } else {
              System.out.println("Data yang anda masukkan salah");
              System.out.println("-------------------------------------------------------");
            }

          } else if (pilihMenu5 == 4) {
            break;
          }
          System.out.println("Apakah anda ingin kembali ke menu sebelumnya ? (y/t)");
          back = sc.next().charAt(0);
        } while (back == 'y' || back == 'Y');
      } else {
        System.out.println("Anda salah Menginput data");
      }
    } else {
      System.out.println("Maaf, hanya admin yang berhak menjalankan program ini");
    }
  }

  static void mainMenu() {
    do {
      System.out.println(
          "Silahkan Pilih Menu Yng Tersedia\n1. Tampilkan Gaji Setiap Jabatan\n2. Hitung Gaji\n3. Tampilkan Jabatan Tiap Karyawan\n4. Tampilkan Laporan\n5. Edit\n6. tampilkan Profil\n7. Ulang Program.");
      System.out.println("-------------------------------------------------------");
      menu = sc.nextByte();
      if (menu == 1) {
        gajiTiapJabatan();
      } else if (menu == 2) {
        sistemMenu2();
      } else if (menu == 3) {
        jabatanTiapKaryawan();
      } else if (menu == 4) {
        cetakLaporan();
      } else if (menu == 5) {
        ProgramMenu5();
      } else if (menu == 6) {
        tampilBiodata();
      } else if (menu == 7) {
        break;
      } else {
        System.out.println("Anda salah input, coba lagi");
      }
      System.out.println("Apakah anda ingin kembali ke menu ? (y/t)");
      keMenu = sc.next().charAt(0);
    } while (keMenu == 'y' || keMenu == 'Y');
  }
}

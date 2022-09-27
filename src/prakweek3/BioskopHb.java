/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakweek3;

import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class BioskopHb {

    static class Studio {

        int kodeStudio;
        int kapasitasStudio;
        boolean[][] kursi;
        Film film;

        public Studio(int kodeStudio) {
            this.kodeStudio = kodeStudio;
            this.kapasitasStudio = 40;
            this.kursi = new boolean[6][5];

        }

    }

    static class Cabang {

        String name;
        String location;
        Studio[] arrStudio;

        public Cabang(String _name, String _location, int _totalStudio) {
            this.name = _name;
            this.location = _location;
            this.arrStudio = new Studio[_totalStudio];
        }
    }

    static class Film {

        String judul, genre;
        int durasi;
        String[][] jadwal;
        int hargaTiket;

        public Film(String judul, String genre, int durasi, String[][] jadwal) {
            this.judul = judul;
            this.genre = genre;
            this.durasi = durasi;
            this.jadwal = new String[3][2];
            this.hargaTiket = 35000;
        }
    }

    static class Food {

        String nama;
        double harga;

        public Food(String nama, double harga) {
            this.nama = nama;
            this.harga = harga;
        }
    }

    static class Pelanggan {

        String nama, password;

        public Pelanggan(String nama, String password) {
            this.nama = nama;
            this.password = password;
        }
    }

    static class Order {

        Studio studio;
        Film jadwal;
        Food makanan, minuman;

        public Order(Studio studio, Film jadwal, Food makanan, Food minuman) {
            this.studio = studio;
            this.jadwal = jadwal;
            this.makanan = makanan;
            this.minuman = minuman;
        }
    }

    public static void customer() {

        Pelanggan[] arrPelanggan = {
            new Pelanggan("ekel", "ekel123"),
            new Pelanggan("iyos", "iyos123"),
            new Pelanggan("cila", "cila123")
        };
        String username;
        String password;
        boolean exit = false;
        boolean login;
        do {
            username = JOptionPane.showInputDialog(null, "Masukan username anda: ");
            int i;
            login = false;
            for (i = 0; i < arrPelanggan.length; i++) {
                if (arrPelanggan[i].nama.equals(username)) {
                    login = true;
                    break;
                }
            }
            if (login == true) {
                password = JOptionPane.showInputDialog(null, "Masukan password: ");
                if (password.equals(arrPelanggan[i].password)) {
                    exit = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Salah memasukan password!!!", "", JOptionPane.ERROR_MESSAGE);
                    login = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Salah memasukan username!!!", "", JOptionPane.ERROR_MESSAGE);
            }
        } while (exit == false);
        if (login == true) {
            int confirm;
            do {
                String inputCabang = JOptionPane.showInputDialog(null, "Pilih cabang bioskop: \n"
                        + "1.Jalan Tupai\n"
                        + "2.Jalan Cemara\n"
                        + "3.Jalan Jawa");
                confirm = JOptionPane.showConfirmDialog(null, "apakah yakin memilih cabang " + inputCabang + " ?");
            } while (confirm == JOptionPane.NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan!!!");
            }
        }
    }

    public static void film() {

        Film[] film = {
            new Film("Marvel", "action", 90, new String[][]{
                {"09.00", "13.00"},
                {"10.00", "14.00"},
                {"11.00", "13.00"},}),
            new Film("Spiderman", "action", 150, new String[][]{
                {"09.00", "13.00"},
                {"10.00", "14.00"},
                {"11.00", "13.00"},}),
            new Film("Conjuring", "horor", 180, new String[][]{
                {"09.00", "13.00"},
                {"10.00", "14.00"},
                {"11.00", "13.00"},})
        };
        boolean booked = false;
        do {

            int pilihFilm = Integer.parseInt(JOptionPane.showInputDialog(null, "pilih nomor film yang ingin di tonton:\n"
                    + "1. " + film[0].judul + "\n"
                    + "2. " + film[1].judul + "\n"
                    + "3. " + film[2].judul));
            int baris = Integer.parseInt(JOptionPane.showInputDialog(null, "pilih baris kursi: (1-6)"));
            int kolom = Integer.parseInt(JOptionPane.showInputDialog(null, "pilih kolom kursi: (1-5)"));
        } while (booked == true);

    }

    public static void makanan() {
        Food[] arrMakanan = {
            new Food("popcorn1", 1000),
            new Food("popcorn2", 1500),
            new Food("popcorn3", 2000)
        };
        Food[] arrMinuman = {
            new Food("teh1", 2000),
            new Food("teh2", 2500),
            new Food("teh3", 3000)
        };
        String inputMakanan;
        String inputMinuman;
        boolean exit = false;
        boolean status;
        do {
            inputMakanan = JOptionPane.showInputDialog(null, "Input Makanan : \n (popcorn1, popcorn2, popcorn3)" + "");
            status = false;
            int i;
            for (i = 0; i < arrMakanan.length; i++) {
                if (arrMakanan[i].nama.equals(inputMakanan)) {
                    status = true;
                    break;
                }
            }

            if (status == true) {
                inputMinuman = JOptionPane.showInputDialog(null, "Input Minuman: (teh1, teh2, teh3)");
                if (inputMinuman.equals(arrMinuman[i].nama)) {
                    exit = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Salah input minuman!!!", "Minuman salah", JOptionPane.ERROR_MESSAGE);
                    status = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Salah input Makanan!!!", "Makanan salah", JOptionPane.ERROR_MESSAGE);
            }
        } while (exit == false);

    }

    public static void konfirmasi(double hargaTiket, int noKursi, int jadwalPenayangan, double hargaMakanMinum) {
        JOptionPane.showMessageDialog(null, "Harga Tiket: " + hargaTiket + "\n" + "Nomor Kursi: " + noKursi + "\n" + "Jadwal Penayangan: " + jadwalPenayangan + "\n" + "Total: " + (hargaTiket + hargaMakanMinum));
    }

    public static void admin() {
        int menu = 0;
        while (menu != 4) {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Pilih menu:\n" + "1. Total penjualan tiket per cabang\n" + "2. Total penjualan per cabang\n" + "3. Total penjualan\n" + "4. back to main menu"));
            switch (menu) {
                case 1:
                    totalPenjualanTiketCabang();
                    break;
                case 2:
                    totalPenjualanMakananCabang();
                    break;
                case 3:
                    totalPenjualan();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "input salah!");
            }
        }
    }

    public static void totalPenjualanTiketCabang() {
        int cabang = Integer.parseInt(JOptionPane.showInputDialog(null, "pilih cabang\n" + "1. Jalan Tupai\n" + "2. Jalan Cemara\n" + "3. Jalan Jawa"));
        JOptionPane.showMessageDialog(null, "Total tiket terjual: ");
    }

    public static void totalPenjualanMakananCabang() {
        int cabang = Integer.parseInt(JOptionPane.showInputDialog(null, "pilih cabang\n" + "1. Jalan Tupai\n" + "2. Jalan Cemara\n" + "3. Jalan Jawa"));
        JOptionPane.showMessageDialog(null, "Total penjualan makanan:");
    }

    public static void totalPenjualan() {
        JOptionPane.showMessageDialog(null, "Total penjualan:");
    }

    public static void main(String[] args) {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Pilih:\n" + "1. Admin\n" + "2. Customer"));
        switch (menu) {
            case 1:
                admin();
                break;
            case 2:
                customer();
                film();
                makanan();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Anda salah memasukan angka!", "Wrong Input!", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

}

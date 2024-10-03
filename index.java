import java.util.Scanner;
class index{
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int jumlah, pilih, harga; 
                double total, grandtotal;
                pilih = 0;
                grandtotal = 0;
                do {
                        System.out.println("\n \n ==Warung Gaul==");
                        System.out.println("1. Ayam Geprek [Harga : 18.000]");
                        System.out.println("2. Mie Kuah [Harga : 20.000]");
                        System.out.println("3. Seblak [Harga : 15.000]");
                        System.out.println("4. Selesai ");
                        System.out.print("Silahkan pilih menunya : ");
                        pilih = sc.nextInt();

                        switch (pilih) {
                                case 1:
                                        System.out.println("Harga : 18.000");
                                        harga = 18000;
                                        System.out.print("Mau beli berapa? :");
                                        jumlah = sc.nextInt();
                                        total = harga * jumlah;
                                        System.out.println("Harganya adalah " + total);
                                        grandtotal = grandtotal + total;
                                        break;
                                
                                case 2:
                                        System.out.println("Harga : 20.000");
                                        harga = 20000;
                                        System.out.print("Mau beli berapa? :");
                                        jumlah = sc.nextInt();
                                        total = harga * jumlah;
                                        System.out.println("Harganya adalah " + total);
                                        grandtotal = grandtotal + total;
                                        break;
                               
                                case 3:
                                        System.out.println("Harga : 15.000");
                                        harga = 15000;
                                        System.out.print("Mau beli berapa? : ");
                                        jumlah = sc.nextInt();
                                        total = harga * jumlah;
                                        System.out.println("Harganya adalah " + total);
                                        grandtotal = grandtotal + total;
                                        break;
                               
                                case 4:
                                        System.out.println("Grandtotalnya adalah " + grandtotal);
                                        System.out.println("Matur suwun gan");
                                        break;
                                        
                                default:
                                        System.out.println("Pilihan tidak tersedia");
                        }

                }while(pilih != 4);
        }
}

import java.util.Scanner;
class index{
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int jumlah, pilih, harga; 
                double total, grandtotal;
                pilih = 0;
                grandtotal = 0;
                do {
                        System.out.println("\n \n ==Toko Gaul==");
                        System.out.println("1. Tas [Harga : 100.000]");
                        System.out.println("2. Sepatu [Harga : 50.000]");
                        System.out.println("3. Sapu [Harga : 300.000]");
                        System.out.println("4. Selesai ");
                        System.out.print("Silahkan pilih menunya : ");
                        pilih = sc.nextInt();

                        switch (pilih) {
                                case 1:
                                        System.out.println("Harga : 100.000");
                                        harga = 100000;
                                        System.out.print("Mau beli berapa? :");
                                        jumlah = sc.nextInt();
                                        total = harga * jumlah;
                                        System.out.println("Harganya adalah " + total);
                                        grandtotal = grandtotal + total;
                                        break;
                                
                                case 2:
                                        System.out.println("Harga : 50.000");
                                        harga = 50000;
                                        System.out.print("Mau beli berapa? :");
                                        jumlah = sc.nextInt();
                                        total = harga * jumlah;
                                        System.out.println("Harganya adalah " + total);
                                        grandtotal = grandtotal + total;
                                        break;
                               
                                case 3:
                                        System.out.println("Harga : 300.000");
                                        harga = 300000;
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
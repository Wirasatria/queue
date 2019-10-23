package queue_tugas;


public class run_queue {

    public static void main(String[] args) {
        QUEUE antri = new QUEUE(5);

        antri.masuk("Pelanggan 1 :");
        antri.masuk("Pelanggan 2 :");
        antri.masuk("Pelanggan 3 :");
        System.out.println("=====================================");

        System.out.println(antri.keluar()+"Selamat Menikmati");

        System.out.println();
        System.out.println();
        antri.print();
        System.out.println("========================");

        antri.masuk("PELANGGAN 1");

        System.out.println("============================");
        antri.print();
        System.out.println("============================");

        antri.masuk("PELANGGAN 2");
        System.out.println("====================================   ");
        antri.print();
        System.out.println("========================================");

        System.out.println(antri.keluar() + "Selamat Menikmati");

        System.out.println();
        antri.masuk("Pelanggan 4");
        System.out.println();
        antri.print();



    }
}

    


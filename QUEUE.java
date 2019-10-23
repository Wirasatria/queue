package queue_tugas;


public class QUEUE {
    
    String data[];
    int tail;
    int antrian;

    public QUEUE(int x){
        data = new String[x];
        tail = -1;
        antrian = 0;
    }

    public void masuk(String nomor) {
        if (tail < data.length) {
            antrian++;

            data[++tail] = nomor;
            System.out.println(" nomor antrian :" + antrian );
            System.out.println("Selamat datang " + nomor);

        } else {
            System.out.println("Sabar harap mengantri");
        }
    }

    public String keluar(){
        if(tail > 0){
            antrian--;
            String temp = data[0];
            --tail;

            for (int i = 0; i < data.length-1 ; i++) {
                data[i] = data[i+1];

            }
            return temp;
        }
        else{
            System.out.println("SILAHKAN TUNGGU SEBENTAR :");
        }

        return "";
    }

    public void print(){
        for (int i = 0; i < data.length; i++) {
            System.out.println("nomor antrian " + (i+1) );
            System.out.println("Selamat datang = " + data[i]);
        }
    }

}



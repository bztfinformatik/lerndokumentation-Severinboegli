package com.severinboegli;

public class Main {
    public static void main(String[] args) {

        Disk ssd = new Disk();
        Disk hdd = new Disk();
        Disk nvme = new Disk();

        PC pc = new PC(ssd);
        PC pc2 = new PC(hdd);
        PC pc3 = new PC(hdd);

        pc.diskWechseln(nvme);
        
        // pc.getDisk().ausbau();
    }
}
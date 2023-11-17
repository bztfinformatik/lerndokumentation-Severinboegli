package com.severinboegli;

public class PC {
    private Disk verweisAufDisk;

    public PC(Disk vaufDisk) {
        if (vaufDisk.getStatus()) {
            System.out.println("Disk ist bereits eingebaut!");
        } else {
            verweisAufDisk = vaufDisk;
            verweisAufDisk.einbau();
        }
        

    }

    public Disk getDisk() {
        return verweisAufDisk;
    }

    public void diskWechseln(Disk adisk) {
        verweisAufDisk.ausbau();
        verweisAufDisk = adisk;
        verweisAufDisk.einbau();
    }
}

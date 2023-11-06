package com.severinboegli;

public class PC {
    private Disk verweisAufDisk;

    public PC(Disk vaufDisk) {
        verweisAufDisk = vaufDisk;
        verweisAufDisk.einbau();

    }

    public void diskWechseln(Disk adisk) {
        verweisAufDisk.ausbau();
        verweisAufDisk = adisk;
        verweisAufDisk.einbau();
    }
}

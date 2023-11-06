package com.severinboegli;

public class Disk {
    private boolean eingebaut = false;

    public void einbau() {
        if (!eingebaut) {
            eingebaut = true;
        } else {
            System.out.println("Disk ist bereits eingebaut!");
        }
        
    }

    public void ausbau() {
        if (eingebaut) {
            eingebaut = false;
        } else {
            System.out.println("Disk ist bereits ausgebaut!");
        }
    }

    public boolean getStatus() {
        return eingebaut;
    }
}

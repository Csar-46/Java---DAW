package org.example.red_social;

import java.util.ArrayList;
import java.util.Arrays;

public class RedSocial {

    public static void main(String[] args) {

        Usuario ana = new Usuario("Ana", 30, "@ana", 231);

        Influencer luis = new Influencer("Luis", 25, "@luis_influencer", 5000, "MediaMark","Yoigo","Temu");

        Streamer carlos = new Streamer("Carlos", 27, "@carlos_stream", 160, 150,200);
        Basico pedro = new Basico("Pedro", 22, "@pedro123", 455);

        ana.mostrarInfo();
        System.out.println();

        luis.mostrarInfo();
        System.out.println();

        carlos.mostrarInfo();
        System.out.println();

        pedro.mostrarInfo();
        System.out.println();

    }

}

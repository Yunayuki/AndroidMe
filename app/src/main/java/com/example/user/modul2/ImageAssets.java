package com.example.user.modul2;

import java.util.ArrayList;
import java.util.List;

//public = kelas lain
//protect = kelas turunannya
//private = tidak bisa diakses di kelas lain dan turunannya


public class ImageAssets {
    public static List<Integer> heads = new ArrayList<Integer>(){{

            add(R.drawable.head1);
            add(R.drawable.head2);
            add(R.drawable.head3);
            add(R.drawable.head4);
            add(R.drawable.head5);
            add(R.drawable.head6);
            add(R.drawable.head7);
        add(R.drawable.head8);
            add(R.drawable.head9);
        add(R.drawable.head10);
        add(R.drawable.head11);
        add(R.drawable.head12);
        }};


    public static List<Integer> bodies = new ArrayList<Integer>(){{


        add(R.drawable.body1);
        add(R.drawable.body2);
        add(R.drawable.body3);
        add(R.drawable.body4);
        add(R.drawable.body5);
        add(R.drawable.body6);
        add(R.drawable.body7);
        add(R.drawable.body8);
        add(R.drawable.body9);
        add(R.drawable.body10);
        add(R.drawable.body11);
        add(R.drawable.body12);

    }};

    public static List<Integer> legs = new ArrayList<Integer>(){{


        add(R.drawable.legs1);
        add(R.drawable.legs2);
        add(R.drawable.legs3);
        add(R.drawable.legs4);
        add(R.drawable.legs5);
        add(R.drawable.legs6);
        add(R.drawable.legs7);
        add(R.drawable.legs8);
        add(R.drawable.legs9);
        add(R.drawable.legs10);
        add(R.drawable.legs11);
        add(R.drawable.legs12);

    }};

    //method yang digunakan untuk memanggil variable head.....
    public static List<Integer> getHeads(){
        return heads;
    }

    //method yang digunakan untuk memanggil variable bodies.....
    public static List<Integer> getBodies(){
        return bodies;
    }

    //method yang digunakan untuk memanggil variable legs.....
    public static List<Integer> getlegs(){
        return legs;
    }


    }


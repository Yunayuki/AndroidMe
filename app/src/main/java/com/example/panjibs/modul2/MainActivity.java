package com.example.panjibs.modul2;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.modul2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();

        BodyPartsFragments headFragment = new BodyPartsFragments();
        headFragment.setmImageIds(ImageAssets.getHeads());
        headFragment.setmListIndex(0);
        fragmentManager.beginTransaction().add(R.id.heads_container, headFragment).commit() ;


        BodyPartsFragments bodyFragment = new BodyPartsFragments();
        bodyFragment.setmImageIds(ImageAssets.getBodies());
        bodyFragment.setmListIndex(0);
        fragmentManager.beginTransaction().add(R.id.bodies_container, bodyFragment).commit() ;

        BodyPartsFragments legFragment = new BodyPartsFragments();
        legFragment.setmImageIds(ImageAssets.getLegs());
        legFragment.setmListIndex(0);
        fragmentManager.beginTransaction().add(R.id.legs_container, legFragment).commit() ;
    }

}

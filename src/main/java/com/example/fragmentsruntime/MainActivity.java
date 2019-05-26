package com.example.fragmentsruntime;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //create a fragment variable
    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialise the fragmentManager
        fragmentManager = getSupportFragmentManager();

        //check if container exist
        if (findViewById(R.id.frameLayout)!=null)
        {
            if (savedInstanceState !=null)
            {
                return;
            }
            //begin to transact the fragments
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            //create an object of the fragment to be committed
            HomeFragment homeFragment = new HomeFragment();

            //pass in the parameters by adding to transaction
            fragmentTransaction.add(R.id.frameLayout, homeFragment, null);

            //now commit the transaction of the fragment
            fragmentTransaction.commit();

        }
    }
}

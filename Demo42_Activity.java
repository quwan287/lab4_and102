package fpl.quangnm.lab1.demo4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;


import fpl.quangnm.lab1.R;

public class Demo42_Activity extends AppCompatActivity {
    Button an,hien;
    BlankFragment41 frm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo42);
        an = findViewById(R.id.an);
        hien = findViewById(R.id.hien);

        an.setOnClickListener(view1 -> {
            // tao doi tuong quan ly
            FragmentManager fragmentManager = getSupportFragmentManager();
            // annh xa fram42
            frm = (BlankFragment41) fragmentManager.findFragmentById(R.id.frm42);
            // an
            fragmentManager.beginTransaction().hide(frm).commit();
        });
        hien.setOnClickListener(view1 -> {
            // tao doi tuong quan ly
            FragmentManager fragmentManager = getSupportFragmentManager();
            // annh xa fram42
            frm = (BlankFragment41) fragmentManager.findFragmentById(R.id.frm42);
            // an
            fragmentManager.beginTransaction().show(frm).commit();
        });
    }
}
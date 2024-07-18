package fpl.quangnm.lab1.demo4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import fpl.quangnm.lab1.R;

public class Activity_Frament extends AppCompatActivity {
    Button buttonfrm1;
    EditText editTextTextfrm1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frament);
       buttonfrm1 = findViewById(R.id.buttonfrm1);
       editTextTextfrm1 = findViewById(R.id.editTextTextfrm1);
       buttonfrm1.setOnClickListener(view -> {
           // Doi tuong quan ly frm
           FragmentManager fragmentManager = getSupportFragmentManager();
           // anh xa frm
           BlankFragment41 fragment41 = (BlankFragment41) fragmentManager.findFragmentById(R.id.frm41);
           // truyen du lieu xu ly skien
           fragment41.txt1.setText(editTextTextfrm1.getText().toString());
       });
    }
}
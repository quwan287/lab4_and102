package fpl.quangnm.lab1.demo4;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import fpl.quangnm.lab1.R;

public class BlankFragment42 extends Fragment {
    Button an,hien;
    BlankFragment42 frm;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_blank42, container, false);

        return view;
    }
}
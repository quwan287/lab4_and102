package fpl.quangnm.lab1.demo4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import fpl.quangnm.lab1.R;

public class Demo43MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo43_main);
        viewPager = findViewById(R.id.demo43Viewpager);
        tabLayout = findViewById(R.id.demo43Tablayout);
        addTabLayout(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }
    public void addTabLayout(ViewPager viewPager){
        Demo43Adapter adapter = new Demo43Adapter(getSupportFragmentManager());
        adapter.addFrm(new BlankFragment41(),"ONE");
        adapter.addFrm(new BlankFragment42(),"TWO");
        adapter.addFrm(new BlankFragment43(),"THREE");
        viewPager.setAdapter(adapter);
    }
}
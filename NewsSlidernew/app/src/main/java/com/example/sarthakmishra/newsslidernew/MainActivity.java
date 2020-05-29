package com.example.sarthakmishra.newsslidernew;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
TabLayout MyTabs;
ViewPager MyPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MyTabs=(TabLayout)findViewById(R.id.MyTabs);
        MyPage=(ViewPager)findViewById(R.id.MyPage);

        MyTabs.setupWithViewPager(MyPage);
        SetUpViewPager(MyPage);


    }
public void SetUpViewPager(ViewPager  viewPager){
        MyViewPageAdapter Adapter=new MyViewPageAdapter(getSupportFragmentManager());
        Adapter.AddFragmentPage(new Page_1(),"Father of IT");
        Adapter.AddFragmentPage(new Page_2(),"Send passwords");
        Adapter.AddFragmentPage(new Page_3(),"Firebase");
        Adapter.AddFragmentPage(new Page_4(),"The deep web");
        Adapter.AddFragmentPage(new Page_5(),"The Octobot");
        Adapter.AddFragmentPage(new Page_6(),"Self Adaptive technologies");
        Adapter.AddFragmentPage(new Page_7(),"Computer virus");
        Adapter.AddFragmentPage(new Page_8(),"Rydberg Molecule");

       viewPager.setAdapter(Adapter);
    }
    public class MyViewPageAdapter extends FragmentStatePagerAdapter {

        public MyViewPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            return null;
        }

        @Override
        public int getCount() {
            return 0;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
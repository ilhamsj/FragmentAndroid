package com.example.ilham.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        FragmentPertama fragmentPertama = new FragmentPertama();
        transaction.add(R.id.frame_content, fragmentPertama);
        transaction.addToBackStack("fragmentPertama");
        transaction.commit();
    }

    //menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    //kalau menu di pencet
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                myToast("Item 1");
                return true;
            case R.id.item2:
                myToast("Item 2");
                return true;
            case R.id.item3:
                myToast("Item 3");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //toast
    public void myToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

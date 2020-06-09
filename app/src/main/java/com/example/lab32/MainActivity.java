package com.example.lab32;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.example.lab32.ui.login.LoginActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.provider.MediaStore;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Kliknięto przycisk FAB",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void funkcja(View v){
        Toast.makeText(getApplicationContext(),
                "Kliknięto przycisk Login",
                Toast.LENGTH_SHORT).show();
        Intent intencja = new Intent(this, LoginActivity.class);
        startActivity(intencja);
    }

    public void Losuj(View v){

        Random r = new Random();

        switch(r.nextInt(3)+1)
        {
            case 1:
            {
                Toast.makeText(getApplicationContext(),
                        "1",
                        Toast.LENGTH_SHORT).show();

                Button b = (Button)v;
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background,getTheme());
                b.setCompoundDrawablesWithIntrinsicBounds(d,null,null,null);

                break;
            }
            case 2:
            {
                Toast.makeText(getApplicationContext(),
                        "2",
                        Toast.LENGTH_SHORT).show();
                Button b = (Button)v;
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background,getTheme());
                b.setCompoundDrawablesWithIntrinsicBounds(d,null,null,null);

                break;
            }
            case 3:
            {
                Toast.makeText(getApplicationContext(),
                        "3",
                        Toast.LENGTH_SHORT).show();
                Button b = (Button)v;
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background,getTheme());
                b.setCompoundDrawablesWithIntrinsicBounds(d,null,null,null);

                break;
            }
        }

    }


    public void zrobZdjecie(View v){
        Toast.makeText(getApplicationContext(),
                "Kliknięto przycisk Zrob Zdjęcie",
                Toast.LENGTH_SHORT).show();
        Intent intencja = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intencja, REQUEST_IMAGE_CAPTURE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bundle extras = data.getExtras();
        Bitmap imageBitmap = (Bitmap) extras.get("data");
        ConstraintLayout lay = (ConstraintLayout) findViewById(R.id.cont);
        lay.setBackground(new BitmapDrawable(getResources(), imageBitmap));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {

            case R.id.action_settings:
            {
                Toast.makeText(getApplicationContext(),
                        "Kliknięto przycisk "+ id,
                        Toast.LENGTH_SHORT).show();
                return true;
            }

            case R.id.action_settings1:
            {
                Toast.makeText(getApplicationContext(),
                        "Kliknięto przycisk "+ id,
                        Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.action_settings2:
            {
                Toast.makeText(getApplicationContext(),
                        "Kliknięto przycisk "+ id,
                        Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.action_settings3:
            {
                Toast.makeText(getApplicationContext(),
                        "Kliknięto przycisk "+ id,
                        Toast.LENGTH_SHORT).show();
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }
}

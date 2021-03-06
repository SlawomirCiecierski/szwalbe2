package pl.ciecierski.szwalbe2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static pl.ciecierski.szwalbe2.methods.MyMethods.*;

public class ScrollingActivityOdz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_scrolling_odz);


        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab =  findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMyToast(view);
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab =  findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMyToast(view);
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.action_settings_CV:
                setContentView(R.layout.activity_scrolling_cv);
                return true;
            case R.id.action_settings_HOB:
                setContentView(R.layout.activity_scrolling_hob);
                return true;
            case R.id.action_settings_Odz:
                setContentView(R.layout.activity_scrolling_odz);
                return true;
            case R.id.action_settings_Upa:
                setContentView(R.layout.activity_scrolling_upa);
                return true;
            case R.id.action_settings_WV:
                setContentView(R.layout.activity_scrolling_lin);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }



}

package pl.ciecierski.szwalbe2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


import static pl.ciecierski.szwalbe2.methods.MyMethods.*;

public class ScrollingActivityCV extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_scrolling_cv);


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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);

        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
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


    public void onClickBtnMuzyka(View view) {
        startActivity(new Intent(this, WebViewSoundcloudActivity.class));
    }

    public void onClickBtnWww1(View view) {
        startActivity(new Intent(this, Www1Activity.class));
    }


    public void onClickBtnWww3(View view) {
        startActivity(new Intent(this, Www3Activity.class));
    }

    public void onClickBtnWww4(View view) {
        startActivity(new Intent(this, Www4Activity.class));
    }

}

package pl.ciecierski.szwalbe2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;



import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static pl.ciecierski.szwalbe2.methods.MyMethods.showMyToast;

public class ScrollingActivityWV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_scrolling_wv_soundcloud);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.fab);
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

        Toolbar toolbar = findViewById(R.id.toolbar);
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
                setContentView(R.layout.activity_scrolling_wv_soundcloud);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClickOpenSoundcloud(View view) {
        Uri uri = Uri.parse("https://google.com");
        Intent intent = new Intent(Intent.ACTION_SCREEN_ON, uri);
        startActivity(intent);
    }



}

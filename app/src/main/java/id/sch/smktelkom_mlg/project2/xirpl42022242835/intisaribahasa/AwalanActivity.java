package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Izza on 12/04/2017.
 */

public class AwalanActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtivity_awalan);
        ImageButton ib1 = (ImageButton) findViewById(R.id.btBer);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AwalanActivity.this, AwalanBerActivity.class);
                startActivity(i);
            }
        });
        ImageButton ib2 = (ImageButton) findViewById(R.id.btDi);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AwalanActivity.this, AwalanDiActivity.class);
                startActivity(i);
            }
        });
        ImageButton ib3 = (ImageButton) findViewById(R.id.btKe);
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AwalanActivity.this, AwalanKeActivity.class);
                startActivity(i);
            }
        });
        ImageButton ib4 = (ImageButton) findViewById(R.id.btMe);
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AwalanActivity.this, AwalanMeActivity.class);
                startActivity(i);
            }
        });
        ImageButton ib5 = (ImageButton) findViewById(R.id.btPe);
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AwalanActivity.this, AwalanPeActivity.class);
                startActivity(i);
            }
        });
        ImageButton ib6 = (ImageButton) findViewById(R.id.btPer);
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AwalanActivity.this, AwalanPerActivity.class);
                startActivity(i);
            }
        });
        ImageButton ib7 = (ImageButton) findViewById(R.id.btSe);
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AwalanActivity.this, AwalanSeActivity.class);
                startActivity(i);
            }
        });
        ImageButton ib8 = (ImageButton) findViewById(R.id.btTer);
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AwalanActivity.this, AwalanTerActivity.class);
                startActivity(i);
            }
        });



    }
}
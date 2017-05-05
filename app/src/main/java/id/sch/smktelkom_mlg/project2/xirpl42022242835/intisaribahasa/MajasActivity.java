package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;

/**
 * Created by Izza on 03/05/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MajasActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_majas);
        ImageButton ib1 = (ImageButton) findViewById(R.id.btPerb);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MajasActivity.this, MajasPerbActivity.class);
                startActivity(i);
            }
        });
        ImageButton ib2 = (ImageButton) findViewById(R.id.btPert);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MajasActivity.this, MajasPertActivity.class);
                startActivity(i);
            }
        });
        ImageButton ib3 = (ImageButton) findViewById(R.id.btSin);
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MajasActivity.this, MajasSinActivity.class);
                startActivity(i);
            }
        });
        ImageButton ib4 = (ImageButton) findViewById(R.id.btPen);
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MajasActivity.this, MajasPenActivity.class);
                startActivity(i);
            }
        });

    }

}


package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter.KataDasarAdapter;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.KataDasar;

/**
 * Created by Angga on 4/24/2017.
 */

public class KDActivity extends AppCompatActivity implements KataDasarAdapter.IKataDasarAdapter {

    ArrayList<KataDasar> mList = new ArrayList<>();

    KataDasarAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.katadasar_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.katadasar);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new KataDasarAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.katadasar);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new KataDasar(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}

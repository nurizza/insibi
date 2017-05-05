package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter.MajasSinAdapter;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.MajasSin;

/**
 * Created by Angga on 4/23/2017.
 */

public class MajasSinActivity extends AppCompatActivity implements MajasSinAdapter.IMajasSinAdapter {

    ArrayList<MajasSin> mList = new ArrayList<>();

    MajasSinAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.majas_sin_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.majassin);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new MajasSinAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.majassin);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new MajasSin(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}

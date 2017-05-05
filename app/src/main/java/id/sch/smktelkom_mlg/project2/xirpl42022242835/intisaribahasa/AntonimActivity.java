package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa;


import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;


import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter.AntonimAdapter;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.Antonim;

public class AntonimActivity extends AppCompatActivity implements AntonimAdapter.IAntonimAdapter {

    ArrayList<Antonim> mList = new ArrayList<>();

    AntonimAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.antonim_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.antonim);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new AntonimAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
    }


    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.antonim);

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Antonim(arJudul[i]));
        }
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void doClick(int pos) {

    }
}



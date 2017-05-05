package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.Peribahasa;

/**
 * Created by Angga on 4/23/2017.
 */

public class PeribahasaAdapter extends RecyclerView.Adapter<PeribahasaAdapter.ViewHolder> {

    IPeribahasaAdapter mIPeribahasaAdapter;
    ArrayList<Peribahasa> peribahasaList;

    public PeribahasaAdapter(Context context, ArrayList<Peribahasa> peribahasaList) {
        this.peribahasaList = peribahasaList;
        mIPeribahasaAdapter = (IPeribahasaAdapter) context;
    }

    @Override
    public PeribahasaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.peribahasa_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(PeribahasaAdapter.ViewHolder holder, int position) {
        Peribahasa peribahasa = peribahasaList.get(position);
        holder.tvJudul.setText(peribahasa.judul);
    }

    @Override
    public int getItemCount() {
        if (peribahasaList != null)
            return peribahasaList.size();
        return 0;
    }

    public interface IPeribahasaAdapter {
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul;

        public ViewHolder(View itemView) {
            super(itemView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIPeribahasaAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}
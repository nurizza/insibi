package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.MajasPert;

/**
 * Created by Angga on 4/23/2017.
 */

public class MajasPertAdapter extends RecyclerView.Adapter<MajasPertAdapter.ViewHolder> {

    MajasPertAdapter.IMajasPertAdapter mIMajasPertAdapter;
    ArrayList<MajasPert> majaspertList;

    public MajasPertAdapter(Context context, ArrayList<MajasPert> majaspertList) {
        this.majaspertList = majaspertList;
        mIMajasPertAdapter = (MajasPertAdapter.IMajasPertAdapter) context;
    }

    @Override
    public MajasPertAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.majas_pert_layout, parent, false);
        MajasPertAdapter.ViewHolder vh = new MajasPertAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MajasPertAdapter.ViewHolder holder, int position) {
        MajasPert majaspert = majaspertList.get(position);
        holder.tvJudul.setText(majaspert.judul);
    }

    @Override
    public int getItemCount() {
        if (majaspertList != null)
            return majaspertList.size();
        return 0;
    }

    public interface IMajasPertAdapter {
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
                    mIMajasPertAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}
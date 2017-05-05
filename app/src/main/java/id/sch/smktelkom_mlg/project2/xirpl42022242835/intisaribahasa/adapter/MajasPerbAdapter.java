package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.MajasPerb;

public class MajasPerbAdapter extends RecyclerView.Adapter<MajasPerbAdapter.ViewHolder> {

    MajasPerbAdapter.IMajasPerbAdapter mIMajasPerbAdapter;
    ArrayList<MajasPerb> majasperbList;

    public MajasPerbAdapter(Context context, ArrayList<MajasPerb> majasperbList) {
        this.majasperbList = majasperbList;
        mIMajasPerbAdapter = (MajasPerbAdapter.IMajasPerbAdapter) context;
    }

    @Override
    public MajasPerbAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.majas_perb_layout, parent, false);
        MajasPerbAdapter.ViewHolder vh = new MajasPerbAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MajasPerbAdapter.ViewHolder holder, int position) {
        MajasPerb majasperb = majasperbList.get(position);
        holder.tvJudul.setText(majasperb.judul);
    }

    @Override
    public int getItemCount() {
        if (majasperbList != null)
            return majasperbList.size();
        return 0;
    }

    public interface IMajasPerbAdapter {
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
                    mIMajasPerbAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}
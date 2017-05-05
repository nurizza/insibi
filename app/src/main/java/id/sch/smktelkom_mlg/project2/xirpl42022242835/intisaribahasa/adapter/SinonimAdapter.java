package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.Sinonim;

/**
 * Created by Izza on 21/03/2017.
 */

public class SinonimAdapter extends RecyclerView.Adapter<SinonimAdapter.ViewHolder>{

    ISinonimAdapter mISinonimAdapter;
    ArrayList<Sinonim> sinonimList;
    public SinonimAdapter(Context context, ArrayList<Sinonim> sinonimList){
        this.sinonimList = sinonimList;
        mISinonimAdapter = (ISinonimAdapter) context;
    }
    @Override
    public SinonimAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sinonim_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(SinonimAdapter.ViewHolder holder, int position) {
        Sinonim sinonim = sinonimList.get(position);
        holder.tvJudul.setText(sinonim.judul);
    }

    @Override
    public int getItemCount() {
        if(sinonimList!=null)
            return sinonimList.size();
        return 0;
    }
    public interface ISinonimAdapter{
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul;

        public ViewHolder(View itemView)
        {
            super(itemView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mISinonimAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}

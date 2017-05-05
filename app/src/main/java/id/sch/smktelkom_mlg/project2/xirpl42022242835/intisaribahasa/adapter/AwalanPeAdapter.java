package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.AwalanPe;


/**
 * Created by Izza on 21/03/2017.
 */

public class AwalanPeAdapter extends RecyclerView.Adapter<AwalanPeAdapter.ViewHolder>{

    IAwalanPeAdapter mIAwalanPeAdapter;
    ArrayList<AwalanPe> awalanpeList;
    public AwalanPeAdapter(Context context, ArrayList<AwalanPe> awalanpeList){
        this.awalanpeList = awalanpeList;
        mIAwalanPeAdapter = (IAwalanPeAdapter) context;
    }
    @Override
    public AwalanPeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.awalan_pe_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(AwalanPeAdapter.ViewHolder holder, int position) {
        AwalanPe awalanpe = awalanpeList.get(position);
        holder.tvJudul.setText(awalanpe.judul);
    }

    @Override
    public int getItemCount() {
        if(awalanpeList!=null)
            return awalanpeList.size();
        return 0;
    }
    public interface IAwalanPeAdapter{
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
                    mIAwalanPeAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}

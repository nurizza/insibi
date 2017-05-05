package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.AwalanDi;


/**
 * Created by Izza on 21/03/2017.
 */

public class AwalanDiAdapter extends RecyclerView.Adapter<AwalanDiAdapter.ViewHolder>{

    IAwalanDiAdapter mIAwalanDiAdapter;
    ArrayList<AwalanDi> awalandiList;
    public AwalanDiAdapter(Context context, ArrayList<AwalanDi> awalandiList){
        this.awalandiList = awalandiList;
        mIAwalanDiAdapter = (IAwalanDiAdapter) context;
    }
    @Override
    public AwalanDiAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.awalan_di_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(AwalanDiAdapter.ViewHolder holder, int position) {
        AwalanDi awalandi = awalandiList.get(position);
        holder.tvJudul.setText(awalandi.judul);
    }

    @Override
    public int getItemCount() {
        if(awalandiList!=null)
            return awalandiList.size();
        return 0;
    }
    public interface IAwalanDiAdapter{
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
                    mIAwalanDiAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}
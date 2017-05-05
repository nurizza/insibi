package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.AwalanBer;


/**
 * Created by Izza on 21/03/2017.
 */

public class AwalanBerAdapter extends RecyclerView.Adapter<AwalanBerAdapter.ViewHolder>{

    IAwalanBerAdapter mIAwalanBerAdapter;
    ArrayList<AwalanBer> awalanberList;
    public AwalanBerAdapter(Context context, ArrayList<AwalanBer> awalanberList){
        this.awalanberList = awalanberList;
        mIAwalanBerAdapter = (IAwalanBerAdapter) context;
    }
    @Override
    public AwalanBerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v =LayoutInflater.from(parent.getContext()).inflate(R.layout.awalan_ber_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(AwalanBerAdapter.ViewHolder holder, int position) {
        AwalanBer awalanber = awalanberList.get(position);
        holder.tvJudul.setText(awalanber.judul);
    }

    @Override
    public int getItemCount() {
        if(awalanberList!=null)
            return awalanberList.size();
        return 0;
    }
    public interface IAwalanBerAdapter{
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
                    mIAwalanBerAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}
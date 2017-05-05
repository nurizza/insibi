package id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.R;
import id.sch.smktelkom_mlg.project2.xirpl42022242835.intisaribahasa.model.AwalanTer;


/**
 * Created by Izza on 21/03/2017.
 */

public class AwalanTerAdapter extends RecyclerView.Adapter<AwalanTerAdapter.ViewHolder>{

    IAwalanTerAdapter mIAwalanTerAdapter;
    ArrayList<AwalanTer> awalanterList;
    public AwalanTerAdapter(Context context, ArrayList<AwalanTer> awalanterList){
        this.awalanterList = awalanterList;
        mIAwalanTerAdapter = (IAwalanTerAdapter) context;
    }
    @Override
    public AwalanTerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.awalan_ter_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(AwalanTerAdapter.ViewHolder holder, int position) {
        AwalanTer awalanter = awalanterList.get(position);
        holder.tvJudul.setText(awalanter.judul);
    }

    @Override
    public int getItemCount() {
        if(awalanterList!=null)
            return awalanterList.size();
        return 0;
    }
    public interface IAwalanTerAdapter{
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
                    mIAwalanTerAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}

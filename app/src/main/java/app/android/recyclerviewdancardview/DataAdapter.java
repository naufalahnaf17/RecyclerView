package app.android.recyclerviewdancardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MusikViewHolder> {


    private ArrayList<Musik> dataList;

    public DataAdapter(ArrayList<Musik> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MusikViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_data, parent, false);
        return new MusikViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MusikViewHolder holder, final int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtPenyanyi.setText(dataList.get(position).getPenyanyi());
        holder.txtUrutan.setText(dataList.get(position).getUrutan());
        holder.gambar.setImageResource(dataList.get(position).getGambar());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), dataList.get(position).getPenyanyi(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MusikViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtPenyanyi , txtUrutan;
        private ImageView gambar;
        private CardView card;

        public MusikViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txtNama);
            txtPenyanyi = (TextView) itemView.findViewById(R.id.txtPenyanyi);
            txtUrutan = (TextView) itemView.findViewById(R.id.txtUrutan);
            gambar = (ImageView) itemView.findViewById(R.id.gambar);
            card = (CardView)itemView.findViewById(R.id.cardView);

        }
    }
}

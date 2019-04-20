package anative.com.desing;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public ImageView img;
        public TextView DoctorName, Description;

        public ViewHolder(View itemView) {
            super(itemView);
            img =itemView.findViewById(R.id.img);
            DoctorName = itemView.findViewById(R.id.DoctorName);
            Description =itemView.findViewById(R.id.Description);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

                }
            });
        }
    }

    private Context context;
    private List<ClinicsModel> clinics;

    public RecyclerAdapter(Context context,List<ClinicsModel> clinics)
    {
        this.context = context;
        this.clinics = clinics;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context)
                .inflate(R.layout.clinic_card, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        ClinicsModel clinic = clinics.get(i);
        viewHolder.DoctorName.setText(clinic.getDoctorName());
        viewHolder.Description.setText(clinic.getDescription());
        viewHolder.img.setImageResource(R.drawable.drugicon);
    }

    @Override
    public int getItemCount() {
        return clinics.size();
    }
}

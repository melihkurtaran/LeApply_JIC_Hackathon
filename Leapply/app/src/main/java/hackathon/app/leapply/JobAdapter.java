package hackathon.app.leapply;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.JobViewHolder> {

    List<JobItem> jobItems;
    Context context;
    JobsItemClickListener listener;

    public JobAdapter(List<JobItem> jobItems, Context context, JobsItemClickListener listener) {
        this.jobItems = jobItems;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public JobViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.job_row_layout,parent,false);
        return new JobViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull JobViewHolder holder, final int position) {

        holder.txtTitleJob.setText(jobItems.get(position).getTitle());
        holder.txtCompany.setText(jobItems.get(position).getCompany());
        holder.txtLocation.setText(jobItems.get(position).getLocation());
        holder.imgJob.setImageResource(jobItems.get(position).getImageID());
        holder.root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.jobItemClicked(jobItems.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return jobItems.size();
    }

    public interface JobsItemClickListener{
        public void jobItemClicked(JobItem selectedJobItem);
    }

    public class JobViewHolder extends RecyclerView.ViewHolder{

        ImageView imgJob;
        TextView txtTitleJob;
        TextView txtCompany;
        TextView txtLocation;
        ConstraintLayout root;


        public JobViewHolder(@NonNull View itemView) {
            super(itemView);
            imgJob = itemView.findViewById(R.id.imgJob);
            txtTitleJob = itemView.findViewById(R.id.txtTitle);
            txtCompany = itemView.findViewById(R.id.txtCompany);
            txtLocation = itemView.findViewById(R.id.txtLocation);
            root = itemView.findViewById(R.id.container);
        }
    }


}

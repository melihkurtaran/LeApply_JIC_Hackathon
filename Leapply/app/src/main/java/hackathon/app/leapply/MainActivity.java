package hackathon.app.leapply;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.io.Serializable;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView jobsRecView;
    List<JobItem> jobItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("LeApply");

        jobItems = JobItem.getAllJobs();

        jobsRecView = findViewById(R.id.jobsRec);
        JobAdapter adp = new JobAdapter(jobItems, this, new JobAdapter.JobsItemClickListener() {
            @Override
            public void jobItemClicked(JobItem selectedJobItem) {
                Intent in = new Intent(MainActivity.this,JobDetailActivity.class);
                in.putExtra("jobItem", (Serializable) selectedJobItem);
                startActivity(in);
            }
        });

        jobsRecView.setLayoutManager(new LinearLayoutManager(this));
        jobsRecView.setAdapter(adp);

    }
}

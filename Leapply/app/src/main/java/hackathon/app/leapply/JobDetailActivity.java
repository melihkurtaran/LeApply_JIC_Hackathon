package hackathon.app.leapply;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class JobDetailActivity extends AppCompatActivity {

    JobItem jobItem;
    TextView jobTitle;
    TextView jobCompany;
    TextView jobLocation;
    ImageView jobImg;
    TextView jobDetail;
    Button ApplyButton, LearnButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setTitle("Job Details");
        setContentView(R.layout.activity_job_details);
        ActionBar currentBar = getSupportActionBar();
        currentBar.setHomeButtonEnabled(true);
        currentBar.setDisplayHomeAsUpEnabled(true);
        currentBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_18dp);
        jobTitle = findViewById(R.id.txtDetailTitle);
        jobCompany = findViewById(R.id.txtdetailCompany);
        jobLocation = findViewById(R.id.txtDetailLocation);
        jobDetail = findViewById(R.id.txtDetailJob);
        jobImg = findViewById(R.id.imgDetailJob);
        ApplyButton = findViewById(R.id.btnApply);
        LearnButton = findViewById(R.id.btnLearn);

        jobItem = (JobItem) getIntent().getSerializableExtra("jobItem");
        jobTitle.setText(jobItem.getTitle());
        jobCompany.setText(jobItem.getCompany());
        jobLocation.setText(jobItem.getLocation());
        jobDetail.setText(jobItem.getDetail());
        jobImg.setImageResource(jobItem.getImageID());

        LearnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(JobDetailActivity.this,LearnActivity.class);
                in.putExtra("jobItem", (Serializable) jobItem);
                startActivity(in);
            }
        });

        ApplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(JobDetailActivity.this,ApplyActivity.class);
                in.putExtra("jobItem", (Serializable) jobItem);
                startActivity(in);
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            //back to main page
            finish();
        }
        return  true;
    }
}

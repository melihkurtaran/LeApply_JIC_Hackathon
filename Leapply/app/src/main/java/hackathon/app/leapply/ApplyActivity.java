package hackathon.app.leapply;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ApplyActivity extends AppCompatActivity {

    WebView webView;
    JobItem jobItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar currentBar = getSupportActionBar();
        currentBar.setHomeButtonEnabled(true);
        currentBar.setDisplayHomeAsUpEnabled(true);
        currentBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_18dp);
        setContentView(R.layout.activity_apply);
        jobItem = (JobItem) getIntent().getSerializableExtra("jobItem");
        setTitle(jobItem.getCompany() + " Apply");
        webView = findViewById(R.id.webViewApply);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new MyWebViewClient());
        String textUrl = jobItem.getApplyLink();
        webView.loadUrl(textUrl);
    }

    class MyWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
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

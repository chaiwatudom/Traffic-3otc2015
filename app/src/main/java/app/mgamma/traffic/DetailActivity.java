package app.mgamma.traffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    //Exlicit
    TextView titleTextView, detailTextView;
    ImageView trafficImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindwidget();

        //Show view
        showView();


    }//on Create
    public void clickBack(View view){

       finish();

    }
    private void showView() {
        //SHow Title
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        //SHOW iMAGE
        int intIcon = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intIcon);

        //Show Detail
        String[] strDetail = getResources().getStringArray(R.array.detail);
        detailTextView.setText(strDetail[getIntent().getIntExtra("index",0)]);
    }


    private void bindwidget() {
        titleTextView = (TextView) findViewById(R.id.textDetailTitle);
        detailTextView = (TextView) findViewById(R.id.txtDetail);
        trafficImageView = (ImageView) findViewById(R.id.imvDetailTraffic);

    }
}//main class

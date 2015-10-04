package app.mgamma.traffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //ctrl+alt+L จะจัดฟอแมตให้สวยเอง

    //Explicit การประกาศตัวแปร
    private ListView trafficListView;//trafficListView คือ ชื่อเราตั้งแค่ traffic กดctrl+space โปรแกรมจะช่วยเราตั้งชื่อต่อ
    private Button aboutMeButton;//ถ้าเราลืมใส่ ; กด ctrl+shift+enter โปรแกรมจะเติมให้เอง


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Statement คือ คำสั่งที่ต้องจบด้วยเซมิโคลอน ; เสมอ

        //Bind Widget
        bindWidget();

        //Botton Controler
        buttoncontroller();

        createlistview();


    } // Main Method

    private void createlistview() {
        String[] strTitle = new String[20];
        strTitle[0] = "ห้ามเลี้ยวซ้าย";
        strTitle[1] = "ห้ามเลี้ยวขวา";
        strTitle[2] = "ตรงไป";
        strTitle[3] = "เลี้ยวขวา";
        strTitle[4] = "เลี้ยวซ้าย";
        strTitle[5] = "ออก";
        strTitle[6] = "เข้า";
        strTitle[7] = "ออก";
        strTitle[8] = "หยุด";
        strTitle[9] = "จำกัดความสูง";
        strTitle[10] = "แยก";
        strTitle[11] = "ห้ามกลับรถ";
        strTitle[12] = "ห้ามจอง";
        strTitle[13] = "สวนทาง";
        strTitle[14] = "ห้ามแซง";
        strTitle[15] = "เข้า";
        strTitle[16] = "หยุดรวม";
        strTitle[17] = "จำกัดความเร็ว";
        strTitle[18] = "จำกัดความกว้าง";
        strTitle[19] = "จำกัดความสูง";


        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10,
                R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16,
                R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20
        };

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, intIcon, strTitle);
        trafficListView.setAdapter(objMyAdapter);

        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            } //event
        });



    }//createlistview

    private void buttoncontroller() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //SoundEffect
                MediaPlayer buttonmediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.phonton2);
                buttonmediaPlayer.start();

                //Intent to Webview
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/mlZoKD4BRZQ"));
                startActivity(objIntent);
            }//event
        });

    }//เติมวงเล็บแล้ว alt+enter จะสร้าง private void buttoncontroller(

    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.livTraffic);
        aboutMeButton = (Button) findViewById(R.id.butTraffic);//alt+enter คือ ปล่อยให้เครื่องแคชเอง หลังจาหเขียน findViewById(R.id.butTraffic)แล้ว
    }

}   // MainClass คลาสหลัก

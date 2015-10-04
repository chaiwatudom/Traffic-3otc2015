package app.mgamma.traffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ASUS on 4/10/2558.
 */
public class MyAdapter extends BaseAdapter{
    //class เราชื่อ MyAdapter
    //Explicit ประกาศตัวแปล
    private Context objContext;
    private int[] iconInts;
    //ctrl+space จะเติมชื่อให้เรา
    //ctrl+shift+enter เติม ; ให้ หรือที่เป็นหยักๆแดงๆ
    private String[] titleStrings;

    public MyAdapter(Context objContext, int[] iconInts, String[] titleStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
    }//contructor

    @Override
    public int getCount() {
        return titleStrings.length;
        //เป็นตัวกำหนดว่าจะให้ทำงานกี่รอบ
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.traffic_listview, viewGroup, false);

        //Setup Icon
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);

        //Setup Title
        TextView titleTextView = (TextView) objView1.findViewById(R.id.txtShowTitle);
        titleTextView.setText(titleStrings[i]);

        return objView1;
    }//getView
}//Main Class

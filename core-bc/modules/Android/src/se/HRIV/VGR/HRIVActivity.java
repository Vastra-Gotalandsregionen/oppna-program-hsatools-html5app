package se.HRIV.VGR;

//import android.app.Activity;
import android.os.Bundle;
import com.phonegap.*;

public class HRIVActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
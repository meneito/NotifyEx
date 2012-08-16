package com.orjan.simpleseekbar;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;


public class MainActivity extends Activity implements OnSeekBarChangeListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        SeekBar sb = (SeekBar)findViewById(R.id.slider);
        sb.setProgress(10);
        sb.setMax(20);
        sb.setOnSeekBarChangeListener(this);
        
    }
    public void onProgressChanged(SeekBar v, int progress, boolean isUser) {
    TextView tv = (TextView)findViewById(R.id.percent);
    tv.setText(Integer.toString(progress)+"%");
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    // TODO Auto-generated method stub

    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    // TODO Auto-generated method stub

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}

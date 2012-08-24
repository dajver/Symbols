package desa.app;


import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Numbers extends Activity implements OnClickListener
{
	ImageButton mobi;
	ImageButton auto;
	
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.num);
            
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            
            mobi = (ImageButton) findViewById(R.id.imageButton8);
            mobi.setOnClickListener(this);
            
            auto = (ImageButton) findViewById(R.id.imageButton9);
            auto.setOnClickListener(this);
        }
        
        public void onClick(View v)
        {
        	Intent intent = new Intent();
        
        	switch(v.getId())
        	{
	        	case R.id.imageButton8:
	        	{
	        		intent.setClass(this, Numbers_mobi.class);
	        		startActivity(intent);
	        	}break;
	        	
	        	case R.id.imageButton9:
	        	{
	        		intent.setClass(this, Numbers_auto.class);
	        		startActivity(intent);
	        	}break;
        	}
            finish();
        }
}

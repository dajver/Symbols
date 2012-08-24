package desa.app;


import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Clothing extends Activity implements OnClickListener
{
	ImageButton stirka;
	ImageButton glagka;
	ImageButton sushka;
	ImageButton him;
	
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.cloth);
            
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            
            stirka = (ImageButton) findViewById(R.id.imageButton1);
            stirka.setOnClickListener(this);
            
            glagka = (ImageButton) findViewById(R.id.imageButton2);
            glagka.setOnClickListener(this);
            
            sushka = (ImageButton) findViewById(R.id.imageButton3);
            sushka.setOnClickListener(this);
            
            him = (ImageButton) findViewById(R.id.imageButton4);
            him.setOnClickListener(this);
        }
        
        public void onClick(View v)
        {
        	Intent intent = new Intent();
        
        	switch(v.getId())
        	{
	        	case R.id.imageButton1:
	        	{
	        		intent.setClass(this, Clothing_list.class);
	        		startActivity(intent);
	        	}break;
	        	
	        	case R.id.imageButton2:
	        	{
	        		intent.setClass(this, Cloth_glaska.class);
	        		startActivity(intent);
	        	}break;
	        	
	        	case R.id.imageButton3:
	        	{
	        		intent.setClass(this, Cloth_suhka.class);
	        		startActivity(intent);
	        	}break;
	        	
	        	case R.id.imageButton4:
	        	{
	        		intent.setClass(this, Cloth_him.class);
	        		startActivity(intent);
	        	}break;
        	}
            finish();
        }
}

package com.it.imgsbrowser;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	int jian = 4;
	int jia = 0;

	public void fun(View view) {
		int[] imgIds = { R.drawable.bbb, R.drawable.ccc, R.drawable.omg,
				R.drawable.one, R.drawable.w1 };
		ImageView showImageView = (ImageView) findViewById(R.id.show_iv);
		if (view.getId() == R.id.xiangqian_btn)
			Toast.makeText(this, "<<<<", 0).show();
		showImageView.setImageResource(imgIds[jian]);
		jian--;
		if (jian == -1)
			jian = 4;
		else if (view.getId() == R.id.xianghou_btn)
			Toast.makeText(this, ">>>>", 0).show();
		showImageView.setImageResource(imgIds[jia]);
		jia++;
		if (jia == 5)
			jia = 0;

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

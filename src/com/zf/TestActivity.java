package com.zf;

import com.zf.view.UISwitchButton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

public class TestActivity extends Activity {
	private UISwitchButton switch1;
	private UISwitchButton switch2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		initView();
	}

	private void initView() {
		switch1 = (UISwitchButton) findViewById(R.id.switch1);
		switch2 = (UISwitchButton) findViewById(R.id.switch2);
		switch2.setEnabled(false);
		switch1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked) {
					Toast.makeText(TestActivity.this, "开启", Toast.LENGTH_SHORT)
							.show();
				} else {
					Toast.makeText(TestActivity.this, "关闭", Toast.LENGTH_SHORT)
							.show();
				}
			}
		});
	}
}

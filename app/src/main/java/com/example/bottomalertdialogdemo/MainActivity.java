package com.example.bottomalertdialogdemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends Activity {
	private Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn = (Button) findViewById(R.id.btn01);
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog();
			}
		});
	}

	private void showDialog() {
		final AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
				.create();
		dialog.show();
		Window window = dialog.getWindow();
		window.setContentView(R.layout.alertdialog);
		window.setLayout(LayoutParams.FILL_PARENT, LayoutParams.MATCH_PARENT);
		window.setWindowAnimations(R.style.AnimBottom);
		Button ok = (Button) window.findViewById(R.id.btn_ok);
		Button cancel = (Button) window.findViewById(R.id.btn_cancel);
		ok.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dialog.cancel();
			}
		});
		cancel.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dialog.cancel();
			}
		});
		LinearLayout cancelLayout = (LinearLayout) window.findViewById(R.id.view_none);
		cancelLayout.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View view, MotionEvent motionEvent) {
				dialog.cancel();
				return false;
			}
		});

	}

}

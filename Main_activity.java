package com.android.client;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView response;
	EditText editTxtAdd, editTxtPort;
	Button btnConnect;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		editTxtAdd = (EditText) findViewById(R.id.addEditTxt);
		editTxtPort = (EditText) findViewById(R.id.portEditTxt);
		btnConnect = (Button) findViewById(R.id.connectBtn);
		response = (TextView) findViewById(R.id.responseTxtView);

		buttonConnect.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Client myClient = new Client(editTxtAdd.getText()
						.toString(), Integer.parseInt(editTxtPort
						.getText().toString()), response);
				myClient.execute();
			}
		});
	}

}
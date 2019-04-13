package com.example.syahrinka;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    String message,message1,message2;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_second );
        Intent intent =getIntent ();
        message = intent.getStringExtra("nama");
        message1 = intent.getStringExtra("alamat");
        message2 = intent.getStringExtra("nohp");

        TextView textView = (TextView) findViewById ( R.id.text1 );
        TextView textView2 = (TextView) findViewById ( R.id.text2 );
        TextView textView3 = (TextView) findViewById ( R.id.text3 );
        textView.setText ( message );
        textView2.setText ( message1 );
        textView3.setText ( message2 );
    }

    public void share( View v ){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Nama Anda : "+message+ " Alamat Anda : "+message1+ " No Telepon : "+message2);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}

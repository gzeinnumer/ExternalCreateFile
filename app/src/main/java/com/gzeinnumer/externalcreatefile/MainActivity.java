package com.gzeinnumer.externalcreatefile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.gzeinnumer.externalcreatefile.helper.FunctionGlobalDir;
import com.gzeinnumer.externalcreatefile.helper.FunctionGlobalFile;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity_";

    TextView tv;
    String msg="externalcreatefile\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(TAG);

        tv = findViewById(R.id.tv);

        if(FunctionGlobalFile.initFile("Send text to file.txt")){
            if (FunctionGlobalDir.isFileExists(FunctionGlobalDir.appFolder+"/File.txt")){
                msg+="File terbuat\n";
                tv.setText(msg);
            } else {
                msg+="File tidak terbuat\n";
                tv.setText(msg);
            }
        } else {
            msg+="File tidak terbuat\n";
            tv.setText(msg);
        }
    }
}
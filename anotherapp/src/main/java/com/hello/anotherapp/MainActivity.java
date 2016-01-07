package com.hello.anotherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //查找组件，定义监听器
        findViewById(R.id.btnStartMyAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //启动另外一个应用中的Activity，使用对方的AndroidManifest中Activity的action配置
                startActivity(new Intent("com.hello.componentpermission.intent.action.MyAty"));
            }
        });
    }
}

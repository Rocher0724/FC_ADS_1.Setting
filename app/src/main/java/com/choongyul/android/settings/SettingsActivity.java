package com.choongyul.android.settings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {


    //타입은 위젯에 나오는 이름자체
    // findViewById 는 자바에서 object 같이 최상위 클래스에 있고 Button은 하위클래스이기 때문에 이런식으로 캐스팅 할 수 있다.
    // 1. 레이아웃 에서 사용하는 뷰 객체 정의
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings);

        // 2. findViewById 으로 뷰 세팅
        btn = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView);

        //3. 버튼에 onClickListener 달기
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button:
                tv.setText(BuildConfig.MYURL);
        }
    }
}
// 안드로이드는 MVC 중에 액티비티 안에 뷰랑 컨트롤러를 같이한다. 모델은 따로 .
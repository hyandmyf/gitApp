package bdqn.cn.androidapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.t1);
        but1=findViewById(R.id.but1);
        but1.setOnClickListener(new L1());
    }
    class L1 implements View.OnClickListener{
        @Override
        public void onClick(View view){
            but1.setVisibility(View.GONE);
            t1.setText("你好！欢迎点击，这是一个按钮事件响应");
        }
    }
}

package com.he.mytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/activity/MainActivity")//添加路由注解 并且这里的路径需要注意的是至少需要有两级
public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ARouter.getInstance().inject(this);
		TextView tvContent = (TextView) findViewById(R.id.main_tv_content);
		tvContent.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ARouter.getInstance().build("/activity/RouterTestActivity").navigation();//发起无参数的路由操作
//				ARouter.getInstance().build("/app/CustomControl").withString("name", "测试名称").navigation();//带参数
//				ARouter.getInstance().build("/app/CustomControl").navigation(TestActivity.this, 0X123);//相当于startActivityForResult
			}
		});
	}
}

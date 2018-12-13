package com.he.mytest;

import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.he.mytest.base.BaseActivity;
import com.he.mytest.route.RouteUtils;

import static com.he.mytest.route.RouteUtils.Home_Personal;

@Route(path = RouteUtils.App_Main)//添加路由注解 并且这里的路径需要注意的是至少需要有两级
public class MainActivity extends BaseActivity {



	@Override
	protected int setActivityLayout() {
		return R.layout.activity_main;
	}

	@Override
	protected void firstInitialize() {
		TextView tvContent = (TextView) findViewById(R.id.main_tv_content);
		tvContent.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ARouter.getInstance().build(Home_Personal).navigation();//发起无参数的路由操作
//				ARouter.getInstance().build("/app/CustomControl").withString("name", "测试名称").navigation();//带参数
//				ARouter.getInstance().build("/app/CustomControl").navigation(TestActivity.this, 0X123);//相当于startActivityForResult
			}
		});
	}
}

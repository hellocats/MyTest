package com.he.mytest.test;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.he.baselib.base.BaseActivity;
import com.he.mytest.R;

/**
 * Author:hepeng
 * Date:2018-12-12
 * Description:
 */
@Route(path = "/activity/RouterTestActivity")
public class RouterTestActivity extends BaseActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_router_test);
	}
}

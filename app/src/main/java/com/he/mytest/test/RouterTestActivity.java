package com.he.mytest.test;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.he.mytest.R;
import com.he.mytest.base.BaseActivity;

/**
 * Author:hepeng
 * Date:2018-12-12
 * Description:
 */
@Route(path = "/activity/RouterTestActivity")
public class RouterTestActivity extends BaseActivity {

	@Override
	protected int setActivityLayout() {
		return R.layout.activity_router_test;
	}

	@Override
	protected void firstInitialize() {

	}
}

package com.he.baselib.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author:hepeng
 * Date:2018-12-12
 * Description:
 */

public class BaseActivity extends Activity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ARouter.getInstance().inject(this);
	}

}

package com.stardust.autojs.core.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.stardust.autojs.runtime.api.UI;
import org.mozilla.javascript.NativeObject;

public class JsTabLayout extends TabLayout {

    public JsTabLayout(Context context) {
        super(context);
    }

    public JsTabLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public JsTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setupWithViewPager(NativeObject viewPager) {
        setupWithViewPager(UI.unwrapJsViewObject(viewPager, ViewPager.class));
    }
}

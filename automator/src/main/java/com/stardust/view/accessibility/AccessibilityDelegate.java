package com.stardust.view.accessibility;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;

import java.util.Set;

/**
 * Created by Stardust on 2017/2/14.
 */

public interface AccessibilityDelegate {

    Set<Integer> ALL_EVENT_TYPES = null;

    boolean onAccessibilityEvent(AccessibilityService service, AccessibilityEvent event);

    /**
     * 返回调用onAccessibilityEvent时的EventType的集合。如果需要对所有EventType都有效，返回null。
     *
     * @return
     */
    @Nullable
    Set<Integer> getEventTypes();

}

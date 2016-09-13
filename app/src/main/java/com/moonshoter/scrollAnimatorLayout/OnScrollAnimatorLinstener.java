package com.moonshoter.scrollAnimatorLayout;

/**
 * 滑动动画监听
 * Created by liyaochi on 2016/9/13.
 */
public interface OnScrollAnimatorLinstener {
    public void onStart(ScrollAnimatorLayout.ScrollDirection direction);

    public void onEnd(ScrollAnimatorLayout.ScrollDirection direction);

    public void onCancel();
}
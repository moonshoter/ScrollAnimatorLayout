package com.moonshoter.scrollAnimatorLayout;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity implements OnScrollAnimatorLinstener {

    private ScrollAnimatorLayout mScrollAnimatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        setListener();

    }

    private void findView() {
        mScrollAnimatorLayout = (ScrollAnimatorLayout) findViewById(R.id.scroll_animator_view);
        // mScrollAnimatorLayout.setCanScroll(false);
    }

    private void setListener() {

        mScrollAnimatorLayout.setOnScrollAnimatorLinstener(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mScrollAnimatorLayout.reset();
    }

    @Override
    public void onStart(ScrollAnimatorLayout.ScrollDirection direction) {

    }

    @Override
    public void onEnd(ScrollAnimatorLayout.ScrollDirection direction) {

        switch (direction) {
            case UP:
                // Intent intent = new Intent(MainActivity.this, MediaActivity.class);
                // intent.putExtra(Const.IntentKey.ALBUMS_MEDIA_ACTIVITY_MEDIA_TYPE, MediaUtil.MediaType.IMAGE);
                // startActivity(intent);
                // overridePendingTransition(R.anim.albums_main_activity_down_to_up_in,
                // R.anim.albums_main_activity_down_to_up_out);
                break;
        }
    }

    @Override
    public void onCancel() {
    }
}

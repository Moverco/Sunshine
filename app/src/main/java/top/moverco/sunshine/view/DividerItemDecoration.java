package top.moverco.sunshine.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;

/**
 * Created by liuzongxiang on 10/04/2017.
 */

public class DividerItemDecoration extends RecyclerView.ItemDecoration {
    private final float dividerSize;
    private final Paint mPaint;

    public DividerItemDecoration(float dividerSize, @ColorInt int dividerColor) {
        this.dividerSize = dividerSize;
        mPaint = new Paint();
        mPaint.setColor(dividerColor);
        mPaint.setStyle(Paint.Style.FILL);
    }

    public DividerItemDecoration(@NonNull Context context,
                                 @DimenRes int dividerSizeResId,
                                 @ColorRes int dividerColorResId) {
        this(context.getResources().getDimensionPixelSize(dividerSizeResId),
                ContextCompat.getColor(context, dividerColorResId));
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        if (parent.isAnimating()) return;
        final int childCount = parent.getChildCount();

    }
}

package com.raduetsya.game2048;

import android.graphics.Canvas;
import android.graphics.RectF;

public interface TileView {
    void draw( Canvas c, RectF rect, int rang, float howCloseToDissapear );
}
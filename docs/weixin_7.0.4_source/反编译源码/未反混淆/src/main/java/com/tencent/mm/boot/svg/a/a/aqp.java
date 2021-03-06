package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class aqp extends c {
    private final int height = 180;
    private final int width = 180;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 180;
            case 1:
                return 180;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-1315861);
                g = c.a(g, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 20.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l = c.l(looper);
                l.moveTo(171.0f, 90.18926f);
                l.lineTo(171.0f, 9.032258f);
                l.lineTo(9.0f, 9.032258f);
                l.lineTo(9.0f, 89.96034f);
                l.lineTo(60.553738f, 41.65066f);
                l.lineTo(121.92021f, 98.15694f);
                l.lineTo(113.13358f, 80.02691f);
                l.lineTo(138.16164f, 60.600388f);
                l.lineTo(171.0f, 90.18926f);
                l.lineTo(171.0f, 90.18926f);
                l.lineTo(171.0f, 90.18926f);
                l.close();
                l.moveTo(4.494371f, 0.0f);
                l.cubicTo(2.0121984f, 0.0f, 0.0f, 2.0194945f, 0.0f, 4.5191708f);
                l.lineTo(0.0f, 135.48083f);
                l.cubicTo(0.0f, 137.9767f, 2.0214844f, 140.0f, 4.494371f, 140.0f);
                l.lineTo(175.50563f, 140.0f);
                l.cubicTo(177.98781f, 140.0f, 180.0f, 137.9805f, 180.0f, 135.48083f);
                l.lineTo(180.0f, 4.5191708f);
                l.cubicTo(180.0f, 2.0233016f, 177.97852f, 0.0f, 175.50563f, 0.0f);
                l.lineTo(4.494371f, 0.0f);
                l.lineTo(4.494371f, 0.0f);
                l.lineTo(4.494371f, 0.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}

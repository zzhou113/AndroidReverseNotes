package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.xf */
public final class C41887xf extends C5163c {
    private final int height = 75;
    private final int width = 63;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 63;
            case 1:
                return 75;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-1);
                g = C5163c.m7878a(g, 1.0f, 0.0f, -366.0f, 0.0f, 1.0f, -536.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 377.0f, 0.0f, 1.0f, 537.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 3.0846448f);
                l.cubicTo(0.0f, 1.8420041f, 1.0073593f, 0.83464485f, 2.25f, 0.83464485f);
                l.lineTo(4.6465516f, 0.83464485f);
                l.cubicTo(5.8891926f, 0.83464485f, 6.8965516f, 1.8420041f, 6.8965516f, 3.0846448f);
                l.lineTo(6.8965516f, 69.939705f);
                l.cubicTo(6.8965516f, 71.18234f, 5.8891926f, 72.189705f, 4.6465516f, 72.189705f);
                l.lineTo(2.25f, 72.189705f);
                l.cubicTo(1.0073593f, 72.189705f, 0.0f, 71.18234f, 0.0f, 69.939705f);
                l.lineTo(0.0f, 3.0846448f);
                l.close();
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(33.103447f, 3.0880115f);
                l.cubicTo(33.103447f, 1.8435115f, 34.106266f, 0.83464485f, 35.361637f, 0.83464485f);
                l.lineTo(37.74181f, 0.83464485f);
                l.cubicTo(38.988976f, 0.83464485f, 40.0f, 1.8433424f, 40.0f, 3.0880115f);
                l.lineTo(40.0f, 69.93634f);
                l.cubicTo(40.0f, 71.18084f, 38.99718f, 72.189705f, 37.74181f, 72.189705f);
                l.lineTo(35.361637f, 72.189705f);
                l.cubicTo(34.114475f, 72.189705f, 33.103447f, 71.18101f, 33.103447f, 69.93634f);
                l.lineTo(33.103447f, 3.0880115f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}

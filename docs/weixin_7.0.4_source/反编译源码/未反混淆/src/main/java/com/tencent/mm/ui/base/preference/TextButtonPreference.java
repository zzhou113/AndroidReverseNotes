package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.R;
import com.tencent.mm.ui.v;

public class TextButtonPreference extends Preference {
    public TextButtonPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextButtonPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final int getLayoutResource() {
        return R.layout.ae8;
    }

    /* Access modifiers changed, original: protected|final */
    public final View onCreateView(ViewGroup viewGroup) {
        AppMethodBeat.i(107296);
        super.onCreateView(viewGroup);
        View inflate = v.hu(this.mContext).inflate(R.layout.ae8, viewGroup, false);
        AppMethodBeat.o(107296);
        return inflate;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBindView(View view) {
        AppMethodBeat.i(107297);
        super.onBindView(view);
        TextView textView = (TextView) view.findViewById(16908310);
        if (textView != null) {
            textView.setText(getTitle());
            textView.setEnabled(isEnabled());
        }
        AppMethodBeat.o(107297);
    }
}

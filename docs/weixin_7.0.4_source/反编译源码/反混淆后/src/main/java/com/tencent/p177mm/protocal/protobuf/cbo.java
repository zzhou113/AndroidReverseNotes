package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.cbo */
public final class cbo extends C1331a {
    public int vEq;
    public int xaT;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(94593);
        int bs;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            c6093a.mo13480iz(1, this.vEq);
            c6093a.mo13480iz(2, this.xaT);
            AppMethodBeat.m2505o(94593);
            return 0;
        } else if (i == 1) {
            bs = (C6091a.m9572bs(1, this.vEq) + 0) + C6091a.m9572bs(2, this.xaT);
            AppMethodBeat.m2505o(94593);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (bs = C1331a.getNextFieldNumber(c6086a); bs > 0; bs = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, bs)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(94593);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            cbo cbo = (cbo) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cbo.vEq = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(94593);
                    return 0;
                case 2:
                    cbo.xaT = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(94593);
                    return 0;
                default:
                    AppMethodBeat.m2505o(94593);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(94593);
            return -1;
        }
    }
}

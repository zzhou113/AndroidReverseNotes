package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.gf */
public final class C7260gf extends C1331a {
    public SKBuiltinBuffer_t vIm;
    public SKBuiltinBuffer_t vIn;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(58888);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.vIm == null) {
                c6092b = new C6092b("Not all required fields were included: EncryptKey");
                AppMethodBeat.m2505o(58888);
                throw c6092b;
            } else if (this.vIn == null) {
                c6092b = new C6092b("Not all required fields were included: Key");
                AppMethodBeat.m2505o(58888);
                throw c6092b;
            } else {
                if (this.vIm != null) {
                    c6093a.mo13479iy(1, this.vIm.computeSize());
                    this.vIm.writeFields(c6093a);
                }
                if (this.vIn != null) {
                    c6093a.mo13479iy(2, this.vIn.computeSize());
                    this.vIn.writeFields(c6093a);
                }
                AppMethodBeat.m2505o(58888);
                return 0;
            }
        } else if (i == 1) {
            if (this.vIm != null) {
                ix = C6087a.m9557ix(1, this.vIm.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vIn != null) {
                ix += C6087a.m9557ix(2, this.vIn.computeSize());
            }
            AppMethodBeat.m2505o(58888);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.vIm == null) {
                c6092b = new C6092b("Not all required fields were included: EncryptKey");
                AppMethodBeat.m2505o(58888);
                throw c6092b;
            } else if (this.vIn == null) {
                c6092b = new C6092b("Not all required fields were included: Key");
                AppMethodBeat.m2505o(58888);
                throw c6092b;
            } else {
                AppMethodBeat.m2505o(58888);
                return 0;
            }
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C7260gf c7260gf = (C7260gf) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            SKBuiltinBuffer_t sKBuiltinBuffer_t;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(c6086a3, sKBuiltinBuffer_t, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c7260gf.vIm = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.m2505o(58888);
                    return 0;
                case 2:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(c6086a3, sKBuiltinBuffer_t, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c7260gf.vIn = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.m2505o(58888);
                    return 0;
                default:
                    AppMethodBeat.m2505o(58888);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(58888);
            return -1;
        }
    }
}

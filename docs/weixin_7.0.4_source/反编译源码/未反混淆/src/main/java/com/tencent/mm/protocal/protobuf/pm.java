package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class pm extends bsr {
    public String cBT;
    public int nUf;
    public String vFc;
    public String vWF;
    public String vWG;
    public String vWI;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(48797);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.cBT != null) {
                aVar.e(2, this.cBT);
            }
            if (this.vWI != null) {
                aVar.e(3, this.vWI);
            }
            if (this.vFc != null) {
                aVar.e(4, this.vFc);
            }
            aVar.iz(5, this.nUf);
            if (this.vWG != null) {
                aVar.e(6, this.vWG);
            }
            if (this.vWF != null) {
                aVar.e(7, this.vWF);
            }
            AppMethodBeat.o(48797);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.cBT != null) {
                ix += e.a.a.b.b.a.f(2, this.cBT);
            }
            if (this.vWI != null) {
                ix += e.a.a.b.b.a.f(3, this.vWI);
            }
            if (this.vFc != null) {
                ix += e.a.a.b.b.a.f(4, this.vFc);
            }
            ix += e.a.a.b.b.a.bs(5, this.nUf);
            if (this.vWG != null) {
                ix += e.a.a.b.b.a.f(6, this.vWG);
            }
            if (this.vWF != null) {
                ix += e.a.a.b.b.a.f(7, this.vWF);
            }
            AppMethodBeat.o(48797);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(48797);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            pm pmVar = (pm) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        pmVar.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(48797);
                    return 0;
                case 2:
                    pmVar.cBT = aVar3.BTU.readString();
                    AppMethodBeat.o(48797);
                    return 0;
                case 3:
                    pmVar.vWI = aVar3.BTU.readString();
                    AppMethodBeat.o(48797);
                    return 0;
                case 4:
                    pmVar.vFc = aVar3.BTU.readString();
                    AppMethodBeat.o(48797);
                    return 0;
                case 5:
                    pmVar.nUf = aVar3.BTU.vd();
                    AppMethodBeat.o(48797);
                    return 0;
                case 6:
                    pmVar.vWG = aVar3.BTU.readString();
                    AppMethodBeat.o(48797);
                    return 0;
                case 7:
                    pmVar.vWF = aVar3.BTU.readString();
                    AppMethodBeat.o(48797);
                    return 0;
                default:
                    AppMethodBeat.o(48797);
                    return -1;
            }
        } else {
            AppMethodBeat.o(48797);
            return -1;
        }
    }
}

package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class bhl extends a {
    public String cMC;
    public String kdG;
    public int wKK;
    public int wKL;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(89113);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.cMC != null) {
                aVar.e(1, this.cMC);
            }
            if (this.kdG != null) {
                aVar.e(2, this.kdG);
            }
            aVar.iz(3, this.wKK);
            aVar.iz(4, this.wKL);
            AppMethodBeat.o(89113);
            return 0;
        } else if (i == 1) {
            if (this.cMC != null) {
                f = e.a.a.b.b.a.f(1, this.cMC) + 0;
            } else {
                f = 0;
            }
            if (this.kdG != null) {
                f += e.a.a.b.b.a.f(2, this.kdG);
            }
            int bs = (f + e.a.a.b.b.a.bs(3, this.wKK)) + e.a.a.b.b.a.bs(4, this.wKL);
            AppMethodBeat.o(89113);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(89113);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bhl bhl = (bhl) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    bhl.cMC = aVar3.BTU.readString();
                    AppMethodBeat.o(89113);
                    return 0;
                case 2:
                    bhl.kdG = aVar3.BTU.readString();
                    AppMethodBeat.o(89113);
                    return 0;
                case 3:
                    bhl.wKK = aVar3.BTU.vd();
                    AppMethodBeat.o(89113);
                    return 0;
                case 4:
                    bhl.wKL = aVar3.BTU.vd();
                    AppMethodBeat.o(89113);
                    return 0;
                default:
                    AppMethodBeat.o(89113);
                    return -1;
            }
        } else {
            AppMethodBeat.o(89113);
            return -1;
        }
    }
}

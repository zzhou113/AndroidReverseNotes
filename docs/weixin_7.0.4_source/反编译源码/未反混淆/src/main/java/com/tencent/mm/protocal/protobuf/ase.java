package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class ase extends a {
    public String cIY;
    public String desc;
    public String title;
    public String url;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56839);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.title != null) {
                aVar.e(1, this.title);
            }
            if (this.desc != null) {
                aVar.e(2, this.desc);
            }
            if (this.cIY != null) {
                aVar.e(3, this.cIY);
            }
            if (this.url != null) {
                aVar.e(4, this.url);
            }
            AppMethodBeat.o(56839);
            return 0;
        } else if (i == 1) {
            if (this.title != null) {
                f = e.a.a.b.b.a.f(1, this.title) + 0;
            } else {
                f = 0;
            }
            if (this.desc != null) {
                f += e.a.a.b.b.a.f(2, this.desc);
            }
            if (this.cIY != null) {
                f += e.a.a.b.b.a.f(3, this.cIY);
            }
            if (this.url != null) {
                f += e.a.a.b.b.a.f(4, this.url);
            }
            AppMethodBeat.o(56839);
            return f;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(56839);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            ase ase = (ase) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    ase.title = aVar3.BTU.readString();
                    AppMethodBeat.o(56839);
                    return 0;
                case 2:
                    ase.desc = aVar3.BTU.readString();
                    AppMethodBeat.o(56839);
                    return 0;
                case 3:
                    ase.cIY = aVar3.BTU.readString();
                    AppMethodBeat.o(56839);
                    return 0;
                case 4:
                    ase.url = aVar3.BTU.readString();
                    AppMethodBeat.o(56839);
                    return 0;
                default:
                    AppMethodBeat.o(56839);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56839);
            return -1;
        }
    }
}

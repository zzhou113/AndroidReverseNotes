package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class aam extends btd {
    public int ehB;
    public String vEf;
    public LinkedList<aan> vEh = new LinkedList();
    public String wdB;

    public aam() {
        AppMethodBeat.i(28404);
        AppMethodBeat.o(28404);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(28405);
        b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(28405);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            if (this.wdB != null) {
                aVar.e(2, this.wdB);
            }
            aVar.iz(3, this.ehB);
            aVar.e(4, 8, this.vEh);
            if (this.vEf != null) {
                aVar.e(5, this.vEf);
            }
            AppMethodBeat.o(28405);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.wdB != null) {
                ix += e.a.a.b.b.a.f(2, this.wdB);
            }
            ix = (ix + e.a.a.b.b.a.bs(3, this.ehB)) + e.a.a.a.c(4, 8, this.vEh);
            if (this.vEf != null) {
                ix += e.a.a.b.b.a.f(5, this.vEf);
            }
            AppMethodBeat.o(28405);
            return ix;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vEh.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(28405);
                throw bVar;
            }
            AppMethodBeat.o(28405);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            aam aam = (aam) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aam.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(28405);
                    return 0;
                case 2:
                    aam.wdB = aVar3.BTU.readString();
                    AppMethodBeat.o(28405);
                    return 0;
                case 3:
                    aam.ehB = aVar3.BTU.vd();
                    AppMethodBeat.o(28405);
                    return 0;
                case 4:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        aan aan = new aan();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = aan.populateBuilderWithField(aVar4, aan, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aam.vEh.add(aan);
                    }
                    AppMethodBeat.o(28405);
                    return 0;
                case 5:
                    aam.vEf = aVar3.BTU.readString();
                    AppMethodBeat.o(28405);
                    return 0;
                default:
                    AppMethodBeat.o(28405);
                    return -1;
            }
        } else {
            AppMethodBeat.o(28405);
            return -1;
        }
    }
}

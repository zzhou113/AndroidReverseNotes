package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class aeq extends btd {
    public int kdT;
    public String kdU;
    public int wms;
    public String wmt;
    public String wmu;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56803);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.iz(2, this.kdT);
            if (this.kdU != null) {
                aVar.e(3, this.kdU);
            }
            aVar.iz(4, this.wms);
            if (this.wmt != null) {
                aVar.e(5, this.wmt);
            }
            if (this.wmu != null) {
                aVar.e(6, this.wmu);
            }
            AppMethodBeat.o(56803);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.bs(2, this.kdT);
            if (this.kdU != null) {
                ix += e.a.a.b.b.a.f(3, this.kdU);
            }
            ix += e.a.a.b.b.a.bs(4, this.wms);
            if (this.wmt != null) {
                ix += e.a.a.b.b.a.f(5, this.wmt);
            }
            if (this.wmu != null) {
                ix += e.a.a.b.b.a.f(6, this.wmu);
            }
            AppMethodBeat.o(56803);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(56803);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            aeq aeq = (aeq) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aeq.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(56803);
                    return 0;
                case 2:
                    aeq.kdT = aVar3.BTU.vd();
                    AppMethodBeat.o(56803);
                    return 0;
                case 3:
                    aeq.kdU = aVar3.BTU.readString();
                    AppMethodBeat.o(56803);
                    return 0;
                case 4:
                    aeq.wms = aVar3.BTU.vd();
                    AppMethodBeat.o(56803);
                    return 0;
                case 5:
                    aeq.wmt = aVar3.BTU.readString();
                    AppMethodBeat.o(56803);
                    return 0;
                case 6:
                    aeq.wmu = aVar3.BTU.readString();
                    AppMethodBeat.o(56803);
                    return 0;
                default:
                    AppMethodBeat.o(56803);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56803);
            return -1;
        }
    }
}

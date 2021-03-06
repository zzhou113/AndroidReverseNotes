package com.tencent.p177mm.p230g.p232b.p233a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.plugin.report.C46180a;
import com.tencent.p177mm.sdk.platformtools.C5046bo;
import com.tencent.ttpic.baseutils.IOUtils;
import java.util.Arrays;

/* renamed from: com.tencent.mm.g.b.a.bc */
public final class C42087bc extends C46180a {
    private String cVA = "";
    private int cVB = 0;
    private String cVC = "";
    private String cVM = "";
    private long cVN = 0;
    private long cYk = 0;
    private String daT = "";
    private String daU = "";
    private String daV = "";
    private String daW = "";
    private long daX = 0;
    private long daY = 0;
    private long daZ = 0;
    private long day = 0;
    private long daz = 0;
    private long dba = 0;
    private long dbb = 0;
    private long dbc = 0;
    private long dbd = 0;
    private int dbe = 0;
    private long dbf = 0;
    private long dbg = 0;
    private long dbh = 0;
    private long dbi = 0;
    private long dbj = 0;
    private long dbk = 0;
    private long dbl = 0;

    public C42087bc(String str) {
        AppMethodBeat.m2504i(50548);
        if (str != null) {
            String[] split = str.split(",");
            if (split != null) {
                String[] strArr;
                if (split.length < 27) {
                    strArr = new String[27];
                    Arrays.fill(strArr, 0, 27, "");
                    System.arraycopy(split, 0, strArr, 0, split.length);
                } else {
                    strArr = split;
                }
                this.daT = mo74169t("ToUser", strArr[0], true);
                this.daU = mo74169t("MsgSource", strArr[1], true);
                this.cVB = C5046bo.getInt(strArr[2], 0);
                this.daV = mo74169t("FieldId", strArr[3], true);
                this.cVC = mo74169t("NewMd5", strArr[4], true);
                this.daW = mo74169t("SnsInfoId", strArr[5], true);
                this.day = C5046bo.getLong(strArr[6], 0);
                this.daz = C5046bo.getLong(strArr[7], 0);
                this.daX = C5046bo.getLong(strArr[8], 0);
                this.daY = C5046bo.getLong(strArr[9], 0);
                this.daZ = C5046bo.getLong(strArr[10], 0);
                this.dba = C5046bo.getLong(strArr[11], 0);
                this.dbb = C5046bo.getLong(strArr[12], 0);
                this.dbc = C5046bo.getLong(strArr[13], 0);
                this.dbd = C5046bo.getLong(strArr[14], 0);
                this.dbe = C5046bo.getInt(strArr[15], 0);
                this.dbf = C5046bo.getLong(strArr[16], 0);
                this.dbg = C5046bo.getLong(strArr[17], 0);
                this.dbh = C5046bo.getLong(strArr[18], 0);
                this.dbi = C5046bo.getLong(strArr[19], 0);
                this.dbj = C5046bo.getLong(strArr[20], 0);
                this.dbk = C5046bo.getLong(strArr[21], 0);
                this.dbl = C5046bo.getLong(strArr[22], 0);
                this.cYk = C5046bo.getLong(strArr[23], 0);
                this.cVM = mo74169t("CDNIp", strArr[24], true);
                this.cVN = C5046bo.getLong(strArr[25], 0);
                this.cVA = mo74169t("SnsUrl", strArr[26], true);
            }
        }
        AppMethodBeat.m2505o(50548);
    }

    public final int getId() {
        return 13794;
    }

    /* renamed from: Fj */
    public final String mo4982Fj() {
        AppMethodBeat.m2504i(50549);
        String str = ",";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.daT);
        stringBuffer.append(str);
        stringBuffer.append(this.daU);
        stringBuffer.append(str);
        stringBuffer.append(this.cVB);
        stringBuffer.append(str);
        stringBuffer.append(this.daV);
        stringBuffer.append(str);
        stringBuffer.append(this.cVC);
        stringBuffer.append(str);
        stringBuffer.append(this.daW);
        stringBuffer.append(str);
        stringBuffer.append(this.day);
        stringBuffer.append(str);
        stringBuffer.append(this.daz);
        stringBuffer.append(str);
        stringBuffer.append(this.daX);
        stringBuffer.append(str);
        stringBuffer.append(this.daY);
        stringBuffer.append(str);
        stringBuffer.append(this.daZ);
        stringBuffer.append(str);
        stringBuffer.append(this.dba);
        stringBuffer.append(str);
        stringBuffer.append(this.dbb);
        stringBuffer.append(str);
        stringBuffer.append(this.dbc);
        stringBuffer.append(str);
        stringBuffer.append(this.dbd);
        stringBuffer.append(str);
        stringBuffer.append(this.dbe);
        stringBuffer.append(str);
        stringBuffer.append(this.dbf);
        stringBuffer.append(str);
        stringBuffer.append(this.dbg);
        stringBuffer.append(str);
        stringBuffer.append(this.dbh);
        stringBuffer.append(str);
        stringBuffer.append(this.dbi);
        stringBuffer.append(str);
        stringBuffer.append(this.dbj);
        stringBuffer.append(str);
        stringBuffer.append(this.dbk);
        stringBuffer.append(str);
        stringBuffer.append(this.dbl);
        stringBuffer.append(str);
        stringBuffer.append(this.cYk);
        stringBuffer.append(str);
        stringBuffer.append(this.cVM);
        stringBuffer.append(str);
        stringBuffer.append(this.cVN);
        stringBuffer.append(str);
        stringBuffer.append(this.cVA);
        str = stringBuffer.toString();
        mo74164VX(str);
        AppMethodBeat.m2505o(50549);
        return str;
    }

    /* renamed from: Fk */
    public final String mo4983Fk() {
        AppMethodBeat.m2504i(50550);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ToUser:").append(this.daT);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("MsgSource:").append(this.daU);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("NetType:").append(this.cVB);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("FieldId:").append(this.daV);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("NewMd5:").append(this.cVC);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("SnsInfoId:").append(this.daW);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("UploadStartTime:").append(this.day);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("UploadEndTime:").append(this.daz);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("OriginalSize:").append(this.daX);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("OriginalDuration:").append(this.daY);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("OriginalVideoBitrate:").append(this.daZ);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("OriginalAudioBitrate:").append(this.dba);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("OriginalFps:").append(this.dbb);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("OriginalWidth:").append(this.dbc);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("OriginalHeight:").append(this.dbd);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CpStatus:").append(this.dbe);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CpSize:").append(this.dbf);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CpDuration:").append(this.dbg);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CpVideoBitrate:").append(this.dbh);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CpAudioiBitrate:").append(this.dbi);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CpFps:").append(this.dbj);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CpWidth:").append(this.dbk);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CpHeight:").append(this.dbl);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("SendScene:").append(this.cYk);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CDNIp:").append(this.cVM);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("OriginalAudioChannel:").append(this.cVN);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("SnsUrl:").append(this.cVA);
        String stringBuffer2 = stringBuffer.toString();
        AppMethodBeat.m2505o(50550);
        return stringBuffer2;
    }
}

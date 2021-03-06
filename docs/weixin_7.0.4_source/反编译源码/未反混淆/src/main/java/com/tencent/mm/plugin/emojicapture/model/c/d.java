package com.tencent.mm.plugin.emojicapture.model.c;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xmlpull.v1.XmlPullParser;

@l(dWo = {1, 1, 13}, dWp = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u0004J\u000e\u0010;\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u0004J\u0018\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020@H\u0014J\b\u0010A\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001a\u0010!\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001a\u0010'\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001a\u0010*\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\b¨\u0006B"}, dWq = {"Lcom/tencent/mm/plugin/emojicapture/model/xml/EmoticonLensItem;", "Lcom/tencent/mm/plugin/emojicapture/model/xml/BaseXmlContent;", "()V", "CanIgnoreBackground", "", "getCanIgnoreBackground", "()I", "setCanIgnoreBackground", "(I)V", "EmoticonImageSubtype", "getEmoticonImageSubtype", "setEmoticonImageSubtype", "EmoticonLensCaption", "Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangString;", "getEmoticonLensCaption", "()Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangString;", "setEmoticonLensCaption", "(Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangString;)V", "EmoticonLensCaptionColor", "", "getEmoticonLensCaptionColor", "()Ljava/lang/String;", "setEmoticonLensCaptionColor", "(Ljava/lang/String;)V", "EmoticonLensHongbaoCaption", "Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangStringWithScene;", "getEmoticonLensHongbaoCaption", "()Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangStringWithScene;", "setEmoticonLensHongbaoCaption", "(Lcom/tencent/mm/plugin/emojicapture/model/xml/MultiLangStringWithScene;)V", "EmoticonLensHongbaoName", "getEmoticonLensHongbaoName", "setEmoticonLensHongbaoName", "EmoticonLensId", "getEmoticonLensId", "setEmoticonLensId", "EmoticonLensName", "getEmoticonLensName", "setEmoticonLensName", "EmoticonLensThumbImagePath", "getEmoticonLensThumbImagePath", "setEmoticonLensThumbImagePath", "EmoticonLensTipContent", "getEmoticonLensTipContent", "setEmoticonLensTipContent", "EmoticonLensTipImageList", "Lcom/tencent/mm/plugin/emojicapture/model/xml/StringList;", "getEmoticonLensTipImageList", "()Lcom/tencent/mm/plugin/emojicapture/model/xml/StringList;", "setEmoticonLensTipImageList", "(Lcom/tencent/mm/plugin/emojicapture/model/xml/StringList;)V", "EmoticonSubtype", "getEmoticonSubtype", "setEmoticonSubtype", "EmoticonVersion", "getEmoticonVersion", "setEmoticonVersion", "getLensCaption", "scene", "getLensName", "parseTag", "", "tag", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "toString", "plugin-emojicapture_release"})
public final class d extends a {
    private j ljA = new j("EmoticonLensTipImage");
    private String ljo = "";
    public int ljp;
    private int ljq;
    public int ljr;
    private e ljs = new e();
    private e ljt = new e();
    private String lju = "";
    private e ljv = new e();
    private f ljw = new f();
    private String ljx = "";
    private int ljy;
    private e ljz = new e();

    public d() {
        AppMethodBeat.i(2723);
        AppMethodBeat.o(2723);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, XmlPullParser xmlPullParser) {
        AppMethodBeat.i(2721);
        j.p(str, "tag");
        j.p(xmlPullParser, "parser");
        switch (str.hashCode()) {
            case -1325001522:
                if (str.equals("EmoticonLensThumbImagePath")) {
                    this.ljx = a.d(xmlPullParser);
                    AppMethodBeat.o(2721);
                    return;
                }
                break;
            case -1251312652:
                if (str.equals("EmoticonSubtype")) {
                    this.ljp = a.e(xmlPullParser);
                    AppMethodBeat.o(2721);
                    return;
                }
                break;
            case -1236821886:
                if (str.equals("EmoticonLensCaption")) {
                    this.ljt.f(xmlPullParser);
                    AppMethodBeat.o(2721);
                    return;
                }
                break;
            case -623746238:
                if (str.equals("EmoticonLensTipContent")) {
                    this.ljz.f(xmlPullParser);
                    AppMethodBeat.o(2721);
                    return;
                }
                break;
            case -424582801:
                if (str.equals("EmoticonLensName")) {
                    this.ljs.f(xmlPullParser);
                    AppMethodBeat.o(2721);
                    return;
                }
                break;
            case -345334185:
                if (str.equals("EmoticonLensHongbaoName")) {
                    this.ljv.f(xmlPullParser);
                    AppMethodBeat.o(2721);
                    return;
                }
                break;
            case 298999039:
                if (str.equals("EmoticonLensId")) {
                    this.ljo = a.d(xmlPullParser);
                    AppMethodBeat.o(2721);
                    return;
                }
                break;
            case 917282149:
                if (str.equals("EmoticonImageSubtype")) {
                    this.ljq = a.e(xmlPullParser);
                    AppMethodBeat.o(2721);
                    return;
                }
                break;
            case 967863122:
                if (str.equals("EmoticonVersion")) {
                    this.ljr = a.e(xmlPullParser);
                    AppMethodBeat.o(2721);
                    return;
                }
                break;
            case 1016626288:
                if (str.equals("CanIgnoreBackground")) {
                    this.ljy = a.e(xmlPullParser);
                    AppMethodBeat.o(2721);
                    return;
                }
                break;
            case 1403996450:
                if (str.equals("EmoticonLensTipImageList")) {
                    this.ljA.f(xmlPullParser);
                    AppMethodBeat.o(2721);
                    return;
                }
                break;
            case 1618061313:
                if (str.equals("EmoticonLensCaptionColor")) {
                    this.lju = a.d(xmlPullParser);
                    AppMethodBeat.o(2721);
                    return;
                }
                break;
            case 1721651866:
                if (str.equals("EmoticonLensHongbaoCaption")) {
                    this.ljw.f(xmlPullParser);
                    AppMethodBeat.o(2721);
                    return;
                }
                break;
        }
        a.a(xmlPullParser);
        AppMethodBeat.o(2721);
    }

    public final String toString() {
        AppMethodBeat.i(2722);
        String str = "EmoticonLensItem(EmoticonLensId='" + this.ljo + "',\n EmoticonSubtype=" + this.ljp + ",\n EmoticonLensName=" + this.ljs + ",\n EmoticonLensCaption=" + this.ljt + ",\n EmoticonLensCaptionColor='" + this.lju + "',\n EmoticonLensHongbaoName=" + this.ljv + ",\n EmoticonLensHongbaoCaption=" + this.ljw + ",\n EmoticonLensThumbImagePath='" + this.ljx + "',\n CanIgnoreBackground=" + this.ljy + ",\n EmoticonLensTipContent=" + this.ljz + ')';
        AppMethodBeat.o(2722);
        return str;
    }
}

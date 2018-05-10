package com.biz.web.entity.wlmCodeMatnr;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：WlmCodeMatnr
 * @类描述：
 * @创建人：yanzh
 * @创建时间：2018/4/25 16:06
 */
public class WlmCodeMatnrEntity {
    //唯一码
    private String uidstr;
    //物流码
    private String mandt;
    //瓶号
    private String boxflag;
    //物料编码
    private String matnr;
    //渠道编码
    private String vtweg;
    //经销商编码
    private String kunnr;
    //渠道名称
    private String vtewgName;
    //物料名称
    private String maktx;
    //物料类型
    private  String  matnrType;
    //经销商名称
    private  String kunnrName;

    public String getKunnrName() {
        return kunnrName;
    }

    public void setKunnrName(String kunnrName) {
        this.kunnrName = kunnrName;
    }

    public String getMatnrType() {
        return matnrType;
    }

    public void setMatnrType(String matnrType) {
        this.matnrType = matnrType;
    }

    public String getUidstr() {
        return uidstr;
    }

    public void setUidstr(String uidstr) {
        this.uidstr = uidstr;
    }

    public String getMandt() {
        return mandt;
    }

    public void setMandt(String mandt) {
        this.mandt = mandt;
    }

    public String getBoxflag() {
        return boxflag;
    }

    public void setBoxflag(String boxflag) {
        this.boxflag = boxflag;
    }

    public String getMatnr() {
        return matnr;
    }

    public void setMatnr(String matnr) {
        this.matnr = matnr;
    }

    public String getVtweg() {
        return vtweg;
    }

    public void setVtweg(String vtweg) {
        this.vtweg = vtweg;
    }

    public String getKunnr() {
        return kunnr;
    }

    public void setKunnr(String kunnr) {
        this.kunnr = kunnr;
    }

    public String getVtewgName() {
        return vtewgName;
    }

    public void setVtewgName(String vtewgName) {
        this.vtewgName = vtewgName;
    }

    public String getMaktx() {
        return maktx;
    }

    public void setMaktx(String maktx) {
        this.maktx = maktx;
    }
}

package com.biz.web.entity.orderinfo;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @version V0.1
 * @项目名称：新增连锁渠道
 * @类名称：OrderInfoEntity
 * @类描述：
 * @创建人：zhaohz
 * @创建时间：2018-04-25 16:17
 */
public class OrderInfoEntity {

    private String id;
    private String orderNo;         //订单号
    private String dealerCode;      //经销商编码
    private String dealerName;      //经销商名称
    private String clientCode;      //网点编码
    private String clientName;      //网点名称
    private String chanelCode;      //渠道编码
    private String chanelName;      //渠道名称
    private String expArrivalDate;  //预计到货日期
    private Double amount;          //订单件数
    private Double money;           //订单金额
    private String receiver;        //收货人
    private String address;         //收货地址
    private String phoneNum;        //收货人电话
    private String orderStatus;     //订单状态 01-初始状态，02-KA审核状态，03-分单员审核状态
    private String status;          //数据状态 009-新增，004-修改，003-删除
    private String note;            //备注
    private String checkNote;       //审核人意见
    private String createBy;        //创建人
    private long creaetEmpId;       //创建人id
    private Date createTime;        //创建时间
    private String updateBy;        //修改人
    private long updateEmpId;       //修改人id
    private Date updateTime;        //修改时间
    private String checkBy;         //审核人
    private long checkEmpId;        //审核人id
    private Date checkTime;         //审核时间
    private List<OrderLineInfoEntity> lines;//订单明细

    public void setLines(List<OrderLineInfoEntity> lines) {
        this.lines = lines;
    }

    public List<OrderLineInfoEntity> getLines() {
        return lines;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setChanelCode(String chanelCode) {
        this.chanelCode = chanelCode;
    }

    public void setChanelName(String chanelName) {
        this.chanelName = chanelName;
    }

    public void setExpArrivalDate(String expArrivalDate) {
        this.expArrivalDate = expArrivalDate;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setCheckNote(String checkNote) {
        this.checkNote = checkNote;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setCreaetEmpId(long creaetEmpId) {
        this.creaetEmpId = creaetEmpId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public void setUpdateEmpId(long updateEmpId) {
        this.updateEmpId = updateEmpId;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setCheckBy(String checkBy) {
        this.checkBy = checkBy;
    }

    public void setCheckEmpId(long checkEmpId) {
        this.checkEmpId = checkEmpId;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getId() {
        return id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public String getDealerName() {
        return dealerName;
    }

    public String getClientCode() {
        return clientCode;
    }

    public String getClientName() {
        return clientName;
    }

    public String getChanelCode() {
        return chanelCode;
    }

    public String getChanelName() {
        return chanelName;
    }

    public String getExpArrivalDate() {
        return expArrivalDate;
    }

    public Double getAmount() {
        return amount;
    }

    public Double getMoney() {
        return money;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public String getStatus() {
        return status;
    }

    public String getNote() {
        return note;
    }

    public String getCheckNote() {
        return checkNote;
    }

    public String getCreateBy() {
        return createBy;
    }

    public long getCreaetEmpId() {
        return creaetEmpId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public long getUpdateEmpId() {
        return updateEmpId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public String getCheckBy() {
        return checkBy;
    }

    public long getCheckEmpId() {
        return checkEmpId;
    }

    public Date getCheckTime() {
        return checkTime;
    }
}

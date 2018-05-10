package com.biz.web.entity.orderinfo;

/**
 * @version V0.1
 * @项目名称：新增连锁渠道
 * @类名称：OrderLineInfoEntity
 * @类描述：
 * @创建人：zhaohz
 * @创建时间：2018-04-25 16:18
 */
public class OrderLineInfoEntity {

    private String id;              //id
    private String orderNo;         //订单号
    private String orderLineNo;     //订单行号
    private String matnr;           //物料代码
    private String maktx;           //物料名称
    private Double amount;          //件数
    private Double price;           //单价
    private Double money;           //总价

    public void setId(String id) {
        this.id = id;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setOrderLineNo(String orderLineNo) {
        this.orderLineNo = orderLineNo;
    }

    public void setMatnr(String matnr) {
        this.matnr = matnr;
    }

    public void setMaktx(String maktx) {
        this.maktx = maktx;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public String getOrderLineNo() {
        return orderLineNo;
    }

    public String getMatnr() {
        return matnr;
    }

    public String getMaktx() {
        return maktx;
    }

    public Double getAmount() {
        return amount;
    }

    public Double getPrice() {
        return price;
    }

    public Double getMoney() {
        return money;
    }
}

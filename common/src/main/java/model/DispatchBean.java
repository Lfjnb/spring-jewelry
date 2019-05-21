package model;

public class DispatchBean {
    //发货单

    private Integer disId;

    private String orderNumber;//订单编号

    private String serialNumber;//发货流水号

    private String account;//用户账号

    private Integer orderType;//订单类型 1.正常订单 2.秒杀订单 3.促销订单 4.其他订单

    private Integer psType;//配送方式 1.汽车 2.火车 3.飞机 4.暂无

    private String logisticsNumber;//物流单号

    private Integer notarizeTime;//确认时间（day）

    private String consigneePhone;//收货人的手机号

    /**
     * 活动，促销表联查需要的字段
     */

    private long youbi;//订单可得优币

    private long chengzhangzhi;//订单可得成长值

    private String huodong;//活动信息

    public Integer getDisId() {
        return disId;
    }

    public void setDisId(Integer disId) {
        this.disId = disId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getPsType() {
        return psType;
    }

    public void setPsType(Integer psType) {
        this.psType = psType;
    }

    public String getLogisticsNumber() {
        return logisticsNumber;
    }

    public void setLogisticsNumber(String logisticsNumber) {
        this.logisticsNumber = logisticsNumber;
    }

    public Integer getNotarizeTime() {
        return notarizeTime;
    }

    public void setNotarizeTime(Integer notarizeTime) {
        this.notarizeTime = notarizeTime;
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public long getYoubi() {
        return youbi;
    }

    public void setYoubi(long youbi) {
        this.youbi = youbi;
    }

    public long getChengzhangzhi() {
        return chengzhangzhi;
    }

    public void setChengzhangzhi(long chengzhangzhi) {
        this.chengzhangzhi = chengzhangzhi;
    }

    public String getHuodong() {
        return huodong;
    }

    public void setHuodong(String huodong) {
        this.huodong = huodong;
    }
}

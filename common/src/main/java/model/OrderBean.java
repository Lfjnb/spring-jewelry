package model;

public class OrderBean {

    private Integer orderId;

    private String orderNumber;//订单编号

    private String putTime;//提交时间

    private Integer account;//用户表账号

    private String userName;//用户名

    private Double productPrice;//订单金额

    private Integer methodOfPayment;//支付方式 ：1.支付宝 2.微信 3.白条 4.花呗 5.银联支付

    private Integer orderSource;//订单来源 1.app 2.支付宝 3.微信 4.官网 5.其他代理方

    private Integer orderStatus;//订单状态 1.已发货 2.代发货 3.已关闭

    private String startTime;//区间条件查询起始时间

    private String endTime;//条件查询结束时间

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPutTime() {
        return putTime;
    }

    public void setPutTime(String putTime) {
        this.putTime = putTime;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getMethodOfPayment() {
        return methodOfPayment;
    }

    public void setMethodOfPayment(Integer methodOfPayment) {
        this.methodOfPayment = methodOfPayment;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
}

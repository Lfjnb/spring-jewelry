package model;

public class DeliveryBean {

    /**
     * 收货单
     */
    private Integer deliveryId;//收货人信息单Id

    private String consignee;//收货人

    private String consigneePhone;//收货人的手机号

    private Integer postcode;//邮政编码

    private String postcodeAddress;//收货人地址



    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    public String getPostcodeAddress() {
        return postcodeAddress;
    }

    public void setPostcodeAddress(String postcodeAddress) {
        this.postcodeAddress = postcodeAddress;
    }

}

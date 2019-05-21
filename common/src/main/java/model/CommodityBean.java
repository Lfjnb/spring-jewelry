package model;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/5/16 20:37
 * 修改人：wz
 * 修改时间：2019/5/16 20:37
 * 修改备注：    商品实体类
 */
public class CommodityBean {
    private Integer commodityId; //id

    private String commodityName; //商品名称

    private Integer imgId; //商品图片表Id
    private String imgUrl; //图片路径

    private Double price; //商品价格

    private Double tagPrice; //吊牌价

    private String patternNumber; //商品模号

    private String createTime; //上架时间

    private Integer type; //类型id

    private Integer styleId; //款式id
    private String styleTypeName; //款式名称

    private Integer textureId; //材质表id
    private String textureName; //材质名称1

    private Integer seriesId; //系列表id
    private String seriesName; //系列名称

    private String weight; //重量

    private Integer setMethodId; //镶法id
    private String setMethodName; //镶法名称

    private Integer grindingWayId; //打磨方式id
    private String grindingWayName; //打磨方式名称

    private Integer commQualityId; //商品成色id
    private String commQualityName; //商品成色

    private Integer chain; //配链

    private Integer letterIng; //可刻字

    private Integer crowd; //适用人群

    private String size; //尺寸

    private Double wage; //工费

    private Integer pricingManner; //计价方式

    private Integer commentId; //商品评论id
    private String commentContent; //商品评论
    private String userName; //评论用户
    private String xing; //星
    private String commentTime; //评论时间
    private String goodReputation; //好评度

    private Integer describeId; //商品描述id
    private String describeImg; //描述图片

    private Integer salesQuantity; //销售数量

    private Integer inventory; //商品库存

    private Integer certificate; //证书

    @Override
    public String toString() {
        return "CommodityBean{" +
                "commodityId=" + commodityId +
                ", commodityName='" + commodityName + '\'' +
                ", imgId=" + imgId +
                ", imgUrl='" + imgUrl + '\'' +
                ", price=" + price +
                ", tagPrice=" + tagPrice +
                ", patternNumber='" + patternNumber + '\'' +
                ", createTime='" + createTime + '\'' +
                ", type=" + type +
                ", styleId=" + styleId +
                ", styleTypeName='" + styleTypeName + '\'' +
                ", textureId=" + textureId +
                ", textureName='" + textureName + '\'' +
                ", seriesId=" + seriesId +
                ", seriesName='" + seriesName + '\'' +
                ", weight='" + weight + '\'' +
                ", setMethodId=" + setMethodId +
                ", setMethodName='" + setMethodName + '\'' +
                ", grindingWayId=" + grindingWayId +
                ", grindingWayName='" + grindingWayName + '\'' +
                ", commQualityId=" + commQualityId +
                ", commQualityName='" + commQualityName + '\'' +
                ", chain=" + chain +
                ", letterIng=" + letterIng +
                ", crowd=" + crowd +
                ", size='" + size + '\'' +
                ", wage=" + wage +
                ", pricingManner=" + pricingManner +
                ", commentId=" + commentId +
                ", commentContent='" + commentContent + '\'' +
                ", userName='" + userName + '\'' +
                ", xing='" + xing + '\'' +
                ", commentTime='" + commentTime + '\'' +
                ", goodReputation='" + goodReputation + '\'' +
                ", describeId=" + describeId +
                ", describeImg='" + describeImg + '\'' +
                ", salesQuantity=" + salesQuantity +
                ", inventory=" + inventory +
                ", certificate=" + certificate +
                '}';
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTagPrice() {
        return tagPrice;
    }

    public void setTagPrice(Double tagPrice) {
        this.tagPrice = tagPrice;
    }

    public String getPatternNumber() {
        return patternNumber;
    }

    public void setPatternNumber(String patternNumber) {
        this.patternNumber = patternNumber;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStyleId() {
        return styleId;
    }

    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
    }

    public String getStyleTypeName() {
        return styleTypeName;
    }

    public void setStyleTypeName(String styleTypeName) {
        this.styleTypeName = styleTypeName;
    }

    public Integer getTextureId() {
        return textureId;
    }

    public void setTextureId(Integer textureId) {
        this.textureId = textureId;
    }

    public String getTextureName() {
        return textureName;
    }

    public void setTextureName(String textureName) {
        this.textureName = textureName;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getSetMethodId() {
        return setMethodId;
    }

    public void setSetMethodId(Integer setMethodId) {
        this.setMethodId = setMethodId;
    }

    public String getSetMethodName() {
        return setMethodName;
    }

    public void setSetMethodName(String setMethodName) {
        this.setMethodName = setMethodName;
    }

    public Integer getGrindingWayId() {
        return grindingWayId;
    }

    public void setGrindingWayId(Integer grindingWayId) {
        this.grindingWayId = grindingWayId;
    }

    public String getGrindingWayName() {
        return grindingWayName;
    }

    public void setGrindingWayName(String grindingWayName) {
        this.grindingWayName = grindingWayName;
    }

    public Integer getCommQualityId() {
        return commQualityId;
    }

    public void setCommQualityId(Integer commQualityId) {
        this.commQualityId = commQualityId;
    }

    public String getCommQualityName() {
        return commQualityName;
    }

    public void setCommQualityName(String commQualityName) {
        this.commQualityName = commQualityName;
    }

    public Integer getChain() {
        return chain;
    }

    public void setChain(Integer chain) {
        this.chain = chain;
    }

    public Integer getLetterIng() {
        return letterIng;
    }

    public void setLetterIng(Integer letterIng) {
        this.letterIng = letterIng;
    }

    public Integer getCrowd() {
        return crowd;
    }

    public void setCrowd(Integer crowd) {
        this.crowd = crowd;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public Integer getPricingManner() {
        return pricingManner;
    }

    public void setPricingManner(Integer pricingManner) {
        this.pricingManner = pricingManner;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getXing() {
        return xing;
    }

    public void setXing(String xing) {
        this.xing = xing;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public String getGoodReputation() {
        return goodReputation;
    }

    public void setGoodReputation(String goodReputation) {
        this.goodReputation = goodReputation;
    }

    public Integer getDescribeId() {
        return describeId;
    }

    public void setDescribeId(Integer describeId) {
        this.describeId = describeId;
    }

    public String getDescribeImg() {
        return describeImg;
    }

    public void setDescribeImg(String describeImg) {
        this.describeImg = describeImg;
    }

    public Integer getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(Integer salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getCertificate() {
        return certificate;
    }

    public void setCertificate(Integer certificate) {
        this.certificate = certificate;
    }
}

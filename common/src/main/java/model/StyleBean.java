package model;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/5/20 22:06
 * 修改人：wz
 * 修改时间：2019/5/20 22:06
 * 修改备注：
 */
public class StyleBean {
    private Integer styleid;

    private String styleTypeName;

    private String styleTypeImg;

    @Override
    public String toString() {
        return "StyleBean{" +
                "styleid=" + styleid +
                ", styleTypeName='" + styleTypeName + '\'' +
                ", styleTypeImg='" + styleTypeImg + '\'' +
                '}';
    }

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    public String getStyleTypeName() {
        return styleTypeName;
    }

    public void setStyleTypeName(String styleTypeName) {
        this.styleTypeName = styleTypeName;
    }

    public String getStyleTypeImg() {
        return styleTypeImg;
    }

    public void setStyleTypeImg(String styleTypeImg) {
        this.styleTypeImg = styleTypeImg;
    }
}

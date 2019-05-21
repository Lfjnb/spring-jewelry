package model;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/5/17 14:06
 * 修改人：wz
 * 修改时间：2019/5/17 14:06
 * 修改备注：系列实体类
 */
public class SeriesBean {

    private Integer id;

    private String seriesName; //系列名称

    private Integer seriesId; //商品关联字段

    @Override
    public String toString() {
        return "SeriesBean{" +
                "id=" + id +
                ", seriesName='" + seriesName + '\'' +
                ", seriesId=" + seriesId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }
}

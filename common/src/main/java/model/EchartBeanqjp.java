package model;

public class EchartBeanqjp {
    private Integer id;
    private Integer  price;
    private Integer  number;
    private String   createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "EchartBeanqjp{" +
                "id=" + id +
                ", price=" + price +
                ", number=" + number +
                ", createtime='" + createtime + '\'' +
                '}';
    }
}

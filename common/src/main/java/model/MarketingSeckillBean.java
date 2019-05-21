package model;

/**
 * 秒杀时间段
 */
public class MarketingSeckillBean {

    private  Integer  skId;   //#秒杀时间段id
    private  String  skName;  //#秒杀时间段名称
    private  String      skDailyStartTime;  //#每日开始时间
    private  String       skEndOfDay;  //#每日结束时间
    private  Integer      skState;  //是否启用    0  否  1  是
    private  Integer    count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSkId() {
        return skId;
    }

    public void setSkId(Integer skId) {
        this.skId = skId;
    }

    public String getSkName() {
        return skName;
    }

    public void setSkName(String skName) {
        this.skName = skName;
    }

    public String getSkDailyStartTime() {
        return skDailyStartTime;
    }

    public void setSkDailyStartTime(String skDailyStartTime) {
        this.skDailyStartTime = skDailyStartTime;
    }

    public String getSkEndOfDay() {
        return skEndOfDay;
    }

    public void setSkEndOfDay(String skEndOfDay) {
        this.skEndOfDay = skEndOfDay;
    }

    public Integer getSkState() {
        return skState;
    }

    public void setSkState(Integer skState) {
        this.skState = skState;
    }
}

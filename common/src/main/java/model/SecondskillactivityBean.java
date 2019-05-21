package model;

/**
 * 秒杀活动表：
 */
public class SecondskillactivityBean {
    /*       skaId           	 int auto_increment primary key,  #活动编号
       skaTheTitle  	 varchar(2000),                             #活动标题
       skaState      	 int(10),   #活动状态    -1未开启  open   1开启  notopen
       skaTheStartTime     date ,     #活动开始时间
       skaTheEndOfTime   date,        #活动结束时间
       skaWhetherOnline   int(10)   # -1 否  no 1  是  yes*/

    private Integer skaId;                 //活动编号
    private String skaTheTitle;            //活动标题
    private Integer skaState;              //活动状态
    private String skaTheStartTime;      //活动开始时间
    private String skaTheEndOfTime;      //活动结束时间
    private Integer skaWhetherOnline;     // 否  no 1  是  yes

    public Integer getSkaId() {
        return skaId;
    }

    public void setSkaId(Integer skaId) {
        this.skaId = skaId;
    }

    public String getSkaTheTitle() {
        return skaTheTitle;
    }

    public void setSkaTheTitle(String skaTheTitle) {
        this.skaTheTitle = skaTheTitle;
    }

    public Integer getSkaState() {
        return skaState;
    }

    public void setSkaState(Integer skaState) {
        this.skaState = skaState;
    }

    public String getSkaTheStartTime() {
        return skaTheStartTime;
    }

    public void setSkaTheStartTime(String skaTheStartTime) {
        this.skaTheStartTime = skaTheStartTime;
    }

    public String getSkaTheEndOfTime() {
        return skaTheEndOfTime;
    }

    public void setSkaTheEndOfTime(String skaTheEndOfTime) {
        this.skaTheEndOfTime = skaTheEndOfTime;
    }

    public Integer getSkaWhetherOnline() {
        return skaWhetherOnline;
    }

    public void setSkaWhetherOnline(Integer skaWhetherOnline) {
        this.skaWhetherOnline = skaWhetherOnline;
    }

    @Override
    public String toString() {
        return "SecondskillactivityBean{" +
                "skaId=" + skaId +
                ", skaTheTitle='" + skaTheTitle + '\'' +
                ", skaState=" + skaState +
                ", skaTheStartTime='" + skaTheStartTime + '\'' +
                ", skaTheEndOfTime='" + skaTheEndOfTime + '\'' +
                ", skaWhetherOnline=" + skaWhetherOnline +
                '}';
    }
}
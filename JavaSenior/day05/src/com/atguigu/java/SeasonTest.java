package com.atguigu.java;
public class SeasonTest {


}

class Season{
    //1. 声明Season 对象的属性
    private final String seasonName;
    private final String seasonDesc;

    //2. 私有化类构造器
    private Season(String seasonName, String seasonDesc){
        this.seasonDesc = seasonDesc;
        this.seasonName = seasonName;
    }
    //3. 提供当前枚举类的多个对象
    public static final Season SPRING = new Season("Spring", "Spring is short");
    public static final Season SUMMER = new Season("SUMMER", "SUMMER tiem sadness");
    public static final Season AUTUMN = new Season("AUTUMN", "FALL is beautiful");
    public static final Season WINTER = new Season("WINTER", "Winter is coming");

    //4. 获取枚举类对象的属性


    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //5。 ToString方法

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}

package com.atguigu.java;
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);
    }


}

enum Season1{
    //1. 提供当前枚举类的多个对象,多个对象之间用逗号隔开，末尾对象用分号结束
    SPRING("Spring", "Spring is short"),
    SUMMER("SUMMER", "SUMMER tiem sadness"),
    AUTUMN("AUTUMN", "FALL is beautiful"),
    WINTER("WINTER", "Winter is coming");

    //2. 声明Season 对象的属性
    private final String seasonName;
    private final String seasonDesc;

    //3. 私有化类构造器
    private Season1(String seasonName, String seasonDesc){
        this.seasonDesc = seasonDesc;
        this.seasonName = seasonName;
    }

    //5. 获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //6。 ToString方法

//    @Override
//    public String toString() {
//        return "Season{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}

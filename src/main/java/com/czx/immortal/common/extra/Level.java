package com.czx.immortal.common.extra;

/**
 * @author : chenzhx
 * @since : 2019/6/30/030
 **/
public enum Level {
    /**
     * 1-9
     * less than 9 or equals 9
     */
    FIRST(0, "一阶"),

    /**
     * 10-19
     */
    SECOND(10, "二阶"),

    /**
     * 20-29
     */
    THIRD(20, "三阶"),

    /**
     * 30-39
     */
    FORTH(30, "四阶"),

    /**
     * 40-49
     */
    FIFTH(40, "五阶"),

    /**
     * 50-59
     */
    SIXTH(50, "六阶"),

    /**
     * 60-69
     */
    SEVENTH(60, "七阶"),

    /**
     * 70-79
     */
    EIGHTH(70, "八阶"),

    /**
     * 80-89
     */
    NINTH(80, "九阶"),

    /**
     * 90-99
     */
    TENTH(90, "圣阶")
    ;
    int level;
    String realm;

    Level(int level, String realm) {
        this.level = level;
        this.realm = realm;
    }

    public String getRealm(int level){
        int length = values().length;
        for(int i= length; i > 0; i--){
            Level l = values()[i];
            if(level >= l.level){
                return l.realm;
            }
        }
        return "";
    }

    public int getLevel() {
        return level;
    }

    public String getRealm() {
        return realm;
    }
}

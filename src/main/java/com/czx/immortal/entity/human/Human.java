package com.czx.immortal.entity.human;

/**
 * @author : chenzhx
 * @since : 2019/6/30/030
 **/
public abstract class Human {
    /**
     * 当前等级
     */
    private int level;

    /**
     * 当前经验值
     */
    private int exp;

    /**
     * 总经验值
     */
    private int totalExp;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getTotalExp() {
        return totalExp;
    }

    public void setTotalExp(int totalExp) {
        this.totalExp = totalExp;
    }
}

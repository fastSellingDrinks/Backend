package com.nju.fastSellingDrinks.vo;

public class ResultVO {

    private Integer state;

    private Object object;

    public ResultVO(Integer state){
        this.state=state;
    }

    public ResultVO(Integer state, Object object){
        this.state=state;
        this.object=object;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

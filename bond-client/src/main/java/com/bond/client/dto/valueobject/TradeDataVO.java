package com.bond.client.dto.valueobject;

/**
 * @author anzj
 * @date 2022/12/19 9:39
 */
public class TradeDataVO {

    /**
     * 交易面额
     */
    private Long faceValue;


    public Long getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(Long faceValue) {
        this.faceValue = faceValue;
    }
}

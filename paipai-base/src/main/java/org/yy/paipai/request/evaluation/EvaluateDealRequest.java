package org.yy.paipai.request.evaluation;

/*
* 文 件 名:  EvaluateDealRequest.java
* 版    权:  YY Technologies Co., Ltd. Copyright 2012-2013,  All rights reserved
* 描    述:  商家做评 ，http://pop.paipai.com/api/paipai/evaluation/evaluateDeal请求
* 修 改 人:  zhouliang
* 修改时间:  2014年11月28日
* 修改内容:  <修改内容>
*/
import org.yy.paipai.request.AbstractPaiPaiRequest;
import org.yy.paipai.response.evaluation.EvaluateDealResponse;

/**
* 商家做评 ，http://pop.paipai.com/api/paipai/evaluation/evaluateDeal请求
* 
* @author  zhouliang
* @version  [0.1, 2014年11月28日]
* @since  [paipai-base/0.1]
*/
public class EvaluateDealRequest extends AbstractPaiPaiRequest<EvaluateDealResponse> {
    
    /** {@inheritDoc} */
    @Override
    public String getApiMethodName() {
        return "/evaluation/evaluateDeal.xhtml";
    }
    
    /** {@inheritDoc} */
    @Override
    public Class<EvaluateDealResponse> getResponseClass() {
        return EvaluateDealResponse.class;
    }
    
    /**
    * 	卖家QQ号
    */
    public Long getSellerUin() {
        return Long.valueOf(textMap.get("sellerUin"));
    }
    
    /**
     * 
    */
    public void setSellerUin(Long sellerUin) {
        textMap.put("sellerUin", String.valueOf(sellerUin));
    }
    
    /**
    *大订单号，多个大订单号以英文,分割
    */
    public String getDealList() {
        return textMap.get("dealList");
    }
    
    /**
    *
    */
    public void setDealList(String dealList) {
        textMap.put("dealList", dealList);
    }
    
    /**
    * 评价等级 1差评2中评3好评(默认)
    */
    public Long getEvalLevel() {
        return Long.valueOf(textMap.get("evalLevel"));
    }
    
    /**
     * 
    */
    public void setEvalLevel(Long evalLevel) {
        textMap.put("evalLevel", String.valueOf(evalLevel));
    }
    
    /**
    *评价内容,长度不超过300字符
    */
    public String getEvalContent() {
        return textMap.get("evalContent");
    }
    
    /**
    *
    */
    public void setEvalContent(String evalContent) {
        textMap.put("evalContent", evalContent);
    }
    
}

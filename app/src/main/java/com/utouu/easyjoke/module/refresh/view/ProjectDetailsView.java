package com.utouu.easyjoke.module.refresh.view;

import cn.utsoft.xunions.base.IBaseStatusView;
import cn.utsoft.xunions.entity.BaseEntity;
import cn.utsoft.xunions.entity.InvestDetailEntity_HSC;

/**
 * Created by llh on 2017/2/18 13:07.
 * Function:
 * Desc:
 */
public interface ProjectDetailsView extends IBaseStatusView {

    void getDetailSuccess(InvestDetailEntity_HSC entity);

    void tgtInvalid(String message);

    void addFavorSuccess(Object entity);

    void delFavorSuccess();

    void handleFailed(String message);

    void transferOrderSuccess(BaseEntity<String> baseEntity);

}

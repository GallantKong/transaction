package org.gallant.spring.transaction.service;

import javax.annotation.Resource;
import org.gallant.spring.transaction.dto.GallantOrderSaveDTO;
import org.gallant.spring.transaction.entity.GallantOrder;
import org.gallant.spring.transaction.manager.GallantOrderManager;
import org.gallant.spring.transaction.utils.ConvertUtil;
import org.springframework.stereotype.Component;

/**
 * @author kongyong
 * @date 2019/3/16
 */
@Component
public class GallantOrderService {

    @Resource
    private GallantOrderManager gallantOrderManager;

    public boolean insert(GallantOrderSaveDTO gallantOrderSaveDTO, boolean throwException) {
        GallantOrder gallantOrder = ConvertUtil.convert2GallantOrder(gallantOrderSaveDTO);
        gallantOrderManager.insert(gallantOrder);
        Integer cityId = null;
        if (throwException) {
            System.out.println(cityId.getClass());
        }
        gallantOrder.setCityId(gallantOrder.getCityId()+1);
        return gallantOrderManager.save(gallantOrder);
    }

}

package org.gallant.spring.transaction.utils;

import org.gallant.spring.transaction.dto.GallantOrderSaveDTO;
import org.gallant.spring.transaction.entity.GallantOrder;

/**
 * @author kongyong
 * @date 2019/3/16
 */
public class ConvertUtil {

    public static GallantOrder convert2GallantOrder(GallantOrderSaveDTO gallantOrderSaveDTO) {
        GallantOrder gallantOrder = new GallantOrder();
        gallantOrder.setCityId(gallantOrderSaveDTO.getCityId());
        gallantOrder.setUserId(gallantOrderSaveDTO.getUserId());
        gallantOrder.setTitle(gallantOrderSaveDTO.getTitle());
        return gallantOrder;
    }

}

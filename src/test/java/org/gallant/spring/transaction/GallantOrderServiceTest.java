package org.gallant.spring.transaction;

import javax.annotation.Resource;
import org.gallant.spring.transaction.dto.GallantOrderSaveDTO;
import org.gallant.spring.transaction.service.GallantOrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author kongyong
 * @date 2019/3/16
 */
public class GallantOrderServiceTest extends UnitTestBase {

    @Resource
    private GallantOrderService gallantOrderService;

    @Autowired
    private PlatformTransactionManager platformTransactionManager;

    @Test
    public void insert(){
        GallantOrderSaveDTO gallantOrderSaveDTO = new GallantOrderSaveDTO();
        gallantOrderSaveDTO.setCityId(2);
        gallantOrderSaveDTO.setUserId(1L);
        gallantOrderSaveDTO.setTitle("我是一个霸气的title");
//        gallantOrderService.insert(gallantOrderSaveDTO, true);
        gallantOrderService.insert(gallantOrderSaveDTO, false);
    }

}

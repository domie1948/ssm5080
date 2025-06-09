package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BumenjingliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BumenjingliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BumenjingliView;


/**
 * 部门经理
 *
 * @author 
 * @email 
 * @date 2021-03-31 23:04:32
 */
public interface BumenjingliService extends IService<BumenjingliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BumenjingliVO> selectListVO(Wrapper<BumenjingliEntity> wrapper);
   	
   	BumenjingliVO selectVO(@Param("ew") Wrapper<BumenjingliEntity> wrapper);
   	
   	List<BumenjingliView> selectListView(Wrapper<BumenjingliEntity> wrapper);
   	
   	BumenjingliView selectView(@Param("ew") Wrapper<BumenjingliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BumenjingliEntity> wrapper);
   	
}


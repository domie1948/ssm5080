package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzichaxunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzichaxunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzichaxunView;


/**
 * 工资查询
 *
 * @author 
 * @email 
 * @date 2021-03-31 23:04:32
 */
public interface GongzichaxunService extends IService<GongzichaxunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzichaxunVO> selectListVO(Wrapper<GongzichaxunEntity> wrapper);
   	
   	GongzichaxunVO selectVO(@Param("ew") Wrapper<GongzichaxunEntity> wrapper);
   	
   	List<GongzichaxunView> selectListView(Wrapper<GongzichaxunEntity> wrapper);
   	
   	GongzichaxunView selectView(@Param("ew") Wrapper<GongzichaxunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzichaxunEntity> wrapper);
   	
}


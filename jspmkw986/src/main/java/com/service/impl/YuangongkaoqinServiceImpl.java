package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuangongkaoqinDao;
import com.entity.YuangongkaoqinEntity;
import com.service.YuangongkaoqinService;
import com.entity.vo.YuangongkaoqinVO;
import com.entity.view.YuangongkaoqinView;

@Service("yuangongkaoqinService")
public class YuangongkaoqinServiceImpl extends ServiceImpl<YuangongkaoqinDao, YuangongkaoqinEntity> implements YuangongkaoqinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongkaoqinEntity> page = this.selectPage(
                new Query<YuangongkaoqinEntity>(params).getPage(),
                new EntityWrapper<YuangongkaoqinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongkaoqinEntity> wrapper) {
		  Page<YuangongkaoqinView> page =new Query<YuangongkaoqinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongkaoqinVO> selectListVO(Wrapper<YuangongkaoqinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongkaoqinVO selectVO(Wrapper<YuangongkaoqinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongkaoqinView> selectListView(Wrapper<YuangongkaoqinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongkaoqinView selectView(Wrapper<YuangongkaoqinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

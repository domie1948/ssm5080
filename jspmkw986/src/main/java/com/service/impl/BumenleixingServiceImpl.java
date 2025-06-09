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


import com.dao.BumenleixingDao;
import com.entity.BumenleixingEntity;
import com.service.BumenleixingService;
import com.entity.vo.BumenleixingVO;
import com.entity.view.BumenleixingView;

@Service("bumenleixingService")
public class BumenleixingServiceImpl extends ServiceImpl<BumenleixingDao, BumenleixingEntity> implements BumenleixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BumenleixingEntity> page = this.selectPage(
                new Query<BumenleixingEntity>(params).getPage(),
                new EntityWrapper<BumenleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BumenleixingEntity> wrapper) {
		  Page<BumenleixingView> page =new Query<BumenleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BumenleixingVO> selectListVO(Wrapper<BumenleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BumenleixingVO selectVO(Wrapper<BumenleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BumenleixingView> selectListView(Wrapper<BumenleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BumenleixingView selectView(Wrapper<BumenleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

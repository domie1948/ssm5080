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


import com.dao.GongzichaxunDao;
import com.entity.GongzichaxunEntity;
import com.service.GongzichaxunService;
import com.entity.vo.GongzichaxunVO;
import com.entity.view.GongzichaxunView;

@Service("gongzichaxunService")
public class GongzichaxunServiceImpl extends ServiceImpl<GongzichaxunDao, GongzichaxunEntity> implements GongzichaxunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzichaxunEntity> page = this.selectPage(
                new Query<GongzichaxunEntity>(params).getPage(),
                new EntityWrapper<GongzichaxunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzichaxunEntity> wrapper) {
		  Page<GongzichaxunView> page =new Query<GongzichaxunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzichaxunVO> selectListVO(Wrapper<GongzichaxunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzichaxunVO selectVO(Wrapper<GongzichaxunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzichaxunView> selectListView(Wrapper<GongzichaxunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzichaxunView selectView(Wrapper<GongzichaxunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

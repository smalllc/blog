package com.smallcc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smallcc.mapper.BlogMapper;
import com.smallcc.mapper.BlogerMapper;
import com.smallcc.model.Bloger;
import com.smallcc.service.BlogerService;
@Service
public class BlogerServiceImpl implements BlogerService {


	@Autowired
	private BlogerMapper blogerMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return blogerMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Bloger record) {
		// TODO Auto-generated method stub
		return blogerMapper.insert(record);
	}

	@Override
	public int insertSelective(Bloger record) {
		// TODO Auto-generated method stub
		return blogerMapper.insertSelective(record);
	}

	@Override
	public Bloger selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return blogerMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Bloger record) {
		// TODO Auto-generated method stub
		return blogerMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Bloger record) {
		// TODO Auto-generated method stub
		return blogerMapper.updateByPrimaryKey(record);
	}

	@Override
	public Bloger findUserByLoginName(String name) {
		// TODO Auto-generated method stub
		return blogerMapper.findUserByLoginName(name);
	}

}

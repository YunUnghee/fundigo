package com.fundigo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundigo.domain.BoardVO;
import com.fundigo.mapper.loginMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class loginServiceImp implements loginService {
	
	@Setter(onMethod_= @Autowired)
	private loginMapper mapper;
	
	@Override
	public List<BoardVO> getList() {
		log.info("getList: ");
		return null;
	}
	
	@Override
	public void insert(BoardVO board) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void select(BoardVO board) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String update(BoardVO board) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

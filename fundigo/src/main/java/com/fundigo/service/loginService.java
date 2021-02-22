package com.fundigo.service;

import java.util.List;

import com.fundigo.domain.BoardVO;

public interface loginService {
	public List<BoardVO> getList();

	public void insert(BoardVO board);

	public void select(BoardVO board);

	public String update(BoardVO board);

	public String delete(String id);
}
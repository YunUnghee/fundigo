package com.fundigo.mapper;

import java.util.List;

import com.fundigo.domain.BoardVO;

public interface BoardMapper {
//	리스트 조회, 질문, 커뮤니티, 공지
	public List<BoardVO> getFAQList();
	public List<BoardVO> getCOMMList();
	public List<BoardVO> getNOTIList();
	
//	게시글 1개에 대한 조회
	public List<BoardVO> selectOne();

// insertSelectKey
	public void insertSelectkey(BoardVO board);
	
//	게시글 작성 질문, 커뮤니티, 공지
	public void FAQinsert(BoardVO board);
	public void COMMinsert(BoardVO board);
	public void NOTIinsert(BoardVO board);
// 	
	public void FAQinsertSelectKey(BoardVO board);
	public void COMMinsertSelectKey(BoardVO board);
	public void NOTIinsertSelectKey(BoardVO board);

// 게시글 상세 보기
	public BoardVO selectOne(Long bno);

//	게시글 삭제
	public int delete(Long bno);
	
// 게시글 수정
	public int update(BoardVO board);
	public int countup(BoardVO board);
	public int updateDate(BoardVO board);
}

//수정일자 수정
	

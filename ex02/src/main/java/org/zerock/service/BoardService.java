package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.RankVO;

public interface BoardService {
	//랭킹보기
	public List<RankVO> rank();
	
	//글등록
	public void register(BoardVO vo);
	
	//글상세보기
	public BoardVO get(Long bno);
	
	//글수정
	public boolean modify(BoardVO vo);
	
	//글삭제
	public boolean remove(Long bno);
	
	//목록보기
	public List<BoardVO> getList(Criteria cri);
	
	//퀴즈
	public Long count(Criteria cri);
}





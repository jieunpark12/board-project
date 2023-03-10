package org.study.service;

import java.util.List;

import org.study.domain.BoardAttachVO;
import org.study.domain.BoardVO;
import org.study.domain.Criteria;

public interface BoardService {
	public void register(BoardVO board);

	public BoardVO get(Long bno);
	
	public boolean modify(BoardVO board);
	
	public boolean remove(Long bno);
	
	public List<BoardVO> getList(Criteria cri);
	
	public int getTotal(Criteria cri);
	
	public List<BoardAttachVO> getAttachList(Long bno);
}

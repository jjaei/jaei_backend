package com.it.example.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.it.example.beans.vo.Criteria;
import com.it.example.beans.vo.ReplyVO;

@Mapper
public interface ReplyMapper {
	// 댓글 등록
	public int insert(ReplyVO reply);
	
	// 댓글 1개 조회
	public ReplyVO read(Long rno);
	
	// 댓글 삭제
	public int delete(Long rno);
	
	// 댓글 수정
	public int update(ReplyVO reply);
	
	// 댓글 목록
	public List<ReplyVO> getListWithPaging(@Param("cri") Criteria cir, @Param("bno") Long bno);
}

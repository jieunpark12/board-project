package org.study.mapper;

import org.apache.ibatis.annotations.Insert;

public interface Sample1Mapper {
	@Insert("insert into study_tbl_sample1 (col1) values (#{data})")
	public int insertCol1(String data);
}

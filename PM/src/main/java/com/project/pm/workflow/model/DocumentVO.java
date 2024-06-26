package com.project.pm.workflow.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class DocumentVO {
	private int doc_no; 				// 문서번호                 
	private String fk_writer_empno; 		// 문서작성 사운번호       
	private String doc_subject;         //문서제목
	private String doc_contents;        // 문서내용
	private String writeday;              //  작성일자
	private String modificationday;       // 최근 수정 날짜
	private String icon;                  // 아이콘
	private String fileName;   			// WAS(톰캣)에 저장될 파일명(2022042911123035243254235235234.png) 
	private String orgFilename; 		// 진짜 파일명(강아지.png)  // 사용자가 파일을 업로드 하거나 파일을 다운로드 할때 사용되어지는 파일명
	private String fileSize; 		// 파일크기 
	private String D_day;        //희망 마감날짜
	
	private String deptno; // 부서 번호
	private String name; //작성자 이름
	private String contents; // 히스토리 테이블 내용
	
	/*
	=== #152. 파일을 첨부하도록 VO 수정하기
             먼저, 오라클에서 tbl_board 테이블에 3개 컬럼(fileName, orgFilename, fileSize)을 추가한 다음에 아래의 작업을 한다. 
	 */
	 private MultipartFile attach;
	 /* form 태그에서 type="file" 인 파일을 받아서 저장되는 필드이다. 
	       진짜파일 ==> WAS(톰캣) 디스크에 저장됨.
	           조심할것은 MultipartFile attach 는 오라클 데이터베이스 tbl_board 테이블의 컬럼이 아니다.   
	    /Board/src/main/webapp/WEB-INF/views/tiles1/board/add.jsp 파일에서 input type="file" 인 name 의 이름(attach)과  
	      동일해야만 파일첨부가 가능해진다.!!!!
	*/
}
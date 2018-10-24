package kr.co.android.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kr.co.android.domain.Item;

//리턴 타입은 보통의 경우 Dao 메소드와 일치
//매개 변수는 제일 쉽게 하는 방법은 HttpServletRequest
//파일이 있을 때는 앞에 Multipart 

public interface ItemService {
	public List<Item> listItem(HttpServletRequest request);
	public Item getItem(HttpServletRequest request);

}

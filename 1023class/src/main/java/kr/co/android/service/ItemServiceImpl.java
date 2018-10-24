package kr.co.android.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.android.dao.ItemDAO;
import kr.co.android.domain.Item;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemDAO itemDao;
	
	

	@Override
	public List<Item> listItem(HttpServletRequest request) {
		return itemDao.listItem();
	}

	@Override
	public Item getItem(HttpServletRequest request) {
		
		//내가 준 파라미터를 가져오기 
		String itemid = request.getParameter("itemid");
		
		//파라미터를 정수로 변환해서 Dao 메소드에게 전달 
		return itemDao.getItem(Integer.parseInt(itemid));
	}

}




package kr.co.android;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.android.domain.Item;
import kr.co.android.service.ItemService;


@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	//url은 모두 소문자로 한다.
	@RequestMapping(value="listitem", method=RequestMethod.GET)
	public List<Item> listItem(HttpServletRequest request){
		return itemService.listItem(request);
	}
	
	@RequestMapping(value="getitem", method=RequestMethod.GET)
	public Item getItem(HttpServletRequest request){
		return itemService.getItem(request);
	}

}

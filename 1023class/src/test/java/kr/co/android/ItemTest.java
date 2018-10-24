package kr.co.android;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.android.dao.ItemDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
// 모든 sql 받아 올수 있는지 테스트



public class ItemTest {
	@Autowired
	private SqlSession sqlSession;
	
	
	@Autowired
	private ItemDAO itemDao;
	
	
	@Test
	public void connectTest() {
		//System.out.println(sqlSession.selectList("item.listItem"));
		//System.out.println(sqlSession.selectList("item.getItem",0));
		//System.out.println(sqlSession.selectOne("item.getItem",1)+""); // 문자열 만들기 
		
		
		//ItemDAO.java 테스트 용 
		System.out.println(itemDao);
		System.out.println(itemDao.listItem());
		System.out.println(itemDao.getItem(2));
		
	}

}

package rent;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.yc.bean.Street;
import com.yc.biz.DistrictBiz;
import com.yc.dao.HouseDao;

@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath*:application.xml","classpath*:application-dao.xml"})
@WebAppConfiguration("src/main/resources") 
public class TestImpl {

	@Resource(name="districtBizImpl")
	private DistrictBiz districtBiz;
	
	@Resource(name="houseDaoImpl")
	private HouseDao houseDao;
	
	@Test
	public void test(){
		List<Street> list=districtBiz.getStreetByDistrictId(1004);
		System.out.println(list);
	}
	
	@Test
	public void test2(){
		int i=houseDao.getTotal();
		System.out.println(i);
	}
}

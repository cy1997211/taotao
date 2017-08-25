package itemtest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import com.taotao.service.impl.ItemServiceImpl;

public class ItemTest {

	@Autowired
	private ItemService im;
	
	@Test
	public void test() {
		TbItem i = im.getItemById(222);
		System.out.println(i);
	}

}

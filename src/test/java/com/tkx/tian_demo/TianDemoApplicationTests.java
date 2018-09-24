package com.tkx.tian_demo;

import com.tkx.tian_demo.models.SellerFreeze;
import com.tkx.tian_demo.repository.dev.SellerFreezeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TianDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private SellerFreezeRepository sellerFreezeRepository;

	@Test
	public void testAddRecord(){
        sellerFreezeRepository.createRecord();
		List<SellerFreeze> res = sellerFreezeRepository.findAll();
		for (SellerFreeze sellerFreeze: res){
			System.out.println(sellerFreeze);
		}

	}


}

package com.entelgy.springboot.app.models.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.entelgy.springboot.app.models.PostNew;

@SpringBootTest
public class PostServiceImplTest {

	@Test
	public void test() {

		System.out.println("Se ejecuta");

		PostNew po = new PostNew(1, 1, "ronald152515@gmail.com");

		List<PostNew> lista = new ArrayList<PostNew>();

		lista.add(po);

		assertEquals(1, lista.size());

	}

}

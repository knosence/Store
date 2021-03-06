package bootcamp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import bootcamp.dao.ProductDao;
import bootcamp.model.products.Product;

@Component
public class ProductService {
	 private static final Logger log = LoggerFactory.getLogger(ProductService.class);

	 @Autowired
	 private SimpleDateFormat dateFormat;
	 
	@Autowired
	private ProductDao dao;

	public Product getProductById(Integer id) {
		return dao.getProductById(id);
	}
	

	
	public List<Product> getProducts() {
		return dao.getProducts();
	}

}

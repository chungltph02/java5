package java5.sof2021.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java5.sof2021.bean.ProductModel;
import java5.sof2021.entities.Product;

@Service
public class Productmapper {
	@Autowired
	private ModelMapper mapper;
		public Product toEntity( ProductModel acmodel) {
			Product entity =mapper.map(acmodel,Product.class);
			return entity;
		}
		public ProductModel toModel(Product entity) {
			ProductModel acmodel=mapper.map(entity,ProductModel.class);
			return acmodel;
		}
}

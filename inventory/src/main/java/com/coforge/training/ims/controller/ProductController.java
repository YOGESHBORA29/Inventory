package com.coforge.training.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.training.ims.model.Product;
import com.coforge.training.ims.service.ProductService;

@Controller
public class ProductController {
 @Autowired
	private ProductService pService;
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
	Product product = new Product();
	model.addAttribute("product", product);



	return "Product_new";
}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
	pService.save(product);

	return "redirect:product";
	}
	@RequestMapping("/product")
	public String viewProductsPage(Model model) {
	List<Product> listProducts = pService.listAll();//Invokes FindAll CrudRepositary
	model.addAttribute("listProducts", listProducts);

	return "product";
	}
	@RequestMapping("/edit")
	public ModelAndView showEditProductPage(@RequestParam("id") int id) {
	ModelAndView mav = new ModelAndView("edit_product");
	Product product = pService.get(id);//Feteches Single Record Based on id 
	mav.addObject("product", product);
	return mav;
	}
	@RequestMapping("/delete")
	public String deleteProduct(@RequestParam("id") int id) {
	pService.delete(id);
	return "redirect:product";
	}


}

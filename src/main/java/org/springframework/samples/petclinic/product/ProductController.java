/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * @author 
 */
@Controller
class ProductController {
	
	//TODO criar atributo para o repositorio
	
	//TODO criar construtor para receber repositorio
	//mantido pelo String

   @GetMapping("/products")
   public String processFindForm(Model model) {
	   //TODO utilizar findAll() do repositorio para
	   //recuperar a lista de produtos
	   ArrayList<Product> productsList = new ArrayList<Product>();
	   model.addAttribute("products", productsList);
	   return "products/productsList";
   }

}

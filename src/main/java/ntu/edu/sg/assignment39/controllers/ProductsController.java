package ntu.edu.sg.assignment39.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductsController {

  @GetMapping("/{id}")
  public String getProduct(@PathVariable int id) {

    if (id >= 4) {
      return "No product found";
    } else if (id == 1) {
      return "This is detail for ID:" + id + " Product Name: Apple ";
    } else if (id == 2) {
      return "This is detail for ID:" + id + " Product Name: Banana ";
    } else if (id == 3) {
      return "This is detail for ID:" + id + " Product Name: Carrot ";
    }

    return null;
  }

}

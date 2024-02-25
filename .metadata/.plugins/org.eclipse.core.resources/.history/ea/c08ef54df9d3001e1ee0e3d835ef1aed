package com.CVDS.LAB5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	private Game game = new Game();
 
 @RequestMapping("/hello")
 private String hello() {
  return "hello";
 }
 
 @RequestMapping("/user/{id}")
 private ModelAndView getUser(@PathVariable Integer id, Model model)   {
  String uri = "https://jsonplaceholder.typicode.com/todos/" + id;
  RestTemplate restTemplate = new RestTemplate();
  
  User user = restTemplate.getForObject(uri, User.class);
  
  ModelAndView modelAndView = new ModelAndView("user");
  modelAndView.addObject("user", user);
  
  
  return modelAndView;
 }
 
 @RequestMapping("/guess")
 private String guess(@RequestParam(name = "numero", required = false) Integer numero, Model model) {
     if (numero != null) {
         int premio = game.verificarNumero(numero); // Verificar el número ingresado por el usuario
         model.addAttribute("premio", premio); // Agregar el premio al modelo
         model.addAttribute("premioActual", game.getPremio()); // Agregar el premio actual al modelo
         model.addAttribute("intentos", game.getIntentos()); // Agregar el número de intentos al modelo
     }
     return "guess";
 }

 
}
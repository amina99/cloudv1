package com.sip.ams.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sip.entities.*;
@Controller
public class FirstController {

@GetMapping("/home")
//@ResponseBody
public String home()
{
//	return "<h1>Hello Spring Boot</h1>";

return "/firstcontroller/home";
}

@GetMapping("/acceuil")
//@ResponseBody
public String acceuil(@RequestParam(required=false,defaultValue="Springboot")String framework,ModelMap monObj)
{
//	return "<h1>Hello Spring Boot</h1>";

String ecole="POLYTECH";
String formation="Spring Boot & Angular";
String ch="Vous avez choisi: "+framework;
monObj.put("ec", ecole);
monObj.put("form", formation);
monObj.put("msg", ch);
return "/firstcontroller/acceuil";
}

@GetMapping("/acceuil2")
//@ResponseBody
public String afficherTab(ModelMap monObj)
{
//	return "<h1>Hello Spring Boot</h1>";

//	String[] tab= {"Hello","Java","OCA","OCP"};
ArrayList<String>names=new ArrayList<>();
names.add("Amine");
names.add("Haythem");
names.add("Amina");

//	monObj.put("t", tab);

monObj.put("names", names);


return "/firstcontroller/acceuil";
}

@GetMapping("/animal")
public String afficherAnimal(ModelMap monObj)
{
//	Animal a=new Animal();
//	a.setNom("Haythem");
//	a.setAge(99);

//	ArrayList<Animal> animals=new ArrayList<Animal>();
//	animals.add(a);
//	monObj.put("animals",animals);
//2methode
ArrayList<Animal> animals2=new ArrayList<Animal>();
animals2.add(new Animal("Lion",22));
animals2.add(new Animal("Lion2",23));
animals2.add(new Animal("Lion3",24));
monObj.put("animals",animals2);
return "/firstcontroller/animal";
}


}

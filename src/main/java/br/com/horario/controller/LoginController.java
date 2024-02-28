package br.com.horario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class LoginController {
	
	@GetMapping("/") // nome que eu escolher
	public String principal()
	{
		 return "principal"; // caminho real do arquivo
	}

	@GetMapping("/principal") // nome que eu escolher
	public String home()
	{
		 return "principal"; // caminho real do arquivo
	}
	
	@GetMapping("/docente") // nome que eu escolher
	public String docente()
	{
		 return "docente"; // caminho real do arquivo
	}

	@GetMapping("docente") // nome que eu escolher
	public String homedocente()
	{
		 return "docente"; // caminho real do arquivo
	}
}

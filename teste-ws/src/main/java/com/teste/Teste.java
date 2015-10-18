package com.teste;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

@Service
@Path("/teste")

public class Teste {

	@GET
	@Path("/{number}")
	@Produces("text/plain")
	public boolean isTestes(@PathParam("number") int bla) {
		if (bla > 10) 
			return true;
		return false;
	}
}

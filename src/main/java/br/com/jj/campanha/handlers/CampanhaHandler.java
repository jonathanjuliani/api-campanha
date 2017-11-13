package br.com.jj.campanha.handlers;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.jj.campanha.commons.Validator;
import br.com.jj.campanha.constants.ConstMessages;
import br.com.jj.campanha.models.Campanha;
import br.com.jj.campanha.models.Error;
import br.com.jj.campanha.repositories.impl.DefaultCampanhaRepository;
import br.com.jj.campanha.services.CampanhaService;
import br.com.jj.campanha.services.impl.DefaultCampanhaService;

@Path("/campanha")
public class CampanhaHandler {
	
	private CampanhaService service;
	
	public CampanhaHandler() {
		this.service = new DefaultCampanhaService(new DefaultCampanhaRepository());
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMsg(String json) {

		try {
			
			Campanha campanha = new Campanha().createFromJSON(json, Campanha.class);

			if (Boolean.FALSE.equals(Validator.isCampanhaEmptyOrNull(campanha))) {

				if (Validator.isCampanhaValid(campanha)) {

					service.include(campanha);
					
					return Response.status(Status.OK.getStatusCode()).entity(campanha).build();
				}
				return Response.status(Status.BAD_REQUEST.getStatusCode()).entity(campanha.getError().toJSON()).build();
			}

			return Response.status(Status.BAD_REQUEST.getStatusCode()).entity(new Error(ConstMessages.CAMPANHA_NAO_INFORMADA).toJSON()).build();

		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR.getStatusCode()).entity(new Error(e.getMessage()).toJSON()).build();
		}

	}

}

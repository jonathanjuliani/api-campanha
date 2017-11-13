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

@Path("/campanha")
public class CampanhaHandler {

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMsg(Campanha campanha) {

		try {

			if (Boolean.FALSE.equals(Validator.isCampanhaEmptyOrNull(campanha))) {

				if (Validator.isCampanhaValid(campanha)) {

					
					return Response.status(Status.OK.getStatusCode()).entity(campanha).build();
				}
				return Response.status(Status.BAD_REQUEST.getStatusCode()).entity(campanha.getError().toJSON()).build();
			}

			return Response.status(Status.BAD_REQUEST.getStatusCode()).entity(new Error(ConstMessages.CAMPANHA_NAO_INFORMADA).toJSON()).build();

		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR.getStatusCode()).entity(e.getCause().getMessage()).build();
		}

	}

}

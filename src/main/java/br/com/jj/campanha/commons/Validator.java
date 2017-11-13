package br.com.jj.campanha.commons;

import br.com.jj.campanha.constants.ConstMessages;
import br.com.jj.campanha.models.Campanha;
import br.com.jj.campanha.models.Error;

public class Validator {

	private Validator() {
		// private constructor to hide the public one
	}

	public static Boolean isCampanhaEmptyOrNull(Campanha campanha) {

		if (null == campanha) {
			return true;
		}

		return false;
	}

	public static Boolean isCampanhaValid(Campanha campanha) {

		if (isCampanhaNameValid(campanha) && isCampanhaTimeValid(campanha) && isCampanhaDataValid(campanha)) {
			return true;
		}

		return false;
	}

	private static boolean isCampanhaNameValid(Campanha campanha) {

		if (null != campanha.getNome() && (!"".equals(campanha.getNome()))) {
			return true;
		}

		campanha.setError(new Error(ConstMessages.NOME_CAMPANHA_NAO_INFORMADO));
		return false;
	}

	private static boolean isCampanhaTimeValid(Campanha campanha) {

		if (null != campanha.getTime() && (!"".equals(campanha.getTime()))) {
			return true;
		}

		campanha.setError(new Error(ConstMessages.TIME_CAMPANHA_NAO_INFORMADO));
		return false;
	}

	private static boolean isCampanhaDataValid(Campanha campanha) {

		if (null != campanha.getDataVigencia() && (!"".equals(campanha.getDataVigencia()))) {
			return true;
		}

		campanha.setError(new Error(ConstMessages.DATA_VIG_CAMPANHA_NAO_INFORMADA));
		return false;
	}

}

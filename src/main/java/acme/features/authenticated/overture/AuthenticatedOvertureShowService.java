
package acme.features.authenticated.overture;

import acme.entities.overtures.Overture;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

public class AuthenticatedOvertureShowService implements AbstractShowService<Authenticated, Overture> {

	@Override
	public boolean authorise(final Request<Overture> request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void unbind(final Request<Overture> request, final Overture entity, final Model model) {
		// TODO Auto-generated method stub

	}

	@Override
	public Overture findOne(final Request<Overture> request) {
		// TODO Auto-generated method stub
		return null;
	}

}

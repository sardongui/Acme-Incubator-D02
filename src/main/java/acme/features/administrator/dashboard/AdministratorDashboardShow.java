
package acme.features.administrator.dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.forms.Dashboard;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractShowService;

@Service
public class AdministratorDashboardShow implements AbstractShowService<Administrator, Dashboard> {

	@Autowired
	AdministratorDashboardRepository repository;


	@Override
	public boolean authorise(final Request<Dashboard> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Dashboard> request, final Dashboard entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "numberNotices", "numberTechnologies", "minMoneyActiveInquiries", "maxMoneyActiveInquiries", "averageMoneyActiveInquiries", "stddevMoneyActiveInquiries", "minMoneyActiveOvertures", "maxMoneyActiveOvertures",
			"averageMoneyActiveOvertures", "stddevMoneyActiveOvertures");
	}

	@Override
	public Dashboard findOne(final Request<Dashboard> request) {

		assert request != null;

		Dashboard res = new Dashboard();

		Integer numNot = this.repository.numberNotices();
		res.setNumberNotices(numNot);
		Integer numTech = this.repository.numberTechnologies();
		res.setNumberTechnologies(numTech);
		Integer numToo = this.repository.numberTools();
		res.setNumberTools(numToo);
		Double minMonInq = this.repository.minMoneyActiveInquiries();
		res.setMinMoneyActiveInquiries(minMonInq);
		Double maxMonInq = this.repository.maxMoneyActiveInquiries();
		res.setMaxMoneyActiveInquiries(maxMonInq);
		Double avgMonInq = this.repository.avgMoneyActiveInquiries();
		res.setAverageMoneyActiveInquiries(avgMonInq);
		Double stdMoneyInq = this.repository.stddevMoneyActiveInquiries();
		res.setStddevMoneyActiveInquiries(stdMoneyInq);
		Double minMonOver = this.repository.minMoneyActiveOvertures();
		res.setMinMoneyActiveOvertures(minMonOver);
		Double maxMonOver = this.repository.maxMoneyActiveOvertures();
		res.setMaxMoneyActiveOvertures(maxMonOver);
		Double avgMonOver = this.repository.avgMoneyActiveOvertures();
		res.setAverageMoneyActiveOvertures(avgMonOver);
		Double stdMonOver = this.repository.stddevMoneyActiveOvertures();
		res.setStddevMoneyActiveOvertures(stdMonOver);

		return res;

	}

}

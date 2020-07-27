
package acme.features.administrator.dashboard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.inquires.Inquire;
import acme.entities.overtures.Overture;
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

		request.unbind(entity, model, "numberNotices", "numberTechnologies", "numberTools", "minMoneyActiveInquires", "maxMoneyActiveInquires", "averageMoneyActiveInquires", "stddevMoneyActiveInquires", "minMoneyActiveOvertures", "maxMoneyActiveOvertures",
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
		Double minMonInq = this.repository.minMoneyActiveInquires();
		res.setMinMoneyActiveInquires(minMonInq);
		Double maxMonInq = this.repository.maxMoneyActiveInquires();
		res.setMaxMoneyActiveInquires(maxMonInq);
		Double avgMonInq = this.repository.avgMoneyActiveInquires();
		res.setAverageMoneyActiveInquires(avgMonInq);
		//STDDEV OVERTURE
		Collection<Inquire> stdMonInq = this.repository.stddevMoneyActiveInquires();
		List<Inquire> inqs = (List<Inquire>) stdMonInq;
		List<Double> maxAndMinI = new ArrayList<Double>();
		for (int i = 0; i < stdMonInq.size(); i++) {
			maxAndMinI.add(inqs.get(i).getMinMoney().getAmount());
			maxAndMinI.add(inqs.get(i).getMaxMoney().getAmount());
		}
		Double stddevInq = AdministratorDashboardShow.stdev(maxAndMinI, avgMonInq);
		res.setStddevMoneyActiveInquires(stddevInq);
		//
		Double minMonOver = this.repository.minMoneyActiveOvertures();
		res.setMinMoneyActiveOvertures(minMonOver);
		Double maxMonOver = this.repository.maxMoneyActiveOvertures();
		res.setMaxMoneyActiveOvertures(maxMonOver);
		Double avgMonOver = this.repository.avgMoneyActiveOvertures();
		res.setAverageMoneyActiveOvertures(avgMonOver);
		//STDDEV OVERTURE
		Collection<Overture> stdMonOver = this.repository.stddevMoneyActiveOvertures();
		List<Overture> overs = (List<Overture>) stdMonOver;
		List<Double> maxAndMinO = new ArrayList<Double>();
		for (int i = 0; i < stdMonOver.size(); i++) {
			maxAndMinO.add(overs.get(i).getMinMoney().getAmount());
			maxAndMinO.add(overs.get(i).getMaxMoney().getAmount());
		}
		Double stddevOver = AdministratorDashboardShow.stdev(maxAndMinO, avgMonOver);
		res.setStddevMoneyActiveOvertures(stddevOver);
		return res;
	}

	public static double stdev(final List<Double> list, final Double mean) {
		double num = 0.0;
		double numi = 0.0;
		for (Double i : list) {
			numi = Math.pow(i - mean, 2);
			num += numi;
		}
		return Math.sqrt(num / list.size());
	}

}

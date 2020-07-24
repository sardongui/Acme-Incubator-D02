
package acme.features.administrator.dashboard;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.inquires.Inquire;
import acme.entities.overtures.Overture;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorDashboardRepository extends AbstractRepository {

	@Query("select count(n) from Notice n")
	Integer numberNotices();

	@Query("select count(t) from Technology t")
	Integer numberTechnologies();

	@Query("select count(r) from ToolRecord r")
	Integer numberTools();

	@Query("select min (minMoney.amount) from Inquire where endDate>CURRENT_TIMESTAMP")
	Double minMoneyActiveInquires();

	@Query("select max (maxMoney.amount) from Inquire where endDate>CURRENT_TIMESTAMP")
	Double maxMoneyActiveInquires();

	@Query("select avg ((max_money_amount + min_money_amount)/2) from Inquire where endDate>CURRENT_TIMESTAMP")
	Double avgMoneyActiveInquires();

	@Query("select o from Inquire o where endDate>CURRENT_TIMESTAMP")
	Collection<Inquire> stddevMoneyActiveInquires();

	@Query("select min (minMoney.amount) from Overture where deadline>CURRENT_TIMESTAMP")
	Double minMoneyActiveOvertures();

	@Query("select max (maxMoney.amount) from Overture where deadline>CURRENT_TIMESTAMP")
	Double maxMoneyActiveOvertures();

	@Query("select avg ((max_money_amount + min_money_amount)/2) from Overture where deadline>CURRENT_TIMESTAMP")
	Double avgMoneyActiveOvertures();

	@Query("select o from Overture o where deadline>CURRENT_TIMESTAMP")
	Collection<Overture> stddevMoneyActiveOvertures();
}

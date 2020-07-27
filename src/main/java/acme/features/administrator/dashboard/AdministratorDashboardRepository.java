
package acme.features.administrator.dashboard;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorDashboardRepository extends AbstractRepository {

	@Query("select count(n) from Notice n")
	Integer numberNotices();

	@Query("select count(t) from Technology t")
	Integer numberTechnologies();

	@Query("select count(tr) from ToolRecord tr")
	Integer numberTools();

	@Query("select min (minMoney.amount) from Inquirie where endDate>CURRENT_TIMESTAMP")
	Double minMoneyActiveInquiries();

	@Query("select max (maxMoney.amount) from Inquirie where endDate>CURRENT_TIMESTAMP")
	Double maxMoneyActiveInquiries();

	@Query("select avg ((max_money_amount + min_money_amount)/2) from Inquirie where endDate>CURRENT_TIMESTAMP")
	Double avgMoneyActiveInquiries();

	@Query("select stddev((max_money_amount + min_money_amount)) from Inquirie where endDate>CURRENT_TIMESTAMP")
	Double stddevMoneyActiveInquiries();

	@Query("select min (minMoney.amount) from Overture where deadline>CURRENT_TIMESTAMP")
	Double minMoneyActiveOvertures();

	@Query("select max (maxMoney.amount) from Overture where deadline>CURRENT_TIMESTAMP")
	Double maxMoneyActiveOvertures();

	@Query("select avg ((max_money_amount + min_money_amount)/2) from Overture where deadline>CURRENT_TIMESTAMP")
	Double avgMoneyActiveOvertures();

	@Query("select stddev((max_money_amount + min_money_amount)) from Overture where deadline>CURRENT_TIMESTAMP")
	Double stddevMoneyActiveOvertures();
}

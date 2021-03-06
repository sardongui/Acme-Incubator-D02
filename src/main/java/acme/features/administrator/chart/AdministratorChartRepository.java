
package acme.features.administrator.chart;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorChartRepository extends AbstractRepository {

	@Query("select c.activitySector,count(c) FROM Technology c group by c.activitySector order by c.activitySector")
	Object[] findTechnologiesSector();


	@Query("select c.sector,count(c) FROM ToolRecord c group by c.sector order by c.sector")
	Object[] findToolsSector();


	@Query("select j.indication,count(j) FROM Technology j group by j.indication order by j.indication")
	Object[] findTechnologiesStatus();


	@Query("select a.indication,count(a) FROM ToolRecord a group by a.indication order by a.indication")
	Object[] findToolsStatus();


}

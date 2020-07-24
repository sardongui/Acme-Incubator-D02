
package acme.forms;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dashboard implements Serializable {

	/**
	 *
	 */
	private static final long	serialVersionUID	= 1L;

	Integer						numberNotices;

	Integer						numberTechnologies;

	Integer						numberTools;

	Double						minMoneyActiveInquires;

	Double						maxMoneyActiveInquires;

	Double						averageMoneyActiveInquires;

	Double						stddevMoneyActiveInquires;

	Double						minMoneyActiveOvertures;

	Double						maxMoneyActiveOvertures;

	Double						averageMoneyActiveOvertures;

	Double						stddevMoneyActiveOvertures;

}

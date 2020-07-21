
package acme.entities.creditCards;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Range;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CreditCard extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				holderName;

	@NotBlank
	@CreditCardNumber
	private String				number;

	@NotBlank
	private String				brand;

	@NotNull
	@Range(min = 1, max = 12)
	private Integer				monthExpiration;

	@NotNull
	private Integer				yearExpiration;

	@NotNull
	@Pattern(regexp = "^[0-9]{3}$", message = "{administrator.creditCard.ccv.pattern}")
	private Integer				cvv;

}

package acme.entities.toolRecords;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ToolRecord extends DomainEntity {
	
	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				title;
	
	@NotBlank
	private String				sector;
	
	@NotBlank
	private String				inventor;
	
	@NotBlank
	private String				description;
	
	@NotBlank
	@URL
	private String				web;
	
	@Email
	@NotEmpty
	private String				email;
	
	private boolean				openSoruce;
	
	@Range(min = -5, max = 5)
	private Integer				stars;

}

package rc.hc.customvalidations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import rc.hc.dto.RtaUserdetailsDto;

public class BplCardValidation implements ConstraintValidator<BplConstraint, RtaUserdetailsDto> {

	public boolean isValid(RtaUserdetailsDto rtaUserdetailsDto, ConstraintValidatorContext context) {
		if(rtaUserdetailsDto.getBpl()==1) {
			if(rtaUserdetailsDto.getBplNo()==null || rtaUserdetailsDto.getBplCard()==null) {
				return false;
			}
		}
		return true;
	}





}

package rc.hc.customvalidations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(value = {ElementType.FIELD,ElementType.ANNOTATION_TYPE} )
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = BplCardValidation.class)
@Documented
public @interface BplConstraint {

	    Class<?>[] groups() default {};

	    Class<? extends Payload>[] payload() default {};

	    String[] value();
	    String message() default "Sorry, fields does not match";
}

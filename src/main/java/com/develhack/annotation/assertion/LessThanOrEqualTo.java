package com.develhack.annotation.assertion;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Asserts that the value must be less than or equal to the threshold.
 */
@Documented
@Target({ ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface LessThanOrEqualTo {

	/** string representation of threshold */
	String value();
}

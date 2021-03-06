/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.test.internal.engine.methodvalidation.cascadedgroupvalidation;

import javax.validation.constraints.NotNull;

/**
 * @author Jan-Willem Willebrands
 */
public class Entity {
	@NotNull(groups = ValidationGroup1.class)
	String value1;

	@NotNull(groups = ValidationGroup2.class)
	String value2;

	public Entity(String value1, String value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
}

/*
 * Hammurapi
 * Automated Java code review system. 
 * Copyright (C) 2004  Hammurapi Group
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * URL: http://www.hammurapi.org
 * e-Mail: support@hammurapi.biz

 */
package org.hammurapi.inspectors;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.hammurapi.InspectorBase;

import com.pavelvlasov.jsel.VariableDefinition;


/**
 * ER-091
 * Avoid using "public static final" array fields
 * @author  Janos Czako
 * @version $Revision: 1.2 $
 */
public class PublicStaticArrayFieldsRule extends InspectorBase  {
	
	private static final Set modifiers;
	
	static {
		HashSet mf=new HashSet();
		mf.add("public");
		mf.add("static");
		mf.add("final");
		modifiers=Collections.unmodifiableSet(mf);
	}
	
	/**
	 * Reviews the type definitions, if they have public static final
	 * array attributes.
	 * 
	 * @param element the type to be reviewed.
	 */
	public void visit(VariableDefinition element) {
		if (element.getModifiers().containsAll(modifiers) && element.getTypeSpecification().getDimensions()>0) {
			context.reportViolation(element);
		}
	}
	
}
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
package org.hammurapi.inspectors.testcases.fixes;

/**
 * BooleanEqualityRule
 * @author  Pavel Vlasov
 * @version $Revision: 1.1 $
 */
public class BooleanEqualityRuleFixTestCase {
	private static org.apache.log4j.Logger logger =
		org.apache.log4j.Logger.getRootLogger();

	private static final String TXT1 = "ASDF";
	private static final String TXT2 = "QWERT";
	private static final int RETVAL1 = 0;
	private static final int RETVAL2 = 1;
	private static final int RETVAL3 = 2;

	/** Java doc automaticaly generated by Hammurapi */
	public int checkStr(final String strToCheck) {

		//  --- FIX ---
		if (strToCheck.equalsIgnoreCase(TXT1)) {
			return RETVAL1;

			//  --- FIX ---
		} else if (strToCheck.equalsIgnoreCase(TXT2)) {
			return RETVAL2;
		} else {
			return RETVAL3;
		}
	}
}


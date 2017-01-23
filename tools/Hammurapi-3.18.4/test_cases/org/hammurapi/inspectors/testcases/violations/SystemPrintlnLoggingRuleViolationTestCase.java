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
package org.hammurapi.inspectors.testcases.violations;

/**
 * SystemPrintlnLoggingRule
 * @author  Pavel Vlasov
 * @version $Revision: 1.1 $
 */
public class SystemPrintlnLoggingRuleViolationTestCase {

	private static org.apache.log4j.Logger logger =
		org.apache.log4j.Logger.getRootLogger();


	private static final int LOOP_CONST = 10;
	private static final char CHAR_A = 'A';
	private static final String TRACE_1 = "strToProc == null";
	private static final String TRACE_2 = "strToProc.length() == 0";
	private static final String TRACE_3 = "else";

	private Integer intVal;

	/** Java doc automaticaly generated by Hammurapi */
	public void procString(final String strToProc) {
		if (strToProc == null) {

			// --- VIOLATION ---
			System.out.println(TRACE_1);
			
			int c = 0;
			
			for (int i = 0; i < LOOP_CONST; i++) {
				c += i;
			}
			
			intVal = new Integer(c);
		}
		else if (strToProc.length() == 0) {

			// --- VIOLATION ---
			System.out.println(TRACE_2);
			
			intVal = new Integer(0);
		}
		else {

			// --- VIOLATION ---
			System.out.println(TRACE_3);
			
			int a = 0;
			int c = 0;
			
			while (a < strToProc.length()) {
				if (strToProc.charAt(a)==CHAR_A) {
					c++;
				}
				a++;
			}

			intVal = new Integer(c);
		}
	}
}

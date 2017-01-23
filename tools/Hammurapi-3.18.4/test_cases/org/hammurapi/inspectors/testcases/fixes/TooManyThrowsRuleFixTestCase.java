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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;

import org.hammurapi.inspectors.testcases.HammurapiTestCasesException;

/**
 * TooManyThrowsRule
 * @author  Pavel Vlasov
 * @version $Revision: 1.1 $
 */
public class TooManyThrowsRuleFixTestCase implements Serializable {

	private static org.apache.log4j.Logger logger =
		org.apache.log4j.Logger.getRootLogger();

	private static final String SERIALIZATION_ERROR = 
		"Error when serializing. ";
		
	/** Java doc automaticaly generated by Hammurapi */
	public static TooManyThrowsRuleFixTestCase readIn(final String fName)
	// --- FIX ---
		throws HammurapiTestCasesException { 

		TooManyThrowsRuleFixTestCase obj = null;
		try {
			InputStream is = new FileInputStream(fName);
			ObjectInputStream ois = new ObjectInputStream(is);
			obj = (TooManyThrowsRuleFixTestCase) ois.readObject();
		} catch (FileNotFoundException e) {
			logger.error(SERIALIZATION_ERROR + e.getMessage());
			throw new HammurapiTestCasesException(e);
		} catch (ClassNotFoundException e) {
			logger.error(SERIALIZATION_ERROR + e.getMessage());
			throw new HammurapiTestCasesException(e);
		} catch (StreamCorruptedException e) {
			logger.error(SERIALIZATION_ERROR + e.getMessage());
			throw new HammurapiTestCasesException(e);
		} catch (IOException e) {
			logger.error(SERIALIZATION_ERROR + e.getMessage());
			throw new HammurapiTestCasesException(e);
		}

		return obj;
	}
}


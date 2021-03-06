/*******************************************************************************
 * Copyright (c) 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.equinox.http.servlet.tests.tb1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.eclipse.equinox.http.servlet.tests.tb.AbstractTestServlet;

/*
 * This servlet is registered with the HttpService via the immediate DS
 * component OSGI-INF/testServlet2_component.xml.
 */
public class TestServlet2 extends AbstractTestServlet {
	private static final long serialVersionUID = 1L;

	private int getEffectiveMajorVersion() {
		ServletContext context = getServletContext();
		return context.getEffectiveMajorVersion(); // This is a Servlet 3.0 API.
		
	}

	protected void handleDoGet(HttpServletRequest request, PrintWriter writer) throws ServletException, IOException {
		int version = getEffectiveMajorVersion();
		writer.print(version);
	}
}

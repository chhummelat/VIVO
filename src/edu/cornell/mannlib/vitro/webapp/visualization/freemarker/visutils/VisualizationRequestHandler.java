/* $This file is distributed under the terms of the license in /doc/license.txt$ */
package edu.cornell.mannlib.vitro.webapp.visualization.freemarker.visutils;

import org.apache.commons.logging.Log;

import com.hp.hpl.jena.query.DataSource;

import edu.cornell.mannlib.vitro.webapp.controller.VitroRequest;
import edu.cornell.mannlib.vitro.webapp.controller.freemarker.responsevalues.ResponseValues;

/**
 * This interface is being implemented by all the visualization request handlers like
 * PersonLevelRequestHandler, PersonPublicationCountRequestHandler, UtilitiesRequestHandler
 * etc. All the future visualizations <b>must</b> implement this because the ability of 
 * a visualization to be served to the users is dependent on it. We have implemented 
 * dependency injection mechanism & one of the conditions that is used to enable a visualization 
 * handler is its implementation of VisualizationRequestHandler.
 * 
 * @author cdtank
 */
public interface VisualizationRequestHandler{

	ResponseValues generateVisualization(VitroRequest vitroRequest,
							   Log log, 
							   DataSource dataSource);
	
}

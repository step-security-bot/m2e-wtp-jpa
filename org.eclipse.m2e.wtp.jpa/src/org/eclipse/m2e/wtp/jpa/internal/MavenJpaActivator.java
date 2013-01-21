/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Fred Bricon (Red Hat, Inc.) - initial API and implementation
 ************************************************************************************/
package org.eclipse.m2e.wtp.jpa.internal;

import org.eclipse.m2e.wtp.jpa.PlatformIdentifierManager;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * 
 * @author Fred Bricon
 */
public class MavenJpaActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.m2e.wtp.jpa"; //$NON-NLS-1$

	// The shared instance
	private static MavenJpaActivator plugin;
	
	private PlatformIdentifierManager platformIdentifierManager;
	
	public PlatformIdentifierManager getPlatformIdentifierManager() {
		return platformIdentifierManager;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		platformIdentifierManager = new PlatformIdentifierManager();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		platformIdentifierManager = null;
		super.stop(context);
	}

	/**
	 * @return the shared instance
	 */
	public static MavenJpaActivator getDefault() {
		return plugin;
	}

}

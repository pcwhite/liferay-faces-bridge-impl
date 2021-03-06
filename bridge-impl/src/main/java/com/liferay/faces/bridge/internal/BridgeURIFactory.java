/**
 * Copyright (c) 2000-2017 Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.faces.bridge.internal;

import java.net.URISyntaxException;

import javax.faces.FacesWrapper;
import javax.portlet.PortletContext;
import javax.portlet.faces.BridgeFactoryFinder;


/**
 * @author  Neil Griffin
 */
public abstract class BridgeURIFactory implements FacesWrapper<BridgeURIFactory> {

	/**
	 * Returns an instance of {@link BridgeURI} from the {@link BridgeURIFactory} found by the {@link
	 * BridgeFactoryFinder}.
	 */
	public static BridgeURI getBridgeURIInstance(PortletContext portletContext, String namespace, String uri) throws URISyntaxException {

		BridgeURIFactory bridgeURIFactory = (BridgeURIFactory) BridgeFactoryFinder.getFactory(portletContext, BridgeURIFactory.class);

		return bridgeURIFactory.getBridgeURI(namespace, uri);
	}

	public abstract BridgeURI getBridgeURI(String namespace, String uri) throws URISyntaxException;
}
